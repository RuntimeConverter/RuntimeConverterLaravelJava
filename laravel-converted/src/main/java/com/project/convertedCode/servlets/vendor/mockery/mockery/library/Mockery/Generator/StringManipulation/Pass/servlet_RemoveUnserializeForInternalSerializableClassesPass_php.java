package com.project.convertedCode.servlets.vendor.mockery.mockery.library.Mockery.Generator.StringManipulation.Pass;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/RemoveUnserializeForInternalSerializableClassesPass.php")
public class servlet_RemoveUnserializeForInternalSerializableClassesPass_php
        extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .mockery
                .mockery
                .library
                .Mockery
                .Generator
                .StringManipulation
                .Pass
                .file_RemoveUnserializeForInternalSerializableClassesPass_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
