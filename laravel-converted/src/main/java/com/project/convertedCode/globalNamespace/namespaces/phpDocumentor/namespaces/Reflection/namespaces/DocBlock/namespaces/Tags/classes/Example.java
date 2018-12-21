package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Example.php

*/

public final class Example extends BaseTag {

    public Object filePath = null;

    public Object isURI = false;

    public Object startingLine = null;

    public Object lineCount = null;

    public Example(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Example.class) {
            this.__construct(env, args);
        }
    }

    public Example(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    @ConvertedParameter(index = 1, name = "isURI")
    @ConvertedParameter(index = 2, name = "startingLine")
    @ConvertedParameter(index = 3, name = "lineCount")
    @ConvertedParameter(index = 4, name = "description")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, false);
        Object isURI = assignParameter(args, 1, false);
        Object startingLine = assignParameter(args, 2, false);
        Object lineCount = assignParameter(args, 3, false);
        Object description = assignParameter(args, 4, false);
        Assert.runtimeStaticObject.notEmpty(env, filePath);
        Assert.runtimeStaticObject.integer(env, startingLine);
        Assert.runtimeStaticObject.greaterThanEq(env, startingLine, 0);
        this.filePath = filePath;
        this.startingLine = startingLine;
        this.lineCount = lineCount;
        toObjectR(this).accessProp(this, env).name("name").set("example");
        if (ZVal.strictNotEqualityCheck(description, "!==", ZVal.getNull())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("description")
                    .set(function_trim.f.env(env).call(description).value());
        }

        this.isURI = isURI;
        return null;
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        Object filePath = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                toObjectR(this).accessProp(this, env).name("description").value())) {
            filePath = "\"" + toStringR(this.filePath, env) + "\"";
            if (ZVal.isTrue(this.isURI)) {
                filePath =
                        ZVal.assign(
                                ZVal.isTrue(this.isUriRelative(env, this.filePath))
                                        ? function_str_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        "%2F",
                                                        "/",
                                                        NamespaceGlobal.rawurlencode
                                                                .env(env)
                                                                .call(this.filePath)
                                                                .value())
                                                .value()
                                        : this.filePath);
            }

            return ZVal.assign(
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    toStringR(filePath, env)
                                            + " "
                                            + toStringR(super.getDescription(env), env))
                            .value());
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("description").value());
    }

    @ConvertedMethod
    public Object getFilePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filePath);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.filePath, env)
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("description").getBool()
                                        ? " "
                                                + toStringR(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("description")
                                                                .value(),
                                                        env)
                                        : "",
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    private Object isUriRelative(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false, "===", function_strpos.f.env(env).call(uri, ":").value()));
    }

    @ConvertedMethod
    public Object getStartingLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.startingLine);
    }

    @ConvertedMethod
    public Object getLineCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lineCount);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Example";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, false);
            ReferenceContainer contentMatches = new BasicReferenceContainer(null);
            Object startingLine = null;
            Object filePath = null;
            Object fileUri = null;
            Object description = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object lineCount = null;
            if (!function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^(?:\\\"([^\\\"]+)\\\"|(\\S+))(?:\\s+(.*))?$/sux",
                            body,
                            matches.getObject())
                    .getBool()) {
                return ZVal.assign(ZVal.getNull());
            }

            filePath = ZVal.getNull();
            fileUri = ZVal.getNull();
            if (ZVal.strictNotEqualityCheck("", "!==", matches.arrayGet(env, 1))) {
                filePath = ZVal.assign(matches.arrayGet(env, 1));

            } else {
                fileUri = ZVal.assign(matches.arrayGet(env, 2));
            }

            startingLine = 1;
            lineCount = ZVal.getNull();
            description = ZVal.getNull();
            if (function_array_key_exists.f.env(env).call(3, matches.getObject()).getBool()) {
                description = ZVal.assign(matches.arrayGet(env, 3));
                if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, contentMatches))
                        .call(
                                "/^([1-9]\\d*)(?:\\s+((?1))\\s*)?(.*)$/sux",
                                matches.arrayGet(env, 3),
                                contentMatches.getObject())
                        .getBool()) {
                    startingLine = ZVal.assign(ZVal.toLong(contentMatches.arrayGet(env, 1)));
                    if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, contentMatches, env, 2))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            contentMatches.arrayGet(env, 2), "!==", ""))) {
                        lineCount = ZVal.assign(ZVal.toLong(contentMatches.arrayGet(env, 2)));
                    }

                    if (function_array_key_exists
                            .f
                            .env(env)
                            .call(3, contentMatches.getObject())
                            .getBool()) {
                        description = ZVal.assign(contentMatches.arrayGet(env, 3));
                    }
                }
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            ZVal.strictNotEqualityCheck(filePath, "!==", ZVal.getNull())
                                    ? filePath
                                    : fileUri,
                            ZVal.strictNotEqualityCheck(fileUri, "!==", ZVal.getNull()),
                            startingLine,
                            lineCount,
                            description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Example")
                    .setLookup(
                            Example.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "description", "filePath", "isURI", "lineCount", "name", "startingLine")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Example.php")
                    .addInterface("phpDocumentor\\Reflection\\DocBlock\\Tag")
                    .addExtendsClass("phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag")
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
