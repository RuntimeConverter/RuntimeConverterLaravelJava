package com.project.convertedCode.servlets.app.Exceptions;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/app/Exceptions/Handler.php")
public class servlet_Handler_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project.convertedCode.includes.app.Exceptions.file_Handler_php.instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
