package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes.PhpStringTokenParser;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes.ExtractorInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes.AbstractFileExtractor;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Extractor/PhpExtractor.php

*/

public class PhpExtractor extends AbstractFileExtractor implements ExtractorInterface {

    public Object prefix = "";

    public Object sequences =
            ZVal.newArray(
                    new ZPair(
                            0,
                            ZVal.newArray(
                                    new ZPair(0, "->"),
                                    new ZPair(1, "trans"),
                                    new ZPair(2, "("),
                                    new ZPair(3, CONST_MESSAGE_TOKEN),
                                    new ZPair(4, ","),
                                    new ZPair(5, CONST_METHOD_ARGUMENTS_TOKEN),
                                    new ZPair(6, ","),
                                    new ZPair(7, CONST_DOMAIN_TOKEN))),
                    new ZPair(
                            1,
                            ZVal.newArray(
                                    new ZPair(0, "->"),
                                    new ZPair(1, "transChoice"),
                                    new ZPair(2, "("),
                                    new ZPair(3, CONST_MESSAGE_TOKEN),
                                    new ZPair(4, ","),
                                    new ZPair(5, CONST_METHOD_ARGUMENTS_TOKEN),
                                    new ZPair(6, ","),
                                    new ZPair(7, CONST_METHOD_ARGUMENTS_TOKEN),
                                    new ZPair(8, ","),
                                    new ZPair(9, CONST_DOMAIN_TOKEN))),
                    new ZPair(
                            2,
                            ZVal.newArray(
                                    new ZPair(0, "->"),
                                    new ZPair(1, "trans"),
                                    new ZPair(2, "("),
                                    new ZPair(3, CONST_MESSAGE_TOKEN))),
                    new ZPair(
                            3,
                            ZVal.newArray(
                                    new ZPair(0, "->"),
                                    new ZPair(1, "transChoice"),
                                    new ZPair(2, "("),
                                    new ZPair(3, CONST_MESSAGE_TOKEN))));

    public PhpExtractor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PhpExtractor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "catalog",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    public Object extract(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object catalog = assignParameter(args, 1, false);
        Object file = null;
        Object files = null;
        files = env.callMethod(this, "extractFiles", PhpExtractor.class, resource);
        for (ZPair zpairResult2136 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult2136.getValue());
            this.parseTokens(
                    env,
                    NamespaceGlobal.token_get_all
                            .env(env)
                            .call(function_file_get_contents.f.env(env).call(file).value())
                            .value(),
                    catalog);
            NamespaceGlobal.gc_mem_caches.env(env).call();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object setPrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        this.prefix = prefix;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    protected Object normalizeToken(RuntimeEnv env, Object... args) {
        ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, token, env, 1))
                && ZVal.toBool(ZVal.strictNotEqualityCheck("b\"", "!==", token.getObject()))) {
            return ZVal.assign(token.arrayGet(env, 1));
        }

        return ZVal.assign(token.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokenIterator", typeHint = "Iterator")
    private Object seekToNextRelevantToken(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object tokenIterator = assignParameter(args, 0, false);
        ReferenceContainer t = new BasicReferenceContainer(null);
        runtimeConverterBreakCount = 0;
        for (;
                ZVal.isTrue(env.callMethod(tokenIterator, "valid", PhpExtractor.class));
                env.callMethod(tokenIterator, "next", PhpExtractor.class)) {
            t.setObject(env.callMethod(tokenIterator, "current", PhpExtractor.class));
            if (ZVal.strictNotEqualityCheck(382, "!==", t.arrayGet(env, 0))) {
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokenIterator", typeHint = "Iterator")
    private Object skipMethodArgument(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object tokenIterator = assignParameter(args, 0, false);
        ReferenceContainer t = new BasicReferenceContainer(null);
        ReferenceContainer openBraces = new BasicReferenceContainer(null);
        openBraces.setObject(0);
        runtimeConverterBreakCount = 0;
        for (;
                ZVal.isTrue(env.callMethod(tokenIterator, "valid", PhpExtractor.class));
                env.callMethod(tokenIterator, "next", PhpExtractor.class)) {
            t.setObject(env.callMethod(tokenIterator, "current", PhpExtractor.class));
            if (ZVal.toBool(ZVal.strictEqualityCheck("[", "===", t.arrayGet(env, 0)))
                    || ZVal.toBool(ZVal.strictEqualityCheck("(", "===", t.arrayGet(env, 0)))) {
                openBraces.setObject(ZVal.increment(openBraces.getObject()));
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck("]", "===", t.arrayGet(env, 0)))
                    || ZVal.toBool(ZVal.strictEqualityCheck(")", "===", t.arrayGet(env, 0)))) {
                openBraces.setObject(ZVal.decrement(openBraces.getObject()));
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(0, "===", openBraces.getObject()))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    ",", "===", t.arrayGet(env, 0))))
                    || ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(-1, "===", openBraces.getObject()))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    ")", "===", t.arrayGet(env, 0))))) {
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokenIterator", typeHint = "Iterator")
    private Object getValue(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object tokenIterator = assignParameter(args, 0, false);
        ReferenceContainer t = new BasicReferenceContainer(null);
        Object message = null;
        Object docToken = null;
        message = "";
        docToken = "";
        runtimeConverterBreakCount = 0;
        for (;
                ZVal.isTrue(env.callMethod(tokenIterator, "valid", PhpExtractor.class));
                env.callMethod(tokenIterator, "next", PhpExtractor.class)) {
            t.setObject(env.callMethod(tokenIterator, "current", PhpExtractor.class));
            if (!arrayActionR(ArrayAction.ISSET, t, env, 1)) {
                break;
            }

            SwitchEnumType138 switchVariable138 =
                    ZVal.getEnum(
                            t.arrayGet(env, 0),
                            SwitchEnumType138.DEFAULT_CASE,
                            SwitchEnumType138.DYNAMIC_TYPE_399,
                            383,
                            SwitchEnumType138.DYNAMIC_TYPE_400,
                            322,
                            SwitchEnumType138.DYNAMIC_TYPE_401,
                            323,
                            SwitchEnumType138.DYNAMIC_TYPE_402,
                            384);
            switch (switchVariable138) {
                case DYNAMIC_TYPE_399:
                    docToken = ZVal.assign(t.arrayGet(env, 1));
                    break;
                case DYNAMIC_TYPE_400:
                case DYNAMIC_TYPE_401:
                    message = toStringR(message, env) + toStringR(t.arrayGet(env, 1), env);
                    break;
                case DYNAMIC_TYPE_402:
                    return ZVal.assign(
                            PhpStringTokenParser.runtimeStaticObject.parseDocString(
                                    env, docToken, message));
                case DEFAULT_CASE:
                    runtimeConverterBreakCount = 2;
                    runtimeConverterBreakCount--;
                    break;
            }
            ;
        }

        if (ZVal.isTrue(message)) {
            message = PhpStringTokenParser.runtimeStaticObject.parse(env, message);
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens")
    @ConvertedParameter(
        index = 1,
        name = "catalog",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    protected Object parseTokens(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object tokens = assignParameter(args, 0, false);
        Object catalog = assignParameter(args, 1, false);
        Object sequence = null;
        Object item = null;
        Object tokenIterator = null;
        Object domain = null;
        Object message = null;
        ReferenceContainer key = new BasicReferenceContainer(null);
        Object sequenceKey = null;
        tokenIterator = new ArrayIterator(env, tokens);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (key.setObject(0);
                ZVal.isLessThan(
                        key.getObject(),
                        '<',
                        env.callMethod(tokenIterator, "count", PhpExtractor.class));
                key.setObject(ZVal.increment(key.getObject()))) {
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2137 : ZVal.getIterable(this.sequences, env, true)) {
                sequence = ZVal.assign(zpairResult2137.getValue());
                message = "";
                domain = "messages";
                env.callMethod(tokenIterator, "seek", PhpExtractor.class, key.getObject());
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2138 : ZVal.getIterable(sequence, env, false)) {
                    sequenceKey = ZVal.assign(zpairResult2138.getKey());
                    item = ZVal.assign(zpairResult2138.getValue());
                    this.seekToNextRelevantToken(env, tokenIterator);
                    if (ZVal.strictEqualityCheck(
                            this.normalizeToken(
                                    env,
                                    env.callMethod(tokenIterator, "current", PhpExtractor.class)),
                            "===",
                            item)) {
                        env.callMethod(tokenIterator, "next", PhpExtractor.class);
                        continue;

                    } else if (ZVal.strictEqualityCheck(CONST_MESSAGE_TOKEN, "===", item)) {
                        message = this.getValue(env, tokenIterator);
                        if (ZVal.strictEqualityCheck(
                                function_count.f.env(env).call(sequence).value(),
                                "===",
                                ZVal.add(sequenceKey, 1))) {
                            break;
                        }

                    } else if (ZVal.strictEqualityCheck(
                            CONST_METHOD_ARGUMENTS_TOKEN, "===", item)) {
                        this.skipMethodArgument(env, tokenIterator);

                    } else if (ZVal.strictEqualityCheck(CONST_DOMAIN_TOKEN, "===", item)) {
                        domain = this.getValue(env, tokenIterator);
                        break;

                    } else {
                        break;
                    }
                }

                if (ZVal.isTrue(message)) {
                    env.callMethod(
                            catalog,
                            "set",
                            PhpExtractor.class,
                            message,
                            toStringR(this.prefix, env) + toStringR(message, env),
                            domain);
                    break;
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object canBeExtracted(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this, "isFile", PhpExtractor.class, file))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "php",
                                        "===",
                                        NamespaceGlobal.pathinfo.env(env).call(file, 4).value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    protected Object extractFromDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object finder = null;
        finder = new Finder(env);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(finder, "files", PhpExtractor.class),
                                "name",
                                PhpExtractor.class,
                                "*.php"),
                        "in",
                        PhpExtractor.class,
                        directory));
    }

    public static final Object CONST_MESSAGE_TOKEN = 300;

    public static final Object CONST_METHOD_ARGUMENTS_TOKEN = 1000;

    public static final Object CONST_DOMAIN_TOKEN = 1001;

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Extractor\\PhpExtractor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractFileExtractor.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Extractor\\PhpExtractor")
                    .setLookup(
                            PhpExtractor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("prefix", "sequences")
                    .setFilename("vendor/symfony/translation/Extractor/PhpExtractor.php")
                    .addInterface("Symfony\\Component\\Translation\\Extractor\\ExtractorInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\Translation\\Extractor\\AbstractFileExtractor")
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

    private enum SwitchEnumType138 {
        DYNAMIC_TYPE_399,
        DYNAMIC_TYPE_400,
        DYNAMIC_TYPE_401,
        DYNAMIC_TYPE_402,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
