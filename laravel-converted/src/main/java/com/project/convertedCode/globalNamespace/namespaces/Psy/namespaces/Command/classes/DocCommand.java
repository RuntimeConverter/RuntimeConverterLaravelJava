package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.DocblockFormatter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionLanguageConstruct;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ReflectingCommand;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.SignatureFormatter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/DocCommand.php

*/

public class DocCommand extends ReflectingCommand {

    public DocCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DocCommand.class) {
            this.__construct(env, args);
        }
    }

    public DocCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(this, "setName", DocCommand.class, "doc"),
                                        "setAliases",
                                        DocCommand.class,
                                        ZVal.arrayFromList("rtfm", "man")),
                                "setDefinition",
                                DocCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new CodeArgument(
                                                        env,
                                                        "target",
                                                        CodeArgument.CONST_REQUIRED,
                                                        "Function, class, instance, constant, method or property to document.")))),
                        "setDescription",
                        DocCommand.class,
                        "Read the documentation for an object, class, constant, method or property."),
                "setHelp",
                DocCommand.class,
                "Read the documentation for an object, class, constant, method or property.\n\nIt's awesome for well-documented code, not quite as awesome for poorly documented code.\n\ne.g.\n<return>>>> doc preg_replace</return>\n<return>>>> doc Psy\\Shell</return>\n<return>>>> doc Psy\\Shell::debug</return>\n<return>>>> $s = new Psy\\Shell</return>\n<return>>>> doc $s->run</return>");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    protected Object execute(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Command")
                        .setFile("/vendor/psy/psysh/src/Command/DocCommand.php");
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object reflector = null;
        Object doc = null;
        Object ternaryExpressionTemp = null;
        Object runtimeTempArrayResult144 = null;
        Object value = null;
        Object db = null;
        Object target = null;
        value = env.callMethod(input, "getArgument", DocCommand.class, "target");
        if (ZVal.isTrue(
                ReflectionLanguageConstruct.runtimeStaticObject.isLanguageConstruct(env, value))) {
            reflector = new ReflectionLanguageConstruct(env, value);
            doc = this.getManualDocById(env, value);

        } else {
            ZVal.list(
                    runtimeTempArrayResult144 =
                            env.callMethod(this, "getTargetAndReflector", DocCommand.class, value),
                    (target = listGet(runtimeTempArrayResult144, 0, env)),
                    (reflector = listGet(runtimeTempArrayResult144, 1, env)));
            doc =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = this.getManualDoc(env, reflector))
                                    ? ternaryExpressionTemp
                                    : DocblockFormatter.runtimeStaticObject.format(env, reflector));
        }

        db =
                env.callMethod(
                        env.callMethod(this, "getApplication", DocCommand.class),
                        "getManualDb",
                        DocCommand.class);
        env.callMethod(
                output,
                "page",
                DocCommand.class,
                new Closure(env, runtimeConverterFunctionClassConstants, "Psy\\Command", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "output")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object output = assignParameter(args, 0, false);
                        Object reflector = null;
                        Object doc = null;
                        Object db = null;
                        reflector = this.contextReferences.getCapturedValue("reflector");
                        doc = this.contextReferences.getCapturedValue("doc");
                        db = this.contextReferences.getCapturedValue("db");
                        env.callMethod(
                                output,
                                "writeln",
                                DocCommand.class,
                                SignatureFormatter.runtimeStaticObject.format(env, reflector));
                        env.callMethod(output, "writeln", DocCommand.class, "");
                        if (ZVal.toBool(ZVal.isEmpty(doc)) && ZVal.toBool(!ZVal.isTrue(db))) {
                            env.callMethod(
                                    output,
                                    "writeln",
                                    DocCommand.class,
                                    "<warning>PHP manual not found</warning>");
                            env.callMethod(
                                    output,
                                    "writeln",
                                    DocCommand.class,
                                    "    To document core PHP functionality, download the PHP reference manual:");
                            env.callMethod(
                                    output,
                                    "writeln",
                                    DocCommand.class,
                                    "    https://github.com/bobthecow/psysh/wiki/PHP-manual");

                        } else {
                            env.callMethod(output, "writeln", DocCommand.class, doc);
                        }

                        return null;
                    }
                }.use("reflector", reflector).use("doc", doc).use("db", db));
        env.callMethod(this, "setCommandScopeVariables", DocCommand.class, reflector);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector")
    private Object getManualDoc(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object reflector = assignParameter(args, 0, false);
        Object id = null;
        SwitchEnumType73 switchVariable73 =
                ZVal.getEnum(
                        function_get_class.f.env(env).call(reflector).value(),
                        SwitchEnumType73.DEFAULT_CASE,
                        SwitchEnumType73.STRING_ReflectionClass,
                        "ReflectionClass",
                        SwitchEnumType73.STRING_ReflectionObject,
                        "ReflectionObject",
                        SwitchEnumType73.STRING_ReflectionFunction,
                        "ReflectionFunction",
                        SwitchEnumType73.STRING_ReflectionMethod,
                        "ReflectionMethod",
                        SwitchEnumType73.STRING_ReflectionProperty,
                        "ReflectionProperty",
                        SwitchEnumType73.STRING_ReflectionClassConstant,
                        "ReflectionClassConstant",
                        SwitchEnumType73.STRING_Psy_Reflection_ReflectionClassConstant,
                        "Psy\\Reflection\\ReflectionClassConstant",
                        SwitchEnumType73.STRING_Psy_Reflection_ReflectionConstant_,
                        "Psy\\Reflection\\ReflectionConstant_");
        switch (switchVariable73) {
            case STRING_ReflectionClass:
            case STRING_ReflectionObject:
            case STRING_ReflectionFunction:
                id = ZVal.assign(toObjectR(reflector).accessProp(this, env).name("name").value());
                break;
            case STRING_ReflectionMethod:
                id =
                        toStringR(
                                        toObjectR(reflector)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value(),
                                        env)
                                + "::"
                                + toStringR(
                                        toObjectR(reflector)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        env);
                break;
            case STRING_ReflectionProperty:
                id =
                        toStringR(
                                        toObjectR(reflector)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value(),
                                        env)
                                + "::$"
                                + toStringR(
                                        toObjectR(reflector)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        env);
                break;
            case STRING_ReflectionClassConstant:
            case STRING_Psy_Reflection_ReflectionClassConstant:
                id =
                        toStringR(
                                        toObjectR(reflector)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value(),
                                        env)
                                + "::"
                                + toStringR(
                                        toObjectR(reflector)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        env);
                break;
            case STRING_Psy_Reflection_ReflectionConstant_:
                id = ZVal.assign(toObjectR(reflector).accessProp(this, env).name("name").value());
                break;
            case DEFAULT_CASE:
                return ZVal.assign(false);
        }
        ;
        return ZVal.assign(this.getManualDocById(env, id));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    private Object getManualDocById(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object db = null;
        if (ZVal.isTrue(
                db =
                        env.callMethod(
                                env.callMethod(this, "getApplication", DocCommand.class),
                                "getManualDb",
                                DocCommand.class))) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    db,
                                    "query",
                                    DocCommand.class,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "SELECT doc FROM php_manual WHERE id = %s",
                                                    env.callMethod(
                                                            db, "quote", DocCommand.class, id))
                                            .value()),
                            "fetchColumn",
                            DocCommand.class,
                            0));
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\Command\\DocCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ReflectingCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\DocCommand")
                    .setLookup(
                            DocCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "context",
                            "definition",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/DocCommand.php")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass("Psy\\Command\\ReflectingCommand")
                    .addExtendsClass("Psy\\Command\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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

    private enum SwitchEnumType73 {
        STRING_ReflectionClass,
        STRING_ReflectionObject,
        STRING_ReflectionFunction,
        STRING_ReflectionMethod,
        STRING_ReflectionProperty,
        STRING_ReflectionClassConstant,
        STRING_Psy_Reflection_ReflectionClassConstant,
        STRING_Psy_Reflection_ReflectionConstant_,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
