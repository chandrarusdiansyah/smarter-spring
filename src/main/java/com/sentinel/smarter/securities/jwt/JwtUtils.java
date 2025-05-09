package com.sentinel.smarter.securities.jwt;

import java.security.Key;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.sentinel.smarter.securities.services.UserDetailsImpl;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${security.jwt.secret-key}")
    private String jwtSecret;
   
    @Value("${security.jwt.expiration-time}")
    private int jwtExpirationMs;

    // @Value("${security.jwt.cookie-name}")
    // private String jwtCookie;

    public String generateJwtToken(Authentication authentication) {

        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();
    
        return Jwts.builder()
            .setSubject((userPrincipal.getUsername()))
            .setIssuedAt(new Date())
            .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
            .signWith(key(), SignatureAlgorithm.HS256)
            .compact();
    }

    // public String getJwtFromCookies(HttpServletRequest request) {
    //     Cookie cookie = WebUtils.getCookie(request, jwtCookie);
    //     if (cookie != null) {
    //         return cookie.getValue();
    //     } else {
    //         return null;
    //     }
    // }

    // public ResponseCookie generateJwtCookie(UserDetailsImpl userPrincipal) {
    //     String jwt = generateTokenFromUsername(userPrincipal.getUsername());
    //     ResponseCookie cookie = ResponseCookie.from(jwtCookie, jwt).path("/api").maxAge(24 * 60 * 60).httpOnly(true).build();
    //     return cookie;
    // }

    // public ResponseCookie getCleanJwtCookie() {
    //     ResponseCookie cookie = ResponseCookie.from(jwtCookie, null).path("/api").build();
    //     return cookie;
    // }

    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

    public String getUserNameFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(key()).build()
            .parseClaimsJws(token).getBody().getSubject();
    }
      
    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(key()).build().parse(authToken);
            return true;
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }

        return false;
    }
      
    // public String generateTokenFromUsername(String username) {   
    //     return Jwts.builder()
    //         .setSubject(username)
    //         .setIssuedAt(new Date())
    //         .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
    //         .signWith(key(), SignatureAlgorithm.HS256)
    //         .compact();
    // }

}
