package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Debug.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Debug/HtmlDumper.php

*/

public class HtmlDumper
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .VarDumper
                .namespaces
                .Dumper
                .classes
                .HtmlDumper {

    public HtmlDumper(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.styles =
                ZVal.newArray(
                        new ZPair(
                                "default",
                                "background-color:#fff; color:#222; line-height:1.2em; font-weight:normal; font:12px Monaco, Consolas, monospace; word-wrap: break-word; white-space: pre-wrap; position:relative; z-index:100000"),
                        new ZPair("num", "color:#a71d5d"),
                        new ZPair("const", "color:#795da3"),
                        new ZPair("str", "color:#df5000"),
                        new ZPair("cchr", "color:#222"),
                        new ZPair("note", "color:#a71d5d"),
                        new ZPair("ref", "color:#a0a0a0"),
                        new ZPair("public", "color:#795da3"),
                        new ZPair("protected", "color:#795da3"),
                        new ZPair("private", "color:#795da3"),
                        new ZPair("meta", "color:#b729d9"),
                        new ZPair("key", "color:#df5000"),
                        new ZPair("index", "color:#a71d5d"));
        if (this.getClass() == HtmlDumper.class) {
            this.__construct(env, args);
        }
    }

    public HtmlDumper(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Debug\\HtmlDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .VarDumper
                    .namespaces
                    .Dumper
                    .classes
                    .HtmlDumper
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Debug\\HtmlDumper")
                    .setLookup(
                            HtmlDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "collapseNextHash",
                            "colors",
                            "colors",
                            "decimalPoint",
                            "displayOptions",
                            "dumpHeader",
                            "dumpId",
                            "dumpPrefix",
                            "dumpSuffix",
                            "expandNextHash",
                            "extraDisplayOptions",
                            "flags",
                            "headerIsDumped",
                            "indentPad",
                            "lastDepth",
                            "line",
                            "lineDumper",
                            "maxStringWidth",
                            "outputStream",
                            "styles",
                            "styles",
                            "styles")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Debug/HtmlDumper.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface")
                    .addInterface("Symfony\\Component\\VarDumper\\Cloner\\DumperInterface")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Dumper\\HtmlDumper")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Dumper\\CliDumper")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Dumper\\AbstractDumper")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
