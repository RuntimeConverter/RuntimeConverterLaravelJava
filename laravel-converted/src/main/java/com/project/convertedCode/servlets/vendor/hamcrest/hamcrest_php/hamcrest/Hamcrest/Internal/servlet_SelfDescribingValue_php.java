package com.project.convertedCode.servlets.vendor.hamcrest.hamcrest_php.hamcrest.Hamcrest.Internal;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Internal/SelfDescribingValue.php")
public class servlet_SelfDescribingValue_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .hamcrest
                .hamcrest_php
                .hamcrest
                .Hamcrest
                .Internal
                .file_SelfDescribingValue_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
