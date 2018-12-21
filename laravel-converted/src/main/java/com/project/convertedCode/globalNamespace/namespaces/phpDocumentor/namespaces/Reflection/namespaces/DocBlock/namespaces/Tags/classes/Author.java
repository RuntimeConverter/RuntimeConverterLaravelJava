package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Author.php

*/

public final class Author extends BaseTag implements StaticMethod {

    public Object authorName = "";

    public Object authorEmail = "";

    public Author(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "author";
        if (this.getClass() == Author.class) {
            this.__construct(env, args);
        }
    }

    public Author(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "authorName")
    @ConvertedParameter(index = 1, name = "authorEmail")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object authorName = assignParameter(args, 0, false);
        Object authorEmail = assignParameter(args, 1, false);
        Assert.runtimeStaticObject.string(env, authorName);
        Assert.runtimeStaticObject.string(env, authorEmail);
        if (ZVal.toBool(authorEmail)
                && ZVal.toBool(!function_filter_var.f.env(env).call(authorEmail, 274).getBool())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "The author tag does not have a valid e-mail address"));
        }

        this.authorName = authorName;
        this.authorEmail = authorEmail;
        return null;
    }

    @ConvertedMethod
    public Object getAuthorName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.authorName);
    }

    @ConvertedMethod
    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.authorEmail);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.authorName, env)
                        + toStringR(
                                function_strlen.f.env(env).call(this.authorEmail).getBool()
                                        ? " <" + toStringR(this.authorEmail, env) + ">"
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Author";

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
            Object splitTagContent = null;
            Object authorName = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object email = null;
            Assert.runtimeStaticObject.string(env, body);
            splitTagContent =
                    function_preg_match
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                            .call("/^([^\\<]*)(?:\\<([^\\>]*)\\>)?$/u", body, matches.getObject())
                            .value();
            if (!ZVal.isTrue(splitTagContent)) {
                return ZVal.assign(ZVal.getNull());
            }

            authorName = function_trim.f.env(env).call(matches.arrayGet(env, 1)).value();
            email =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, matches, env, 2)
                                    ? function_trim
                                            .f
                                            .env(env)
                                            .call(matches.arrayGet(env, 2))
                                            .value()
                                    : "");
            return ZVal.assign(env.createNewWithLateStaticBindings(this, authorName, email));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Author")
                    .setLookup(
                            Author.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("authorEmail", "authorName", "description", "name", "name")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Author.php")
                    .addInterface(
                            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Factory\\StaticMethod")
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
