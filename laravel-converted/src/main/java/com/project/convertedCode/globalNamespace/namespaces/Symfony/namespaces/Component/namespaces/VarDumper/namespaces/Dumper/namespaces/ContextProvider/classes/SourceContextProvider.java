package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.classes.VarDumper;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.HtmlDumper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes.ContextProviderInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/ContextProvider/SourceContextProvider.php

*/

public final class SourceContextProvider extends RuntimeClassBase
        implements ContextProviderInterface {

    public Object limit = null;

    public Object charset = null;

    public Object projectDir = null;

    public Object fileLinkFormatter = null;

    public SourceContextProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SourceContextProvider.class) {
            this.__construct(env, args);
        }
    }

    public SourceContextProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "charset",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "projectDir",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "fileLinkFormatter",
        typeHint = "Symfony\\Component\\HttpKernel\\Debug\\FileLinkFormatter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "limit",
        typeHint = "int",
        defaultValue = "9",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        Object projectDir = assignParameter(args, 1, true);
        if (null == projectDir) {
            projectDir = ZVal.getNull();
        }
        Object fileLinkFormatter = assignParameter(args, 2, true);
        if (null == fileLinkFormatter) {
            fileLinkFormatter = ZVal.getNull();
        }
        Object limit = assignParameter(args, 3, true);
        if (null == limit) {
            limit = 9;
        }
        this.charset = charset;
        this.projectDir = projectDir;
        this.fileLinkFormatter = fileLinkFormatter;
        this.limit = limit;
        return null;
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object template = null;
        ReferenceContainer src = new BasicReferenceContainer(null);
        Object max = null;
        Object line = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer fileExcerpt = new BasicReferenceContainer(null);
        ReferenceContainer trace = new BasicReferenceContainer(null);
        Object fileLink = null;
        Object file = null;
        Object name = null;
        ReferenceContainer context = new BasicReferenceContainer(null);
        ReferenceContainer info = new BasicReferenceContainer(null);
        trace.setObject(
                NamespaceGlobal.debug_backtrace
                        .env(env)
                        .call(ZVal.toLong(1) | ZVal.toLong(2), this.limit)
                        .value());
        file = ZVal.assign(trace.arrayGet(env, 1, "file"));
        line = ZVal.assign(trace.arrayGet(env, 1, "line"));
        name = false;
        fileExcerpt.setObject(false);
        runtimeConverterBreakCount = 0;
        for (i.setObject(2);
                ZVal.isLessThan(i.getObject(), '<', this.limit);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    trace,
                                                                    env,
                                                                    i.getObject(),
                                                                    "class"))
                                                    && ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    trace,
                                                                    env,
                                                                    i.getObject(),
                                                                    "function")))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    "dump",
                                                    "===",
                                                    trace.arrayGet(
                                                            env, i.getObject(), "function"))))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    VarDumper.CONST_class,
                                    "===",
                                    trace.arrayGet(env, i.getObject(), "class")))) {
                file = ZVal.assign(trace.arrayGet(env, i.getObject(), "file"));
                line = ZVal.assign(trace.arrayGet(env, i.getObject(), "line"));
                runtimeConverterBreakCount = 0;
                while (ZVal.isLessThan(ZVal.preIncrement(i), '<', this.limit)) {
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    arrayActionR(
                                                                            ArrayAction.ISSET,
                                                                            trace,
                                                                            env,
                                                                            i.getObject(),
                                                                            "function"))
                                                            && ZVal.toBool(
                                                                    arrayActionR(
                                                                            ArrayAction.ISSET,
                                                                            trace,
                                                                            env,
                                                                            i.getObject(),
                                                                            "file")))
                                            && ZVal.toBool(
                                                    arrayActionR(
                                                            ArrayAction.EMPTY,
                                                            trace,
                                                            env,
                                                            i.getObject(),
                                                            "class")))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            0,
                                            "!==",
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            trace.arrayGet(
                                                                    env, i.getObject(), "function"),
                                                            "call_user_func")
                                                    .value()))) {
                        file = ZVal.assign(trace.arrayGet(env, i.getObject(), "file"));
                        line = ZVal.assign(trace.arrayGet(env, i.getObject(), "line"));
                        break;

                    } else if (ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET, trace, env, i.getObject(), "object"))
                            && ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            trace.arrayGet(env, i.getObject(), "object"),
                                            (Class) null,
                                            "Template",
                                            env))) {
                        template = ZVal.assign(trace.arrayGet(env, i.getObject(), "object"));
                        name =
                                env.callMethod(
                                        template, "getTemplateName", SourceContextProvider.class);
                        src.setObject(
                                ZVal.assign(
                                        function_method_exists
                                                        .f
                                                        .env(env)
                                                        .call(template, "getSourceContext")
                                                        .getBool()
                                                ? env.callMethod(
                                                        env.callMethod(
                                                                template,
                                                                "getSourceContext",
                                                                SourceContextProvider.class),
                                                        "getCode",
                                                        SourceContextProvider.class)
                                                : function_method_exists
                                                                .f
                                                                .env(env)
                                                                .call(template, "getSource")
                                                                .getBool()
                                                        ? env.callMethod(
                                                                template,
                                                                "getSource",
                                                                SourceContextProvider.class)
                                                        : false));
                        info.setObject(
                                env.callMethod(
                                        template, "getDebugInfo", SourceContextProvider.class));
                        if (arrayActionR(
                                ArrayAction.ISSET,
                                info,
                                env,
                                trace.arrayGet(env, ZVal.subtract(i.getObject(), 1), "line"))) {
                            line =
                                    ZVal.assign(
                                            info.arrayGet(
                                                    env,
                                                    trace.arrayGet(
                                                            env,
                                                            ZVal.subtract(i.getObject(), 1),
                                                            "line")));
                            file =
                                    ZVal.assign(
                                            function_method_exists
                                                            .f
                                                            .env(env)
                                                            .call(template, "getSourceContext")
                                                            .getBool()
                                                    ? env.callMethod(
                                                            env.callMethod(
                                                                    template,
                                                                    "getSourceContext",
                                                                    SourceContextProvider.class),
                                                            "getPath",
                                                            SourceContextProvider.class)
                                                    : ZVal.getNull());
                            if (ZVal.isTrue(src.getObject())) {
                                src.setObject(
                                        function_explode
                                                .f
                                                .env(env)
                                                .call("\n", src.getObject())
                                                .value());
                                fileExcerpt.setObject(ZVal.newArray());
                                runtimeConverterBreakCount = 0;
                                for (i.setObject(
                                                        NamespaceGlobal.max
                                                                .env(env)
                                                                .call(ZVal.subtract(line, 3), 1)
                                                                .value()),
                                                max =
                                                        NamespaceGlobal.min
                                                                .env(env)
                                                                .call(
                                                                        ZVal.add(line, 3),
                                                                        function_count
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        src
                                                                                                .getObject())
                                                                                .value())
                                                                .value();
                                        ZVal.isLessThanOrEqualTo(i.getObject(), "<=", max);
                                        i.setObject(ZVal.increment(i.getObject()))) {
                                    fileExcerpt
                                            .arrayAppend(env)
                                            .set(
                                                    "<li"
                                                            + toStringR(
                                                                    ZVal.strictEqualityCheck(
                                                                                    i.getObject(),
                                                                                    "===",
                                                                                    line)
                                                                            ? " class=\"selected\""
                                                                            : "",
                                                                    env)
                                                            + "><code>"
                                                            + toStringR(
                                                                    this.htmlEncode(
                                                                            env,
                                                                            src.arrayGet(
                                                                                    env,
                                                                                    ZVal.subtract(
                                                                                            i
                                                                                                    .getObject(),
                                                                                            1))),
                                                                    env)
                                                            + "</code></li>");
                                }

                                fileExcerpt.setObject(
                                        "<ol start=\""
                                                + toStringR(
                                                        NamespaceGlobal.max
                                                                .env(env)
                                                                .call(ZVal.subtract(line, 3), 1)
                                                                .value(),
                                                        env)
                                                + "\">"
                                                + toStringR(
                                                        NamespaceGlobal.implode
                                                                .env(env)
                                                                .call("\n", fileExcerpt.getObject())
                                                                .value(),
                                                        env)
                                                + "</ol>");
                            }
                        }

                        break;
                    }
                }

                break;
            }
        }

        if (ZVal.strictEqualityCheck(false, "===", name)) {
            name = function_str_replace.f.env(env).call("\\", "/", file).value();
            name =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    name,
                                    ZVal.add(
                                            NamespaceGlobal.strrpos
                                                    .env(env)
                                                    .call(name, "/")
                                                    .value(),
                                            1))
                            .value();
        }

        context.setObject(
                ZVal.newArray(
                        new ZPair("name", name), new ZPair("file", file), new ZPair("line", line)));
        context.arrayAccess(env, "file_excerpt").set(fileExcerpt.getObject());
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.projectDir)) {
            context.arrayAccess(env, "project_dir").set(this.projectDir);
            if (ZVal.strictEqualityCheck(
                    0, "===", function_strpos.f.env(env).call(file, this.projectDir).value())) {
                context.arrayAccess(env, "file_relative")
                        .set(
                                function_ltrim
                                        .f
                                        .env(env)
                                        .call(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                file,
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(this.projectDir)
                                                                        .value())
                                                        .value(),
                                                "/")
                                        .value());
            }
        }

        if (ZVal.toBool(this.fileLinkFormatter)
                && ZVal.toBool(
                        fileLink =
                                env.callMethod(
                                        this.fileLinkFormatter,
                                        "format",
                                        SourceContextProvider.class,
                                        context.arrayGet(env, "file"),
                                        context.arrayGet(env, "line")))) {
            context.arrayAccess(env, "file_link").set(fileLink);
        }

        return ZVal.assign(context.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s", typeHint = "string")
    private Object htmlEncode(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/var-dumper/Dumper/ContextProvider")
                        .setFile(
                                "/vendor/symfony/var-dumper/Dumper/ContextProvider/SourceContextProvider.php");
        Object s = assignParameter(args, 0, false);
        Object cloner = null;
        Object dumper = null;
        ReferenceContainer html = new BasicReferenceContainer(null);
        html.setObject("");
        dumper =
                new HtmlDumper(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "line")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object line = assignParameter(args, 0, false);
                                ReferenceContainer html = new BasicReferenceContainer(null);
                                html = this.contextReferences.getReferenceContainer("html");
                                html.setObject(
                                        toStringR(html.getObject(), env) + toStringR(line, env));
                                return null;
                            }
                        }.useRef("html", html),
                        this.charset);
        env.callMethod(dumper, "setDumpHeader", SourceContextProvider.class, "");
        env.callMethod(dumper, "setDumpBoundaries", SourceContextProvider.class, "", "");
        cloner = new VarCloner(env);
        env.callMethod(
                dumper,
                "dump",
                SourceContextProvider.class,
                env.callMethod(cloner, "cloneVar", SourceContextProvider.class, s));
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strip_tags.env(env).call(html.getObject()).value(),
                                1,
                                -1)
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\SourceContextProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\SourceContextProvider")
                    .setLookup(
                            SourceContextProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charset", "fileLinkFormatter", "limit", "projectDir")
                    .setFilename(
                            "vendor/symfony/var-dumper/Dumper/ContextProvider/SourceContextProvider.php")
                    .addInterface(
                            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\ContextProviderInterface")
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
