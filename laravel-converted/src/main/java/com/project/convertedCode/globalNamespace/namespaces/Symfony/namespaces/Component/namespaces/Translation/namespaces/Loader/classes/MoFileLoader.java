package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.FileLoader;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/MoFileLoader.php

*/

public class MoFileLoader extends FileLoader {

    public MoFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MoFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object loadResource(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope178 scope = new Scope178();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/translation/Loader")
                            .setFile("/vendor/symfony/translation/Loader/MoFileLoader.php");
            int runtimeConverterContinueCount;
            scope.resource = assignParameter(args, 0, false);
            scope.magic = null;
            scope.pluralId = null;
            scope.stat = new BasicReferenceContainer(null);
            scope.item = new BasicReferenceContainer(null);
            scope.plural = null;
            scope.offset = null;
            scope.plurals = new BasicReferenceContainer(null);
            scope.offsetTranslated = null;
            scope.count = null;
            scope.length = null;
            scope.i = new BasicReferenceContainer(null);
            scope.translated = null;
            scope.singularId = null;
            scope.runtimeTempArrayResult214 = null;
            scope.stream = null;
            scope.isBigEndian = null;
            scope.messages = new BasicReferenceContainer(null);
            scope.ids = null;
            scope.offsetId = null;
            scope.stream = function_fopen.f.env(env).call(scope.resource, "r").value();
            scope.stat.setObject(NamespaceGlobal.fstat.env(env).call(scope.stream).value());
            if (ZVal.isLessThan(scope.stat.arrayGet(env, "size"), '<', CONST_MO_HEADER_SIZE)) {
                throw ZVal.getException(
                        env,
                        new InvalidResourceException(
                                env, "MO stream content has an invalid format."));
            }

            scope.magic =
                    NamespaceGlobal.unpack
                            .env(env)
                            .call("V1", function_fread.f.env(env).call(scope.stream, 4).value())
                            .value();
            scope.magic =
                    NamespaceGlobal.hexdec
                            .env(env)
                            .call(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.dechex
                                                            .env(env)
                                                            .call(
                                                                    function_current
                                                                            .f
                                                                            .env(env)
                                                                            .call(scope.magic)
                                                                            .value())
                                                            .value(),
                                                    -8)
                                            .value())
                            .value();
            if (ZVal.equalityCheck(CONST_MO_LITTLE_ENDIAN_MAGIC, scope.magic)) {
                scope.isBigEndian = false;

            } else if (ZVal.equalityCheck(CONST_MO_BIG_ENDIAN_MAGIC, scope.magic)) {
                scope.isBigEndian = true;

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidResourceException(
                                env, "MO stream content has an invalid format."));
            }

            this.readLong(env, scope.stream, scope.isBigEndian);
            scope.count = this.readLong(env, scope.stream, scope.isBigEndian);
            scope.offsetId = this.readLong(env, scope.stream, scope.isBigEndian);
            scope.offsetTranslated = this.readLong(env, scope.stream, scope.isBigEndian);
            this.readLong(env, scope.stream, scope.isBigEndian);
            this.readLong(env, scope.stream, scope.isBigEndian);
            scope.messages.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (scope.i.setObject(0);
                    ZVal.isLessThan(scope.i.getObject(), '<', scope.count);
                    scope.i.setObject(ZVal.increment(scope.i.getObject()))) {
                scope.pluralId = ZVal.getNull();
                scope.translated = ZVal.getNull();
                NamespaceGlobal.fseek
                        .env(env)
                        .call(
                                scope.stream,
                                ZVal.add(scope.offsetId, ZVal.multiply(scope.i.getObject(), 8)));
                scope.length = this.readLong(env, scope.stream, scope.isBigEndian);
                scope.offset = this.readLong(env, scope.stream, scope.isBigEndian);
                if (ZVal.isLessThan(scope.length, '<', 1)) {
                    continue;
                }

                NamespaceGlobal.fseek.env(env).call(scope.stream, scope.offset);
                scope.singularId =
                        function_fread.f.env(env).call(scope.stream, scope.length).value();
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        function_strpos.f.env(env).call(scope.singularId, "\u0000").value())) {
                    ZVal.list(
                            scope.runtimeTempArrayResult214 =
                                    function_explode
                                            .f
                                            .env(env)
                                            .call("\u0000", scope.singularId)
                                            .value(),
                            (scope.singularId = listGet(scope.runtimeTempArrayResult214, 0, env)),
                            (scope.pluralId = listGet(scope.runtimeTempArrayResult214, 1, env)));
                }

                NamespaceGlobal.fseek
                        .env(env)
                        .call(
                                scope.stream,
                                ZVal.add(
                                        scope.offsetTranslated,
                                        ZVal.multiply(scope.i.getObject(), 8)));
                scope.length = this.readLong(env, scope.stream, scope.isBigEndian);
                scope.offset = this.readLong(env, scope.stream, scope.isBigEndian);
                if (ZVal.isLessThan(scope.length, '<', 1)) {
                    continue;
                }

                NamespaceGlobal.fseek.env(env).call(scope.stream, scope.offset);
                scope.translated =
                        function_fread.f.env(env).call(scope.stream, scope.length).value();
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        function_strpos.f.env(env).call(scope.translated, "\u0000").value())) {
                    scope.translated =
                            function_explode.f.env(env).call("\u0000", scope.translated).value();
                }

                scope.ids =
                        ZVal.newArray(
                                new ZPair("singular", scope.singularId),
                                new ZPair("plural", scope.pluralId));
                scope.item.setObject(
                        function_compact.f.env(env).call(stack, "ids", "translated").value());
                if (function_is_array
                        .f
                        .env(env)
                        .call(scope.item.arrayGet(env, "translated"))
                        .getBool()) {
                    scope.messages
                            .arrayAccess(env, scope.item.arrayGet(env, "ids", "singular"))
                            .set(
                                    NamespaceGlobal.stripcslashes
                                            .env(env)
                                            .call(scope.item.arrayGet(env, "translated", 0))
                                            .value());
                    if (arrayActionR(ArrayAction.ISSET, scope.item, env, "ids", "plural")) {
                        scope.plurals.setObject(ZVal.newArray());
                        runtimeConverterContinueCount = 0;
                        for (ZPair zpairResult2143 :
                                ZVal.getIterable(
                                        scope.item.arrayGet(env, "translated"), env, false)) {
                            scope.plural = ZVal.assign(zpairResult2143.getKey());
                            scope.translated = ZVal.assign(zpairResult2143.getValue());
                            scope.plurals
                                    .arrayAppend(env)
                                    .set(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call("{%d} %s", scope.plural, scope.translated)
                                                    .value());
                        }

                        scope.messages
                                .arrayAccess(env, scope.item.arrayGet(env, "ids", "plural"))
                                .set(
                                        NamespaceGlobal.stripcslashes
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.implode
                                                                .env(env)
                                                                .call(
                                                                        "|",
                                                                        scope.plurals.getObject())
                                                                .value())
                                                .value());
                    }

                } else if (!arrayActionR(ArrayAction.EMPTY, scope.item, env, "ids", "singular")) {
                    scope.messages
                            .arrayAccess(env, scope.item.arrayGet(env, "ids", "singular"))
                            .set(
                                    NamespaceGlobal.stripcslashes
                                            .env(env)
                                            .call(scope.item.arrayGet(env, "translated"))
                                            .value());
                }
            }

            function_fclose.f.env(env).call(scope.stream);
            throw new IncludeEventException(
                    ZVal.assign(
                            function_array_filter
                                    .f
                                    .env(env)
                                    .call(scope.messages.getObject())
                                    .value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    @ConvertedParameter(index = 1, name = "isBigEndian", typeHint = "bool")
    private Object readLong(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        Object isBigEndian = assignParameter(args, 1, false);
        Object result = null;
        result =
                NamespaceGlobal.unpack
                        .env(env)
                        .call(
                                ZVal.isTrue(isBigEndian) ? "N1" : "V1",
                                function_fread.f.env(env).call(stream, 4).value())
                        .value();
        result = function_current.f.env(env).call(result).value();
        return ZVal.assign(ZVal.toLong(function_substr.f.env(env).call(result, -8).value()));
    }

    public static final Object CONST_MO_LITTLE_ENDIAN_MAGIC = 2500072158L;

    public static final Object CONST_MO_BIG_ENDIAN_MAGIC = 3725722773L;

    public static final Object CONST_MO_HEADER_SIZE = 28;

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\MoFileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Loader\\MoFileLoader")
                    .setLookup(
                            MoFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/MoFileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\FileLoader")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\ArrayLoader")
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

    private static class Scope178 implements UpdateRuntimeScopeInterface {

        Object magic;
        Object pluralId;
        ReferenceContainer stat;
        ReferenceContainer item;
        Object plural;
        Object offset;
        ReferenceContainer plurals;
        Object resource;
        Object offsetTranslated;
        Object _thisVarAlias;
        Object count;
        Object length;
        ReferenceContainer i;
        Object translated;
        Object singularId;
        Object runtimeTempArrayResult214;
        Object stream;
        Object isBigEndian;
        ReferenceContainer messages;
        Object ids;
        Object offsetId;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("magic", this.magic);
            stack.setVariable("pluralId", this.pluralId);
            stack.setVariable("stat", this.stat);
            stack.setVariable("item", this.item);
            stack.setVariable("plural", this.plural);
            stack.setVariable("offset", this.offset);
            stack.setVariable("plurals", this.plurals);
            stack.setVariable("resource", this.resource);
            stack.setVariable("offsetTranslated", this.offsetTranslated);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("count", this.count);
            stack.setVariable("length", this.length);
            stack.setVariable("i", this.i);
            stack.setVariable("translated", this.translated);
            stack.setVariable("singularId", this.singularId);
            stack.setVariable("runtimeTempArrayResult214", this.runtimeTempArrayResult214);
            stack.setVariable("stream", this.stream);
            stack.setVariable("isBigEndian", this.isBigEndian);
            stack.setVariable("messages", this.messages);
            stack.setVariable("ids", this.ids);
            stack.setVariable("offsetId", this.offsetId);
        }

        public void updateScope(RuntimeStack stack) {

            this.magic = stack.getVariable("magic");
            this.pluralId = stack.getVariable("pluralId");
            this.stat = ZVal.getStackReference(stack.getVariable("stat"));
            this.item = ZVal.getStackReference(stack.getVariable("item"));
            this.plural = stack.getVariable("plural");
            this.offset = stack.getVariable("offset");
            this.plurals = ZVal.getStackReference(stack.getVariable("plurals"));
            this.resource = stack.getVariable("resource");
            this.offsetTranslated = stack.getVariable("offsetTranslated");
            this._thisVarAlias = stack.getVariable("this");
            this.count = stack.getVariable("count");
            this.length = stack.getVariable("length");
            this.i = ZVal.getStackReference(stack.getVariable("i"));
            this.translated = stack.getVariable("translated");
            this.singularId = stack.getVariable("singularId");
            this.runtimeTempArrayResult214 = stack.getVariable("runtimeTempArrayResult214");
            this.stream = stack.getVariable("stream");
            this.isBigEndian = stack.getVariable("isBigEndian");
            this.messages = ZVal.getStackReference(stack.getVariable("messages"));
            this.ids = stack.getVariable("ids");
            this.offsetId = stack.getVariable("offsetId");
        }
    }
}
