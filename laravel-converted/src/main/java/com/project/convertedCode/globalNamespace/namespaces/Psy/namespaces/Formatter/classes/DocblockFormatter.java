package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.Formatter;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes.Docblock;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Formatter/DocblockFormatter.php

*/

public class DocblockFormatter extends RuntimeClassBase implements Formatter {

    public DocblockFormatter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DocblockFormatter(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Psy\\Formatter\\DocblockFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
        public Object format(RuntimeEnv env, Object... args) {
            Object reflector = assignParameter(args, 0, false);
            Object docblock = null;
            ReferenceContainer chunks = new BasicReferenceContainer(null);
            Object name = null;
            Object vector = null;
            Object tags = null;
            docblock = new Docblock(env, reflector);
            chunks.setObject(ZVal.newArray());
            if (!ZVal.isEmpty(toObjectR(docblock).accessProp(this, env).name("desc").value())) {
                chunks.arrayAppend(env).set("<comment>Description:</comment>");
                chunks.arrayAppend(env)
                        .set(
                                runtimeStaticObject.indent(
                                        env,
                                        OutputFormatter.runtimeStaticObject.escape(
                                                env,
                                                toObjectR(docblock)
                                                        .accessProp(this, env)
                                                        .name("desc")
                                                        .value()),
                                        "  "));
                chunks.arrayAppend(env).set("");
            }

            if (!ZVal.isEmpty(toObjectR(docblock).accessProp(this, env).name("tags").value())) {
                for (ZPair zpairResult1398 :
                        ZVal.getIterable(
                                env.getRequestStaticPropertiesReference(docblock, "vectors")
                                        .getObject(),
                                env,
                                false)) {
                    name = ZVal.assign(zpairResult1398.getKey());
                    vector = ZVal.assign(zpairResult1398.getValue());
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(docblock, "tags", env),
                            env,
                            name)) {
                        chunks.arrayAppend(env)
                                .set(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "<comment>%s:</comment>",
                                                        runtimeStaticObject.inflect(env, name))
                                                .value());
                        chunks.arrayAppend(env)
                                .set(
                                        runtimeStaticObject.formatVector(
                                                env,
                                                vector,
                                                new ReferenceClassProperty(docblock, "tags", env)
                                                        .arrayGet(env, name)));
                        chunks.arrayAppend(env).set("");
                    }
                }

                tags =
                        runtimeStaticObject.formatTags(
                                env,
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                env.getRequestStaticPropertiesReference(
                                                                docblock, "vectors")
                                                        .getObject())
                                        .value(),
                                toObjectR(docblock).accessProp(this, env).name("tags").value());
                if (!ZVal.isEmpty(tags)) {
                    chunks.arrayAppend(env).set(tags);
                    chunks.arrayAppend(env).set("");
                }
            }

            return ZVal.assign(
                    function_rtrim
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("\n", chunks.getObject())
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "vector", typeHint = "array")
        @ConvertedParameter(index = 1, name = "lines", typeHint = "array")
        private Object formatVector(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/psy/psysh/src/Formatter")
                            .setFile("/vendor/psy/psysh/src/Formatter/DocblockFormatter.php");
            Object vector = assignParameter(args, 0, false);
            Object lines = assignParameter(args, 1, false);
            ReferenceContainer template = new BasicReferenceContainer(null);
            Object cur = null;
            Object max = null;
            ReferenceContainer line = new BasicReferenceContainer(null);
            Object chunk = null;
            Object type = null;
            template.setObject(ZVal.arrayFromList(" "));
            for (ZPair zpairResult1399 : ZVal.getIterable(vector, env, true)) {
                type = ZVal.assign(zpairResult1399.getValue());
                max = 0;
                for (ZPair zpairResult1400 : ZVal.getIterable(lines, env, true)) {
                    line.setObject(ZVal.assign(zpairResult1400.getValue()));
                    chunk = ZVal.assign(line.arrayGet(env, type));
                    cur =
                            ZVal.assign(
                                    ZVal.isEmpty(chunk)
                                            ? 0
                                            : ZVal.add(
                                                    function_strlen.f.env(env).call(chunk).value(),
                                                    1));
                    if (ZVal.isGreaterThan(cur, '>', max)) {
                        max = ZVal.assign(cur);
                    }
                }

                template.arrayAppend(env)
                        .set(runtimeStaticObject.getVectorParamTemplate(env, type, max));
            }

            template.setObject(
                    NamespaceGlobal.implode.env(env).call(" ", template.getObject()).value());
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    "\n",
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "Psy\\Formatter",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "line"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object line =
                                                                    assignParameter(args, 0, false);
                                                            Object escaped = null;
                                                            Object template = null;
                                                            template =
                                                                    this.contextReferences
                                                                            .getCapturedValue(
                                                                                    "template");
                                                            escaped =
                                                                    function_array_map
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    ZVal
                                                                                            .arrayFromList(
                                                                                                    "Symfony\\Component\\Console\\Formatter\\OutputFormatter",
                                                                                                    "escape"),
                                                                                    line)
                                                                            .value();
                                                            return ZVal.assign(
                                                                    function_rtrim
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    NamespaceGlobal
                                                                                            .vsprintf
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    template,
                                                                                                    escaped)
                                                                                            .value())
                                                                            .value());
                                                        }
                                                    }.use("template", template),
                                                    lines)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "skip", typeHint = "array")
        @ConvertedParameter(index = 1, name = "tags", typeHint = "array")
        private Object formatTags(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object skip = assignParameter(args, 0, false);
            Object tags = assignParameter(args, 1, false);
            ReferenceContainer chunks = new BasicReferenceContainer(null);
            Object values = null;
            Object name = null;
            Object value = null;
            chunks.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1401 : ZVal.getIterable(tags, env, false)) {
                name = ZVal.assign(zpairResult1401.getKey());
                values = ZVal.assign(zpairResult1401.getValue());
                if (function_in_array.f.env(env).call(name, skip).getBool()) {
                    continue;
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1402 : ZVal.getIterable(values, env, true)) {
                    value = ZVal.assign(zpairResult1402.getValue());
                    chunks.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "<comment>%s%s</comment> %s",
                                                    runtimeStaticObject.inflect(env, name),
                                                    ZVal.isEmpty(value) ? "" : ":",
                                                    OutputFormatter.runtimeStaticObject.escape(
                                                            env, value))
                                            .value());
                }

                chunks.arrayAppend(env).set("");
            }

            return ZVal.assign(
                    NamespaceGlobal.implode.env(env).call("\n", chunks.getObject()).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        @ConvertedParameter(index = 1, name = "max")
        private Object getVectorParamTemplate(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            Object max = assignParameter(args, 1, false);
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Psy
                                    .namespaces
                                    .Formatter
                                    .classes
                                    .DocblockFormatter
                                    .RequestStaticProperties
                                    .class,
                            "vectorParamTemplates"),
                    env,
                    type)) {
                return ZVal.assign(function_sprintf.f.env(env).call("%%-%ds", max).value());
            }

            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<%s>%%-%ds</%s>",
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Psy
                                                            .namespaces
                                                            .Formatter
                                                            .classes
                                                            .DocblockFormatter
                                                            .RequestStaticProperties
                                                            .class,
                                                    "vectorParamTemplates")
                                            .arrayGet(env, type),
                                    max,
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Psy
                                                            .namespaces
                                                            .Formatter
                                                            .classes
                                                            .DocblockFormatter
                                                            .RequestStaticProperties
                                                            .class,
                                                    "vectorParamTemplates")
                                            .arrayGet(env, type))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        @ConvertedParameter(index = 1, name = "indent")
        private Object indent(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object indent = assignParameter(args, 1, true);
            if (null == indent) {
                indent = "  ";
            }
            return ZVal.assign(
                    toStringR(indent, env)
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("\n", "\n" + toStringR(indent, env), text)
                                            .value(),
                                    env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        private Object inflect(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object words = null;
            words =
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "/[\\s_-]+/",
                                                    " ",
                                                    function_preg_replace
                                                            .f
                                                            .env(env)
                                                            .call("/([a-z])([A-Z])/", "$1 $2", text)
                                                            .value())
                                            .value())
                            .value();
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    " ",
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    "ucfirst",
                                                    function_explode
                                                            .f
                                                            .env(env)
                                                            .call(" ", words)
                                                            .value())
                                            .value())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object vectorParamTemplates =
                ZVal.newArray(new ZPair("type", "info"), new ZPair("var", "strong"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Formatter\\DocblockFormatter")
                    .setLookup(
                            DocblockFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("vectorParamTemplates")
                    .setFilename("vendor/psy/psysh/src/Formatter/DocblockFormatter.php")
                    .addInterface("Psy\\Formatter\\Formatter")
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
