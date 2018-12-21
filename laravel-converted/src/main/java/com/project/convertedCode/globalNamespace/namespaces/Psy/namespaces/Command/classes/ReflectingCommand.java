package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ErrorException;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunctionAbstract;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ContextAware;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes.Mirror;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NoReturnValue;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ReflectingCommand.php

*/

public abstract class ReflectingCommand extends Command implements ContextAware {

    public Object context = null;

    public ReflectingCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReflectingCommand.class) {
            this.__construct(env, args);
        }
    }

    public ReflectingCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "Psy\\Context")
    public Object setContext(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.context = context;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "valueName")
    protected Object getTarget(RuntimeEnv env, Object... args) {
        Object valueName = assignParameter(args, 0, false);
        Object kind = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        valueName = function_trim.f.env(env).call(valueName).value();
        matches.setObject(ZVal.newArray());
        SwitchEnumType74 switchVariable74 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType74.DEFAULT_CASE,
                        SwitchEnumType74.DYNAMIC_TYPE_262,
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(CONST_CLASS_OR_FUNC, valueName, matches.getObject())
                                .value(),
                        SwitchEnumType74.DYNAMIC_TYPE_263,
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(CONST_CLASS_MEMBER, valueName, matches.getObject())
                                .value(),
                        SwitchEnumType74.DYNAMIC_TYPE_264,
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(CONST_CLASS_STATIC, valueName, matches.getObject())
                                .value(),
                        SwitchEnumType74.DYNAMIC_TYPE_265,
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(CONST_INSTANCE_MEMBER, valueName, matches.getObject())
                                .value());
        switch (switchVariable74) {
            case DYNAMIC_TYPE_262:
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, this.resolveName(env, matches.arrayGet(env, 0), true)),
                                new ZPair(1, ZVal.getNull()),
                                new ZPair(2, 0)));
            case DYNAMIC_TYPE_263:
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, this.resolveName(env, matches.arrayGet(env, 1))),
                                new ZPair(1, matches.arrayGet(env, 2)),
                                new ZPair(
                                        2,
                                        ZVal.toLong(Mirror.CONST_CONSTANT)
                                                | ZVal.toLong(Mirror.CONST_METHOD))));
            case DYNAMIC_TYPE_264:
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, this.resolveName(env, matches.arrayGet(env, 1))),
                                new ZPair(1, matches.arrayGet(env, 2)),
                                new ZPair(
                                        2,
                                        ZVal.toLong(Mirror.CONST_STATIC_PROPERTY)
                                                | ZVal.toLong(Mirror.CONST_PROPERTY))));
            case DYNAMIC_TYPE_265:
                if (ZVal.strictEqualityCheck(matches.arrayGet(env, 2), "===", "->")) {
                    kind = ZVal.toLong(Mirror.CONST_METHOD) | ZVal.toLong(Mirror.CONST_PROPERTY);

                } else {
                    kind = ZVal.toLong(Mirror.CONST_CONSTANT) | ZVal.toLong(Mirror.CONST_METHOD);
                }

                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, this.resolveObject(env, matches.arrayGet(env, 1))),
                                new ZPair(1, matches.arrayGet(env, 3)),
                                new ZPair(2, kind)));
            case DEFAULT_CASE:
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, this.resolveObject(env, valueName)),
                                new ZPair(1, ZVal.getNull()),
                                new ZPair(2, 0)));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "includeFunctions",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object resolveName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object includeFunctions = assignParameter(args, 1, true);
        if (null == includeFunctions) {
            includeFunctions = false;
        }
        Object msg = null;
        Object shell = null;
        Object namespace = null;
        Object fullName = null;
        Object boundObject = null;
        Object boundClass = null;
        shell = env.callMethod(this, "getApplication", ReflectingCommand.class);
        if (function_in_array
                .f
                .env(env)
                .call(
                        NamespaceGlobal.strtolower.env(env).call(name).value(),
                        ZVal.arrayFromList("self", "static"))
                .getBool()) {
            if (ZVal.isTrue(
                    boundClass = env.callMethod(shell, "getBoundClass", ReflectingCommand.class))) {
                return ZVal.assign(boundClass);
            }

            if (ZVal.isTrue(
                    boundObject =
                            env.callMethod(shell, "getBoundObject", ReflectingCommand.class))) {
                return ZVal.assign(function_get_class.f.env(env).call(boundObject).value());
            }

            msg =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Cannot use \"%s\" when no class scope is active",
                                    NamespaceGlobal.strtolower.env(env).call(name).value())
                            .value();
            throw ZVal.getException(env, new ErrorException(env, msg, 0, 256, "eval()'d code", 1));
        }

        if (ZVal.strictEqualityCheck(
                function_substr.f.env(env).call(name, 0, 1).value(), "===", "\\")) {
            return ZVal.assign(name);
        }

        if (ZVal.isTrue(
                namespace = env.callMethod(shell, "getNamespace", ReflectingCommand.class))) {
            fullName = toStringR(namespace, env) + "\\" + toStringR(name, env);
            if (ZVal.toBool(
                            ZVal.toBool(function_class_exists.f.env(env).call(fullName).value())
                                    || ZVal.toBool(
                                            NamespaceGlobal.interface_exists
                                                    .env(env)
                                                    .call(fullName)
                                                    .value()))
                    || ZVal.toBool(
                            ZVal.toBool(includeFunctions)
                                    && ZVal.toBool(
                                            function_function_exists
                                                    .f
                                                    .env(env)
                                                    .call(fullName)
                                                    .value()))) {
                return ZVal.assign(fullName);
            }
        }

        return ZVal.assign(name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "valueName")
    protected Object getTargetAndReflector(RuntimeEnv env, Object... args) {
        Object valueName = assignParameter(args, 0, false);
        Object kind = null;
        Object runtimeTempArrayResult149 = null;
        Object member = null;
        Object value = null;
        ZVal.list(
                runtimeTempArrayResult149 = this.getTarget(env, valueName),
                (value = listGet(runtimeTempArrayResult149, 0, env)),
                (member = listGet(runtimeTempArrayResult149, 1, env)),
                (kind = listGet(runtimeTempArrayResult149, 2, env)));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, value),
                        new ZPair(1, Mirror.runtimeStaticObject.get(env, value, member, kind))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    protected Object resolveCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object e = null;
        Object value = null;
        try {
            value =
                    env.callMethod(
                            env.callMethod(this, "getApplication", ReflectingCommand.class),
                            "execute",
                            ReflectingCommand.class,
                            code,
                            true);
        } catch (ConvertedException convertedException178) {
            if (convertedException178.instanceOf(PHPException.class, "Exception")) {
                e = convertedException178.getObject();
            } else {
                throw convertedException178;
            }
        }

        if (ZVal.toBool(!ZVal.isset(value))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                value, NoReturnValue.class, "Psy\\CodeCleaner\\NoReturnValue"))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unknown target: " + toStringR(code, env)));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    private Object resolveObject(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object value = null;
        value = this.resolveCode(env, code);
        if (!function_is_object.f.env(env).call(value).getBool()) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unable to inspect a non-object"));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolveInstance(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call("`resolveInstance` is deprecated; use `resolveCode` instead.", 16384)
                .value();
        return ZVal.assign(this.resolveCode(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getScopeVariable(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.context, "get", ReflectingCommand.class, name));
    }

    @ConvertedMethod
    protected Object getScopeVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.context, "getAll", ReflectingCommand.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
    protected Object setCommandScopeVariables(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object reflector = assignParameter(args, 0, false);
        Object fileName = null;
        Object classReflector = null;
        Object funcReflector = null;
        ReferenceContainer vars = new BasicReferenceContainer(null);
        vars.setObject(ZVal.newArray());
        switch (toStringR(function_get_class.f.env(env).call(reflector).value())) {
            case "ReflectionClass":
            case "ReflectionObject":
                vars.arrayAccess(env, "__class")
                        .set(toObjectR(reflector).accessProp(this, env).name("name").value());
                if (ZVal.isTrue(
                        env.callMethod(reflector, "inNamespace", ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__namespace")
                            .set(
                                    env.callMethod(
                                            reflector,
                                            "getNamespaceName",
                                            ReflectingCommand.class));
                }

                break;
            case "ReflectionMethod":
                vars.arrayAccess(env, "__method")
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%s::%s",
                                                toObjectR(reflector)
                                                        .accessProp(this, env)
                                                        .name("class")
                                                        .value(),
                                                toObjectR(reflector)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value())
                                        .value());
                vars.arrayAccess(env, "__class")
                        .set(toObjectR(reflector).accessProp(this, env).name("class").value());
                classReflector =
                        env.callMethod(reflector, "getDeclaringClass", ReflectingCommand.class);
                if (ZVal.isTrue(
                        env.callMethod(classReflector, "inNamespace", ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__namespace")
                            .set(
                                    env.callMethod(
                                            classReflector,
                                            "getNamespaceName",
                                            ReflectingCommand.class));
                }

                break;
            case "ReflectionFunction":
                vars.arrayAccess(env, "__function")
                        .set(toObjectR(reflector).accessProp(this, env).name("name").value());
                if (ZVal.isTrue(
                        env.callMethod(reflector, "inNamespace", ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__namespace")
                            .set(
                                    env.callMethod(
                                            reflector,
                                            "getNamespaceName",
                                            ReflectingCommand.class));
                }

                break;
            case "ReflectionGenerator":
                funcReflector = env.callMethod(reflector, "getFunction", ReflectingCommand.class);
                vars.arrayAccess(env, "__function")
                        .set(toObjectR(funcReflector).accessProp(this, env).name("name").value());
                if (ZVal.isTrue(
                        env.callMethod(funcReflector, "inNamespace", ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__namespace")
                            .set(
                                    env.callMethod(
                                            funcReflector,
                                            "getNamespaceName",
                                            ReflectingCommand.class));
                }

                if (ZVal.isTrue(
                        fileName =
                                env.callMethod(
                                        reflector, "getExecutingFile", ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__file").set(fileName);
                    vars.arrayAccess(env, "__line")
                            .set(
                                    env.callMethod(
                                            reflector,
                                            "getExecutingLine",
                                            ReflectingCommand.class));
                    vars.arrayAccess(env, "__dir")
                            .set(function_dirname.f.env(env).call(fileName).value());
                }

                break;
            case "ReflectionProperty":
            case "ReflectionClassConstant":
            case "Psy\\Reflection\\ReflectionClassConstant":
                classReflector =
                        env.callMethod(reflector, "getDeclaringClass", ReflectingCommand.class);
                vars.arrayAccess(env, "__class")
                        .set(toObjectR(classReflector).accessProp(this, env).name("name").value());
                if (ZVal.isTrue(
                        env.callMethod(classReflector, "inNamespace", ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__namespace")
                            .set(
                                    env.callMethod(
                                            classReflector,
                                            "getNamespaceName",
                                            ReflectingCommand.class));
                }

                if (ZVal.isTrue(
                        fileName =
                                env.callMethod(
                                        env.callMethod(
                                                reflector,
                                                "getDeclaringClass",
                                                ReflectingCommand.class),
                                        "getFileName",
                                        ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__file").set(fileName);
                    vars.arrayAccess(env, "__dir")
                            .set(function_dirname.f.env(env).call(fileName).value());
                }

                break;
            case "Psy\\Reflection\\ReflectionConstant_":
                if (ZVal.isTrue(
                        env.callMethod(reflector, "inNamespace", ReflectingCommand.class))) {
                    vars.arrayAccess(env, "__namespace")
                            .set(
                                    env.callMethod(
                                            reflector,
                                            "getNamespaceName",
                                            ReflectingCommand.class));
                }

                break;
        }
        ;
        if (ZVal.toBool(ZVal.checkInstanceType(reflector, ReflectionClass.class, "ReflectionClass"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                reflector,
                                ReflectionFunctionAbstract.class,
                                "ReflectionFunctionAbstract"))) {
            if (ZVal.isTrue(
                    fileName = env.callMethod(reflector, "getFileName", ReflectingCommand.class))) {
                vars.arrayAccess(env, "__file").set(fileName);
                vars.arrayAccess(env, "__line")
                        .set(env.callMethod(reflector, "getStartLine", ReflectingCommand.class));
                vars.arrayAccess(env, "__dir")
                        .set(function_dirname.f.env(env).call(fileName).value());
            }
        }

        env.callMethod(
                this.context,
                "setCommandScopeVariables",
                ReflectingCommand.class,
                vars.getObject());
        return null;
    }

    public static final Object CONST_CLASS_OR_FUNC = "/^[\\\\\\w]+$/";

    public static final Object CONST_CLASS_MEMBER = "/^([\\\\\\w]+)::(\\w+)$/";

    public static final Object CONST_CLASS_STATIC = "/^([\\\\\\w]+)::\\$(\\w+)$/";

    public static final Object CONST_INSTANCE_MEMBER = "/^(\\$\\w+)(::|->)(\\w+)$/";

    public static final Object CONST_class = "Psy\\Command\\ReflectingCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\ReflectingCommand")
                    .setLookup(
                            ReflectingCommand.class,
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
                    .setFilename("vendor/psy/psysh/src/Command/ReflectingCommand.php")
                    .addInterface("Psy\\ContextAware")
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

    private enum SwitchEnumType74 {
        DYNAMIC_TYPE_262,
        DYNAMIC_TYPE_263,
        DYNAMIC_TYPE_264,
        DYNAMIC_TYPE_265,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
