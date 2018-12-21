package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilterIterator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/MultiplePcreFilterIterator.php

*/

public abstract class MultiplePcreFilterIterator extends FilterIterator {

    public Object matchRegexps = ZVal.newArray();

    public Object noMatchRegexps = ZVal.newArray();

    public MultiplePcreFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MultiplePcreFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public MultiplePcreFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(index = 1, name = "matchPatterns", typeHint = "array")
    @ConvertedParameter(index = 2, name = "noMatchPatterns", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object matchPatterns = assignParameter(args, 1, false);
        Object noMatchPatterns = assignParameter(args, 2, false);
        Object pattern = null;
        for (ZPair zpairResult1836 : ZVal.getIterable(matchPatterns, env, true)) {
            pattern = ZVal.assign(zpairResult1836.getValue());
            new ReferenceClassProperty(this, "matchRegexps", env)
                    .arrayAppend(env)
                    .set(
                            env.callMethod(
                                    this, "toRegex", MultiplePcreFilterIterator.class, pattern));
        }

        for (ZPair zpairResult1837 : ZVal.getIterable(noMatchPatterns, env, true)) {
            pattern = ZVal.assign(zpairResult1837.getValue());
            new ReferenceClassProperty(this, "noMatchRegexps", env)
                    .arrayAppend(env)
                    .set(
                            env.callMethod(
                                    this, "toRegex", MultiplePcreFilterIterator.class, pattern));
        }

        super.__construct(env, iterator);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object isAccepted(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object regex = null;
        for (ZPair zpairResult1838 : ZVal.getIterable(this.noMatchRegexps, env, true)) {
            regex = ZVal.assign(zpairResult1838.getValue());
            if (function_preg_match.f.env(env).call(regex, string).getBool()) {
                return ZVal.assign(false);
            }
        }

        if (ZVal.isTrue(this.matchRegexps)) {
            for (ZPair zpairResult1839 : ZVal.getIterable(this.matchRegexps, env, true)) {
                regex = ZVal.assign(zpairResult1839.getValue());
                if (function_preg_match.f.env(env).call(regex, string).getBool()) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    protected Object isRegex(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        ReferenceContainer delimiters = new BasicReferenceContainer(null);
        Object start = null;
        Object end = null;
        ReferenceContainer m = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, m))
                .call("/^(.{3,}?)[imsxuADU]*$/", str, m.getObject())
                .getBool()) {
            start = function_substr.f.env(env).call(m.arrayGet(env, 1), 0, 1).value();
            end = function_substr.f.env(env).call(m.arrayGet(env, 1), -1).value();
            if (ZVal.strictEqualityCheck(start, "===", end)) {
                return ZVal.assign(
                        !function_preg_match
                                .f
                                .env(env)
                                .call("/[*?[:alnum:] \\\\]/", start)
                                .getBool());
            }

            for (ZPair zpairResult1840 :
                    ZVal.getIterable(
                            ZVal.newArray(
                                    new ZPair(0, ZVal.arrayFromList("{", "}")),
                                    new ZPair(1, ZVal.arrayFromList("(", ")")),
                                    new ZPair(2, ZVal.arrayFromList("[", "]")),
                                    new ZPair(3, ZVal.arrayFromList("<", ">"))),
                            env,
                            true)) {
                delimiters.setObject(ZVal.assign(zpairResult1840.getValue()));
                if (ZVal.toBool(ZVal.strictEqualityCheck(start, "===", delimiters.arrayGet(env, 0)))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        end, "===", delimiters.arrayGet(env, 1)))) {
                    return ZVal.assign(true);
                }
            }
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\MultiplePcreFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FilterIterator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Iterator\\MultiplePcreFilterIterator")
                    .setLookup(
                            MultiplePcreFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("matchRegexps", "noMatchRegexps")
                    .setFilename("vendor/symfony/finder/Iterator/MultiplePcreFilterIterator.php")
                    .addInterface("OuterIterator")
                    .addInterface("Traversable")
                    .addInterface("Iterator")
                    .addExtendsClass("FilterIterator")
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
