package com.project.convertedCode.servlets.vendor.monolog.monolog.src.Monolog.Handler.FingersCrossed;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        "/vendor/monolog/monolog/src/Monolog/Handler/FingersCrossed/ChannelLevelActivationStrategy.php")
public class servlet_ChannelLevelActivationStrategy_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .monolog
                .monolog
                .src
                .Monolog
                .Handler
                .FingersCrossed
                .file_ChannelLevelActivationStrategy_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
