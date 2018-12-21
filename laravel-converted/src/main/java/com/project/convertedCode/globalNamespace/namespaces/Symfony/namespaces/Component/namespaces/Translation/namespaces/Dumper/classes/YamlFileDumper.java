package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.FileDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Util.classes.ArrayConverter;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/YamlFileDumper.php

*/

public class YamlFileDumper extends FileDumper {

    public Object extension = null;

    public YamlFileDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == YamlFileDumper.class) {
            this.__construct(env, args);
        }
    }

    public YamlFileDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extension", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object extension = assignParameter(args, 0, true);
        if (null == extension) {
            extension = "yml";
        }
        this.extension = extension;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object formatCatalogue(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object data = null;
        Object inline = null;
        if (!function_class_exists.f.env(env).call("Symfony\\Component\\Yaml\\Yaml").getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Dumping translations in the YAML format requires the Symfony Yaml component."));
        }

        data = env.callMethod(messages, "all", YamlFileDumper.class, domain);
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "as_tree"))
                && ZVal.toBool(options.arrayGet(env, "as_tree"))) {
            data = ArrayConverter.runtimeStaticObject.expandToTree(env, data);
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "inline"))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                inline = ZVal.assign(ZVal.toLong(options.arrayGet(env, "inline"))),
                                '>',
                                0))) {
            return ZVal.assign(
                    StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Yaml"), env)
                            .callUnknownStaticMethod(
                                    env, "dump", new RuntimeArgsWithReferences(), data, inline));
        }

        return ZVal.assign(
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Yaml"), env)
                        .callUnknownStaticMethod(
                                env, "dump", new RuntimeArgsWithReferences(), data));
    }

    @ConvertedMethod
    protected Object getExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.extension);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\YamlFileDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Dumper\\YamlFileDumper")
                    .setLookup(
                            YamlFileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extension", "relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/YamlFileDumper.php")
                    .addInterface("Symfony\\Component\\Translation\\Dumper\\DumperInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Dumper\\FileDumper")
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
