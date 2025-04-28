package com.sentinel.smarter.services;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
// import org.springframework.context.support.ClassPathXmlApplicationContext;
// import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.models.enumerator.JasperEnum;
import com.sentinel.smarter.utilities.PathUtility;

import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;


@Service
@RequiredArgsConstructor
@Configuration
public class JasperGenerator {

    private final JasperExporter jasperExporter;
    // private ClassPathXmlApplicationContext context;

    public byte[] generateReport(JasperEnum type, String path, Map<String, Object> param, JRMapCollectionDataSource source) throws IOException, JRException {
        // context = new ClassPathXmlApplicationContext();
        // Resource resource = context.getResource(path);
        File file = new File(PathUtility.SMARTER_JASPER_REAL_PATH + path);
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, source);
        return jasperExporter.exportJasper(jasperPrint, type);
    }
}
