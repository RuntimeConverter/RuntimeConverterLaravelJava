package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.namespaces.Descriptor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.namespaces.Descriptor.classes.DumpDescriptorInterface;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Command/Descriptor/HtmlDescriptor.php

*/

public class HtmlDescriptor extends RuntimeClassBase implements DumpDescriptorInterface {

    public Object dumper = null;

    public Object initialized = false;

    public HtmlDescriptor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HtmlDescriptor.class) {
            this.__construct(env, args);
        }
    }

    public HtmlDescriptor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dumper",
        typeHint = "Symfony\\Component\\VarDumper\\Dumper\\HtmlDumper"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dumper = assignParameter(args, 0, false);
        this.dumper = dumper;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    @ConvertedParameter(index = 2, name = "context", typeHint = "array")
    @ConvertedParameter(index = 3, name = "clientId", typeHint = "int")
    public Object describe(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object clientId = assignParameter(args, 3, false);
        Object projectDir = null;
        ReferenceContainer request = new BasicReferenceContainer(null);
        Object controller = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer source = new BasicReferenceContainer(null);
        Object title = null;
        Object uri = null;
        Object tags = null;
        Object styles = null;
        Object dedupIdentifier = null;
        Object sourceDescription = null;
        Object isoDate = null;
        Object scripts = null;
        if (!ZVal.isTrue(this.initialized)) {
            styles =
                    function_file_get_contents
                            .f
                            .env(env)
                            .call(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/symfony/var-dumper/Command/Descriptor"),
                                                    env)
                                            + "/../../Resources/css/htmlDescriptor.css")
                            .value();
            scripts =
                    function_file_get_contents
                            .f
                            .env(env)
                            .call(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/symfony/var-dumper/Command/Descriptor"),
                                                    env)
                                            + "/../../Resources/js/htmlDescriptor.js")
                            .value();
            env.callMethod(
                    output,
                    "writeln",
                    HtmlDescriptor.class,
                    "<style>"
                            + toStringR(styles, env)
                            + "</style><script>"
                            + toStringR(scripts, env)
                            + "</script>");
            this.initialized = true;
        }

        title = "-";
        if (arrayActionR(ArrayAction.ISSET, context, env, "request")) {
            request.setObject(ZVal.assign(context.arrayGet(env, "request")));
            controller =
                    ZVal.assign(
                            "<span class='dumped-tag'>"
                                    + toStringR(
                                            env.callMethod(
                                                    this.dumper,
                                                    "dump",
                                                    HtmlDescriptor.class,
                                                    request.arrayGet(env, "controller"),
                                                    true,
                                                    ZVal.newArray(new ZPair("maxDepth", 0))),
                                            env)
                                    + "</span>");
            title =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<code>%s</code> <a href=\"%s\">%s</a>",
                                    request.arrayGet(env, "method"),
                                    uri = ZVal.assign(request.arrayGet(env, "uri")),
                                    uri)
                            .value();
            dedupIdentifier = ZVal.assign(request.arrayGet(env, "identifier"));

        } else if (arrayActionR(ArrayAction.ISSET, context, env, "cli")) {
            title =
                    "<code>$ </code>"
                            + toStringR(context.arrayGet(env, "cli", "command_line"), env);
            dedupIdentifier = ZVal.assign(context.arrayGet(env, "cli", "identifier"));

        } else {
            dedupIdentifier = NamespaceGlobal.uniqid.env(env).call("", true).value();
        }

        sourceDescription = "";
        if (arrayActionR(ArrayAction.ISSET, context, env, "source")) {
            source.setObject(ZVal.assign(context.arrayGet(env, "source")));
            projectDir = ZVal.assign(source.arrayGet(env, "project_dir"));
            sourceDescription =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s on line %d",
                                    source.arrayGet(env, "name"), source.arrayGet(env, "line"))
                            .value();
            if (arrayActionR(ArrayAction.ISSET, source, env, "file_link")) {
                sourceDescription =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<a href=\"%s\">%s</a>",
                                        source.arrayGet(env, "file_link"), sourceDescription)
                                .value();
            }
        }

        isoDate = this.extractDate(env, context.getObject(), "c");
        tags =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                "controller",
                                                ZVal.isDefined(ternaryExpressionTemp = controller)
                                                        ? ternaryExpressionTemp
                                                        : ZVal.getNull()),
                                        new ZPair(
                                                "project dir",
                                                ZVal.isDefined(ternaryExpressionTemp = projectDir)
                                                        ? ternaryExpressionTemp
                                                        : ZVal.getNull())))
                        .value();
        env.callMethod(
                output,
                "writeln",
                HtmlDescriptor.class,
                "<article data-dedup-id=\""
                        + toStringR(dedupIdentifier, env)
                        + "\">\n    <header>\n        <div class=\"row\">\n            <h2 class=\"col\">"
                        + toStringR(title, env)
                        + "</h2>\n            <time class=\"col text-small\" title=\""
                        + toStringR(isoDate, env)
                        + "\" datetime=\""
                        + toStringR(isoDate, env)
                        + "\">\n                "
                        + toStringR(this.extractDate(env, context.getObject()), env)
                        + "\n            </time>\n        </div>\n        "
                        + toStringR(this.renderTags(env, tags), env)
                        + "\n    </header>\n    <section class=\"body\">\n        <p class=\"text-small\">\n            "
                        + toStringR(sourceDescription, env)
                        + "\n        </p>\n        "
                        + toStringR(
                                env.callMethod(
                                        this.dumper, "dump", HtmlDescriptor.class, data, true),
                                env)
                        + "\n    </section>\n</article>");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "array")
    @ConvertedParameter(index = 1, name = "format", typeHint = "string")
    private Object extractDate(RuntimeEnv env, Object... args) {
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object format = assignParameter(args, 1, true);
        if (null == format) {
            format = "r";
        }
        return ZVal.assign(
                function_date.f.env(env).call(format, context.arrayGet(env, "timestamp")).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tags", typeHint = "array")
    private Object renderTags(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, false);
        Object renderedTags = null;
        Object value = null;
        Object key = null;
        if (!ZVal.isTrue(tags)) {
            return "";
        }

        renderedTags = "";
        for (ZPair zpairResult2225 : ZVal.getIterable(tags, env, false)) {
            key = ZVal.assign(zpairResult2225.getKey());
            value = ZVal.assign(zpairResult2225.getValue());
            renderedTags =
                    toStringR(renderedTags, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "<li><span class=\"badge\">%s</span>%s</li>",
                                                    key, value)
                                            .value(),
                                    env);
        }

        return ZVal.assign(
                "<div class=\"row\">\n    <ul class=\"tags\">\n        "
                        + toStringR(renderedTags, env)
                        + "\n    </ul>\n</div>");
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Command\\Descriptor\\HtmlDescriptor";

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
                    .setName("Symfony\\Component\\VarDumper\\Command\\Descriptor\\HtmlDescriptor")
                    .setLookup(
                            HtmlDescriptor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dumper", "initialized")
                    .setFilename("vendor/symfony/var-dumper/Command/Descriptor/HtmlDescriptor.php")
                    .addInterface(
                            "Symfony\\Component\\VarDumper\\Command\\Descriptor\\DumpDescriptorInterface")
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
