package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_unregister;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_register;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.nativeFunctions.file.function_chdir;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_uses;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/DebugClassLoader.php

*/

public class DebugClassLoader extends RuntimeClassBase {

    public Object classLoader = null;

    public Object isFinder = null;

    public Object loaded = ZVal.newArray();

    public DebugClassLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DebugClassLoader.class) {
            this.__construct(env, args);
        }
    }

    public DebugClassLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classLoader", typeHint = "callable")
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer classLoader =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object file = null;
        Object test = null;
        Object i = null;
        Object dir = null;
        this.classLoader = classLoader.getObject();
        this.isFinder =
                ZVal.toBool(function_is_array.f.env(env).call(classLoader.getObject()).value())
                        && ZVal.toBool(
                                function_method_exists
                                        .f
                                        .env(env)
                                        .call(classLoader.arrayGet(env, 0), "findFile")
                                        .value());
        if (!ZVal.isset(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Debug
                                        .classes
                                        .DebugClassLoader
                                        .RequestStaticProperties
                                        .class)
                        .caseCheck)) {
            file =
                    ZVal.assign(
                            function_file_exists
                                            .f
                                            .env(env)
                                            .call(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/symfony/debug/DebugClassLoader.php"))
                                            .getBool()
                                    ? env.addRootFilesystemPrefix(
                                            "/vendor/symfony/debug/DebugClassLoader.php")
                                    : function_rtrim
                                            .f
                                            .env(env)
                                            .call(
                                                    function_realpath.f.env(env).call(".").value(),
                                                    "/")
                                            .value());
            i = NamespaceGlobal.strrpos.env(env).call(file, "/").value();
            dir = function_substr.f.env(env).call(file, 0, ZVal.add(1, i)).value();
            file = function_substr.f.env(env).call(file, ZVal.add(1, i)).value();
            test =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(
                                            NamespaceGlobal.strtoupper.env(env).call(file).value(),
                                            "===",
                                            file)
                                    ? NamespaceGlobal.strtolower.env(env).call(file).value()
                                    : NamespaceGlobal.strtoupper.env(env).call(file).value());
            test =
                    function_realpath
                            .f
                            .env(env)
                            .call(toStringR(dir, env) + toStringR(test, env))
                            .value();
            if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", test))
                    || ZVal.toBool(ZVal.strictEqualityCheck(false, "===", i))) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class)
                                .caseCheck =
                        0;

            } else if (ZVal.strictEqualityCheck(
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    test,
                                    ZVal.minusSign(function_strlen.f.env(env).call(file).value()))
                            .value(),
                    "===",
                    file)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class)
                                .caseCheck =
                        1;

            } else if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_stripos.f.env(env).call("Linux", "darwin").value())) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class)
                                .caseCheck =
                        2;

            } else {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class)
                                .caseCheck =
                        0;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getClassLoader(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.classLoader);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object loadClass(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope62 scope = new Scope62();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/debug")
                            .setFile("/vendor/symfony/debug/DebugClassLoader.php");
            scope._pClass = assignParameter(args, 0, false);
            scope.wasCached = null;
            scope.file = null;
            scope.e = null;
            scope.ternaryExpressionTemp = null;
            scope.e =
                    function_error_reporting
                            .f
                            .env(env)
                            .call(
                                    ZVal.toLong(
                                                    ZVal.toLong(
                                                                    ZVal.toLong(
                                                                                    ZVal.toLong(
                                                                                                    function_error_reporting
                                                                                                            .f
                                                                                                            .env(
                                                                                                                    env)
                                                                                                            .call()
                                                                                                            .value())
                                                                                            | ZVal
                                                                                                    .toLong(
                                                                                                            4))
                                                                            | ZVal.toLong(1))
                                                            | ZVal.toLong(16))
                                            | ZVal.toLong(64))
                            .value();
            try {
                if (ZVal.toBool(this.isFinder)
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(
                                                scope._thisVarAlias, "loaded", env),
                                        env,
                                        scope._pClass))) {
                    new ReferenceClassProperty(scope._thisVarAlias, "loaded", env)
                            .arrayAccess(env, scope._pClass)
                            .set(true);
                    if (ZVal.isTrue(
                            scope.file =
                                    ZVal.assign(
                                            ZVal.isTrue(
                                                            scope.ternaryExpressionTemp =
                                                                    env.callMethod(
                                                                            new ReferenceClassProperty(
                                                                                            scope._thisVarAlias,
                                                                                            "classLoader",
                                                                                            env)
                                                                                    .arrayGet(
                                                                                            env, 0),
                                                                            "findFile",
                                                                            DebugClassLoader.class,
                                                                            scope._pClass))
                                                    ? scope.ternaryExpressionTemp
                                                    : false))) {
                        scope.wasCached =
                                ZVal.toBool(
                                                function_function_exists
                                                        .f
                                                        .env(env)
                                                        .call("opcache_is_script_cached")
                                                        .value())
                                        && ZVal.toBool(
                                                com.runtimeconverter.runtime.ZVal.functionNotFound(
                                                                "opcache_is_script_cached")
                                                        .env(env)
                                                        .call(scope.file)
                                                        .value());
                        env.include(
                                toStringR(scope.file, env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                true,
                                false);
                        if (ZVal.isTrue(scope.wasCached)) {
                            throw new IncludeEventException(null);
                        }
                    }

                } else {
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.classLoader, scope._pClass);
                    scope.file = false;
                }

            } catch (ConvertedException convertedException246) {

                throw convertedException246;
            } finally {
                function_error_reporting.f.env(env).call(scope.e);
            }

            this.checkClass(env, scope._pClass, scope.file);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "file",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object checkClass(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer _pClass = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object file = assignParameter(args, 1, true);
        if (null == file) {
            file = ZVal.getNull();
        }
        Object parent = null;
        Object kFile = null;
        Object ns = null;
        Object use = null;
        Object refl = null;
        ReferenceContainer parentAndTraits = new BasicReferenceContainer(null);
        Object type = null;
        ReferenceContainer dir = new BasicReferenceContainer(null);
        ReferenceContainer dirFiles = new BasicReferenceContainer(null);
        Object kDir = null;
        Object len = null;
        Object property = null;
        Object runtimeTempArrayResult187 = null;
        Object runtimeTempArrayResult186 = null;
        ReferenceContainer notice = new BasicReferenceContainer(null);
        Object annotation = null;
        Object isClass = null;
        Object method = null;
        ReferenceContainer tail = new BasicReferenceContainer(null);
        ReferenceContainer f = new BasicReferenceContainer(null);
        Object verb = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        ReferenceContainer j = new BasicReferenceContainer(null);
        ReferenceContainer real = new BasicReferenceContainer(null);
        Object k = null;
        Object message = null;
        Object declaringClass = null;
        Object tailLen = null;
        Object name = null;
        Object exists = null;
        Object doc = null;
        exists =
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        ZVal.getNull(),
                                                                        "===",
                                                                        file))
                                                        || ZVal.toBool(
                                                                function_class_exists
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                _pClass.getObject(),
                                                                                false)
                                                                        .value()))
                                        || ZVal.toBool(
                                                NamespaceGlobal.interface_exists
                                                        .env(env)
                                                        .call(_pClass.getObject(), false)
                                                        .value()))
                        || ZVal.toBool(
                                NamespaceGlobal.trait_exists
                                        .env(env)
                                        .call(_pClass.getObject(), false)
                                        .value());
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", file))
                                && ZVal.toBool(_pClass.getObject()))
                && ZVal.toBool(ZVal.strictEqualityCheck("\\", "===", _pClass.arrayGet(env, 0)))) {
            _pClass.setObject(function_substr.f.env(env).call(_pClass.getObject(), 1).value());
        }

        if (ZVal.isTrue(exists)) {
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Debug
                                    .classes
                                    .DebugClassLoader
                                    .RequestStaticProperties
                                    .class,
                            "checkedClasses"),
                    env,
                    _pClass.getObject())) {
                return null;
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Debug
                                    .classes
                                    .DebugClassLoader
                                    .RequestStaticProperties
                                    .class,
                            "checkedClasses")
                    .arrayAccess(env, _pClass.getObject())
                    .set(true);
            refl = new ReflectionClass(env, _pClass.getObject());
            if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", file))
                    && ZVal.toBool(env.callMethod(refl, "isInternal", DebugClassLoader.class))) {
                return null;
            }

            name = env.callMethod(refl, "getName", DebugClassLoader.class);
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(name, "!==", _pClass.getObject()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    NamespaceGlobal.strcasecmp
                                            .env(env)
                                            .call(name, _pClass.getObject())
                                            .value()))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Case mismatch between loaded and declared class names: \"%s\" vs \"%s\".",
                                                _pClass.getObject(), name)
                                        .value()));
            }

            if (ZVal.isGreaterThan(
                    2,
                    '>',
                    len =
                            ZVal.add(
                                    1,
                                    ZVal.isTrue(
                                                    ternaryExpressionTemp =
                                                            function_strpos
                                                                    .f
                                                                    .env(env)
                                                                    .call(name, "\\")
                                                                    .value())
                                            ? ternaryExpressionTemp
                                            : function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(name, "_")
                                                    .value()))) {
                len = 0;
                ns = "";

            } else {
                ns = function_substr.f.env(env).call(name, 0, len).value();
            }

            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    doc = env.callMethod(refl, "getDocComment", DebugClassLoader.class))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1760 :
                        ZVal.getIterable(
                                ZVal.arrayFromList("final", "deprecated", "internal"), env, true)) {
                    annotation = ZVal.assign(zpairResult1760.getValue());
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            false,
                                            "!==",
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(doc, annotation)
                                                    .value()))
                            && ZVal.toBool(
                                    function_preg_match
                                            .f
                                            .env(env)
                                            .addReferenceArgs(
                                                    new RuntimeArgsWithReferences().add(2, notice))
                                            .call(
                                                    "#\\n \\* @"
                                                            + toStringR(annotation, env)
                                                            + "(?:( .+?)\\.?)?\\r?\\n \\*(?: @|/$)#s",
                                                    doc,
                                                    notice.getObject())
                                            .value())) {
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class,
                                        annotation)
                                .arrayAccess(env, name)
                                .set(
                                        arrayActionR(ArrayAction.ISSET, notice, env, 1)
                                                ? function_preg_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "#\\s*\\r?\\n \\* +#",
                                                                " ",
                                                                notice.arrayGet(env, 1))
                                                        .value()
                                                : "");
                    }
                }
            }

            parentAndTraits.setObject(function_class_uses.f.env(env).call(name, false).value());
            if (ZVal.isTrue(
                    parent =
                            NamespaceGlobal.get_parent_class
                                    .env(env)
                                    .call(_pClass.getObject())
                                    .value())) {
                parentAndTraits.arrayAppend(env).set(parent);
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Debug
                                        .classes
                                        .DebugClassLoader
                                        .RequestStaticProperties
                                        .class,
                                "checkedClasses"),
                        env,
                        parent)) {
                    this.checkClass(env, parent);
                }

                if (arrayActionR(
                        ArrayAction.ISSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Debug
                                        .classes
                                        .DebugClassLoader
                                        .RequestStaticProperties
                                        .class,
                                "final"),
                        env,
                        parent)) {
                    NamespaceGlobal.trigger_error
                            .env(env)
                            .call(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "The \"%s\" class is considered final%s. It may change without further notice as of its next major version. You should not extend it from \"%s\".",
                                                    parent,
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Symfony
                                                                            .namespaces
                                                                            .Component
                                                                            .namespaces
                                                                            .Debug
                                                                            .classes
                                                                            .DebugClassLoader
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "final")
                                                            .arrayGet(env, parent),
                                                    name)
                                            .value(),
                                    16384)
                            .value();
                }
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1761 :
                    ZVal.getIterable(
                            ZVal.add(
                                    parentAndTraits.getObject(),
                                    this.getOwnInterfaces(env, name, parent)),
                            env,
                            true)) {
                use = ZVal.assign(zpairResult1761.getValue());
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Debug
                                        .classes
                                        .DebugClassLoader
                                        .RequestStaticProperties
                                        .class,
                                "checkedClasses"),
                        env,
                        use)) {
                    this.checkClass(env, use);
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .DebugClassLoader
                                                        .RequestStaticProperties
                                                        .class,
                                                "deprecated"),
                                        env,
                                        use))
                        && ZVal.toBool(
                                NamespaceGlobal.strncmp.env(env).call(ns, use, len).value())) {
                    type =
                            ZVal.assign(
                                    function_class_exists.f.env(env).call(name, false).getBool()
                                            ? "class"
                                            : NamespaceGlobal.interface_exists
                                                            .env(env)
                                                            .call(name, false)
                                                            .getBool()
                                                    ? "interface"
                                                    : "trait");
                    verb =
                            ZVal.assign(
                                    ZVal.toBool(
                                                            function_class_exists
                                                                    .f
                                                                    .env(env)
                                                                    .call(use, false)
                                                                    .value())
                                                    || ZVal.toBool(
                                                            NamespaceGlobal.interface_exists
                                                                    .env(env)
                                                                    .call(name, false)
                                                                    .value())
                                            ? "extends"
                                            : NamespaceGlobal.interface_exists
                                                            .env(env)
                                                            .call(use, false)
                                                            .getBool()
                                                    ? "implements"
                                                    : "uses");
                    NamespaceGlobal.trigger_error
                            .env(env)
                            .call(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "The \"%s\" %s %s \"%s\" that is deprecated%s.",
                                                    name,
                                                    type,
                                                    verb,
                                                    use,
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Symfony
                                                                            .namespaces
                                                                            .Component
                                                                            .namespaces
                                                                            .Debug
                                                                            .classes
                                                                            .DebugClassLoader
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "deprecated")
                                                            .arrayGet(env, use))
                                            .value(),
                                    16384)
                            .value();
                }

                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .DebugClassLoader
                                                        .RequestStaticProperties
                                                        .class,
                                                "internal"),
                                        env,
                                        use))
                        && ZVal.toBool(
                                NamespaceGlobal.strncmp.env(env).call(ns, use, len).value())) {
                    NamespaceGlobal.trigger_error
                            .env(env)
                            .call(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "The \"%s\" %s is considered internal%s. It may change without further notice. You should not use it from \"%s\".",
                                                    use,
                                                    function_class_exists
                                                                    .f
                                                                    .env(env)
                                                                    .call(use, false)
                                                                    .getBool()
                                                            ? "class"
                                                            : NamespaceGlobal.interface_exists
                                                                            .env(env)
                                                                            .call(use, false)
                                                                            .getBool()
                                                                    ? "interface"
                                                                    : "trait",
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Symfony
                                                                            .namespaces
                                                                            .Component
                                                                            .namespaces
                                                                            .Debug
                                                                            .classes
                                                                            .DebugClassLoader
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "internal")
                                                            .arrayGet(env, use),
                                                    name)
                                            .value(),
                                    16384)
                            .value();
                }
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Debug
                                    .classes
                                    .DebugClassLoader
                                    .RequestStaticProperties
                                    .class,
                            "finalMethods")
                    .arrayAccess(env, name)
                    .set(ZVal.newArray());
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Debug
                                    .classes
                                    .DebugClassLoader
                                    .RequestStaticProperties
                                    .class,
                            "internalMethods")
                    .arrayAccess(env, name)
                    .set(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1762 : ZVal.getIterable(parentAndTraits.getObject(), env, true)) {
                use = ZVal.assign(zpairResult1762.getValue());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1763 :
                        ZVal.getIterable(
                                ZVal.arrayFromList("finalMethods", "internalMethods"), env, true)) {
                    property = ZVal.assign(zpairResult1763.getValue());
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .DebugClassLoader
                                            .RequestStaticProperties
                                            .class,
                                    property),
                            env,
                            use)) {
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class,
                                        property)
                                .arrayAccess(env, name)
                                .set(
                                        ZVal.isTrue(
                                                        env.getRequestStaticPropertiesReference(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Symfony
                                                                                .namespaces
                                                                                .Component
                                                                                .namespaces
                                                                                .Debug
                                                                                .classes
                                                                                .DebugClassLoader
                                                                                .RequestStaticProperties
                                                                                .class,
                                                                        property)
                                                                .arrayGet(env, name))
                                                ? ZVal.add(
                                                        env.getRequestStaticPropertiesReference(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Symfony
                                                                                .namespaces
                                                                                .Component
                                                                                .namespaces
                                                                                .Debug
                                                                                .classes
                                                                                .DebugClassLoader
                                                                                .RequestStaticProperties
                                                                                .class,
                                                                        property)
                                                                .arrayGet(env, use),
                                                        env.getRequestStaticPropertiesReference(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Symfony
                                                                                .namespaces
                                                                                .Component
                                                                                .namespaces
                                                                                .Debug
                                                                                .classes
                                                                                .DebugClassLoader
                                                                                .RequestStaticProperties
                                                                                .class,
                                                                        property)
                                                                .arrayGet(env, name))
                                                : env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Symfony
                                                                        .namespaces
                                                                        .Component
                                                                        .namespaces
                                                                        .Debug
                                                                        .classes
                                                                        .DebugClassLoader
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                property)
                                                        .arrayGet(env, use));
                    }
                }
            }

            isClass = function_class_exists.f.env(env).call(name, false).value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1764 :
                    ZVal.getIterable(
                            env.callMethod(
                                    refl,
                                    "getMethods",
                                    DebugClassLoader.class,
                                    ZVal.toLong(256) | ZVal.toLong(512)),
                            env,
                            true)) {
                method = ZVal.assign(zpairResult1764.getValue());
                if (ZVal.strictNotEqualityCheck(
                        toObjectR(method).accessProp(this, env).name("class").value(),
                        "!==",
                        name)) {
                    continue;
                }

                if (ZVal.strictNotEqualityCheck(
                        env.callMethod(method, "getFilename", DebugClassLoader.class),
                        "!==",
                        env.callMethod(refl, "getFileName", DebugClassLoader.class))) {
                    continue;
                }

                if (ZVal.toBool(ZVal.toBool(isClass) && ZVal.toBool(parent))
                        && ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .DebugClassLoader
                                                        .RequestStaticProperties
                                                        .class,
                                                "finalMethods"),
                                        env,
                                        parent,
                                        toObjectR(method)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value()))) {
                    ZVal.list(
                            runtimeTempArrayResult186 =
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .Debug
                                                            .classes
                                                            .DebugClassLoader
                                                            .RequestStaticProperties
                                                            .class,
                                                    "finalMethods")
                                            .arrayGet(
                                                    env,
                                                    parent,
                                                    toObjectR(method)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value()),
                            (declaringClass = listGet(runtimeTempArrayResult186, 0, env)),
                            (message = listGet(runtimeTempArrayResult186, 1, env)));
                    NamespaceGlobal.trigger_error
                            .env(env)
                            .call(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "The \"%s::%s()\" method is considered final%s. It may change without further notice as of its next major version. You should not extend it from \"%s\".",
                                                    declaringClass,
                                                    toObjectR(method)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    message,
                                                    name)
                                            .value(),
                                    16384)
                            .value();
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1765 :
                        ZVal.getIterable(parentAndTraits.getObject(), env, true)) {
                    use = ZVal.assign(zpairResult1765.getValue());
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .DebugClassLoader
                                            .RequestStaticProperties
                                            .class,
                                    "internalMethods"),
                            env,
                            use,
                            toObjectR(method).accessProp(this, env).name("name").value())) {
                        ZVal.list(
                                runtimeTempArrayResult187 =
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .Debug
                                                                .classes
                                                                .DebugClassLoader
                                                                .RequestStaticProperties
                                                                .class,
                                                        "internalMethods")
                                                .arrayGet(
                                                        env,
                                                        use,
                                                        toObjectR(method)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value()),
                                (declaringClass = listGet(runtimeTempArrayResult187, 0, env)),
                                (message = listGet(runtimeTempArrayResult187, 1, env)));
                        if (NamespaceGlobal.strncmp
                                .env(env)
                                .call(ns, declaringClass, len)
                                .getBool()) {
                            NamespaceGlobal.trigger_error
                                    .env(env)
                                    .call(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "The \"%s::%s()\" method is considered internal%s. It may change without further notice. You should not extend it from \"%s\".",
                                                            declaringClass,
                                                            toObjectR(method)
                                                                    .accessProp(this, env)
                                                                    .name("name")
                                                                    .value(),
                                                            message,
                                                            name)
                                                    .value(),
                                            16384)
                                    .value();
                        }
                    }
                }

                if (ZVal.strictEqualityCheck(
                        false,
                        "===",
                        doc = env.callMethod(method, "getDocComment", DebugClassLoader.class))) {
                    continue;
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1766 :
                        ZVal.getIterable(ZVal.arrayFromList("final", "internal"), env, true)) {
                    annotation = ZVal.assign(zpairResult1766.getValue());
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            false,
                                            "!==",
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(doc, annotation)
                                                    .value()))
                            && ZVal.toBool(
                                    function_preg_match
                                            .f
                                            .env(env)
                                            .addReferenceArgs(
                                                    new RuntimeArgsWithReferences().add(2, notice))
                                            .call(
                                                    "#\\n\\s+\\* @"
                                                            + toStringR(annotation, env)
                                                            + "(?:( .+?)\\.?)?\\r?\\n\\s+\\*(?: @|/$)#s",
                                                    doc,
                                                    notice.getObject())
                                            .value())) {
                        message =
                                ZVal.assign(
                                        arrayActionR(ArrayAction.ISSET, notice, env, 1)
                                                ? function_preg_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "#\\s*\\r?\\n \\* +#",
                                                                " ",
                                                                notice.arrayGet(env, 1))
                                                        .value()
                                                : "");
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class,
                                        toStringR(annotation, env) + "Methods")
                                .arrayAccess(
                                        env,
                                        name,
                                        toObjectR(method)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value())
                                .set(ZVal.newArray(new ZPair(0, name), new ZPair(1, message)));
                    }
                }
            }
        }

        if (ZVal.isTrue(file)) {
            if (!ZVal.isTrue(exists)) {
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        function_strpos.f.env(env).call(_pClass.getObject(), "/").value())) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Trying to autoload a class with an invalid name \"%s\". Be careful that the namespace separator is \"\\\" in PHP, not \"/\".",
                                                    _pClass.getObject())
                                            .value()));
                }

                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The autoloader expected class \"%s\" to be defined in file \"%s\". The file was found but the class was not in it, the class name or namespace probably has a typo.",
                                                _pClass.getObject(), file)
                                        .value()));
            }

            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .DebugClassLoader
                                            .RequestStaticProperties
                                            .class)
                            .caseCheck)) {
                real.setObject(
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        "\\",
                                        toStringR(_pClass.getObject(), env)
                                                + toStringR(
                                                        NamespaceGlobal.strrchr
                                                                .env(env)
                                                                .call(file, ".")
                                                                .value(),
                                                        env))
                                .value());
                tail.setObject(
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        "/",
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call("/", "/", file)
                                                .value())
                                .value());
                i.setObject(
                        ZVal.subtract(function_count.f.env(env).call(tail.getObject()).value(), 1));
                j.setObject(
                        ZVal.subtract(function_count.f.env(env).call(real.getObject()).value(), 1));
                runtimeConverterContinueCount = 0;
                while (ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        tail,
                                                        env,
                                                        i.getObject()))
                                        && ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        real,
                                                        env,
                                                        j.getObject())))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        tail.arrayGet(env, i.getObject()),
                                        "===",
                                        real.arrayGet(env, j.getObject())))) {
                    i.setObject(ZVal.decrement(i.getObject()));
                    j.setObject(ZVal.decrement(j.getObject()));
                }

                function_array_splice
                        .f
                        .env(env)
                        .call(tail.getObject(), 0, ZVal.add(i.getObject(), 1));
            }

            if (ZVal.toBool(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Debug
                                                    .classes
                                                    .DebugClassLoader
                                                    .RequestStaticProperties
                                                    .class)
                                    .caseCheck)
                    && ZVal.toBool(tail.getObject())) {
                tail.setObject(
                        toStringR("/", env)
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call("/", tail.getObject())
                                                .value(),
                                        env));
                tailLen = function_strlen.f.env(env).call(tail.getObject()).value();
                real.setObject(env.callMethod(refl, "getFileName", DebugClassLoader.class));
                if (ZVal.strictEqualityCheck(
                        2,
                        "===",
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class)
                                .caseCheck)) {
                    i.setObject(
                            ZVal.add(
                                    1,
                                    NamespaceGlobal.strrpos
                                            .env(env)
                                            .call(real.getObject(), "/")
                                            .value()));
                    file = function_substr.f.env(env).call(real.getObject(), i.getObject()).value();
                    real.setObject(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(real.getObject(), 0, i.getObject())
                                    .value());
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .DebugClassLoader
                                            .RequestStaticProperties
                                            .class,
                                    "darwinCache"),
                            env,
                            real.getObject())) {
                        kDir = ZVal.assign(real.getObject());

                    } else {
                        kDir = NamespaceGlobal.strtolower.env(env).call(real.getObject()).value();
                        if (arrayActionR(
                                ArrayAction.ISSET,
                                env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .RequestStaticProperties
                                                .class,
                                        "darwinCache"),
                                env,
                                kDir)) {
                            real.setObject(
                                    ZVal.assign(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Symfony
                                                                    .namespaces
                                                                    .Component
                                                                    .namespaces
                                                                    .Debug
                                                                    .classes
                                                                    .DebugClassLoader
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "darwinCache")
                                                    .arrayGet(env, kDir, 0)));

                        } else {
                            dir.setObject(function_getcwd.f.env(env).call().value());
                            function_chdir.f.env(env).call(real.getObject());
                            real.setObject(
                                    toStringR(function_getcwd.f.env(env).call().value(), env)
                                            + "/");
                            function_chdir.f.env(env).call(dir.getObject());
                            dir.setObject(ZVal.assign(real.getObject()));
                            k = ZVal.assign(kDir);
                            i.setObject(
                                    ZVal.subtract(
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call(dir.getObject())
                                                    .value(),
                                            1));
                            runtimeConverterContinueCount = 0;
                            while (!arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Debug
                                                    .classes
                                                    .DebugClassLoader
                                                    .RequestStaticProperties
                                                    .class,
                                            "darwinCache"),
                                    env,
                                    k)) {
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .DebugClassLoader
                                                        .RequestStaticProperties
                                                        .class,
                                                "darwinCache")
                                        .arrayAccess(env, k)
                                        .set(
                                                ZVal.newArray(
                                                        new ZPair(0, dir.getObject()),
                                                        new ZPair(1, ZVal.newArray())));
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .DebugClassLoader
                                                        .RequestStaticProperties
                                                        .class,
                                                "darwinCache")
                                        .arrayAccess(env, dir.getObject())
                                        .set(
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Symfony
                                                                        .namespaces
                                                                        .Component
                                                                        .namespaces
                                                                        .Debug
                                                                        .classes
                                                                        .DebugClassLoader
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "darwinCache")
                                                        .arrayGet(env, k));
                                runtimeConverterContinueCount = 0;
                                while (ZVal.strictNotEqualityCheck(
                                        "/", "!==", dir.arrayGet(env, ZVal.preDecrement(i)))) {}

                                k =
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(k, 0, ZVal.preIncrement(i))
                                                .value();
                                dir.setObject(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(dir.getObject(), 0, ZVal.postDecrement(i))
                                                .value());
                            }
                        }
                    }

                    dirFiles.setObject(
                            ZVal.assign(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .Debug
                                                            .classes
                                                            .DebugClassLoader
                                                            .RequestStaticProperties
                                                            .class,
                                                    "darwinCache")
                                            .arrayGet(env, kDir, 1)));
                    if (arrayActionR(ArrayAction.ISSET, dirFiles, env, file)) {
                        kFile = ZVal.assign(file);

                    } else {
                        kFile = NamespaceGlobal.strtolower.env(env).call(file).value();
                        if (!arrayActionR(ArrayAction.ISSET, dirFiles, env, kFile)) {
                            runtimeConverterContinueCount = 0;
                            for (ZPair zpairResult1767 :
                                    ZVal.getIterable(
                                            NamespaceGlobal.scandir
                                                    .env(env)
                                                    .call(real.getObject(), 2)
                                                    .value(),
                                            env,
                                            true)) {
                                f.setObject(ZVal.assign(zpairResult1767.getValue()));
                                if (ZVal.strictNotEqualityCheck(".", "!==", f.arrayGet(env, 0))) {
                                    dirFiles.arrayAccess(env, f.getObject()).set(f.getObject());
                                    if (ZVal.strictEqualityCheck(f.getObject(), "===", file)) {
                                        kFile = ZVal.assign(k = ZVal.assign(file));

                                    } else if (ZVal.strictNotEqualityCheck(
                                            f.getObject(),
                                            "!==",
                                            k =
                                                    NamespaceGlobal.strtolower
                                                            .env(env)
                                                            .call(f.getObject())
                                                            .value())) {
                                        dirFiles.arrayAccess(env, k).set(f.getObject());
                                    }
                                }
                            }

                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Debug
                                                    .classes
                                                    .DebugClassLoader
                                                    .RequestStaticProperties
                                                    .class,
                                            "darwinCache")
                                    .arrayAccess(env, kDir, 1)
                                    .set(dirFiles.getObject());
                        }
                    }

                    real.setObject(
                            toStringR(real.getObject(), env)
                                    + toStringR(dirFiles.arrayGet(env, kFile), env));
                }

                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        NamespaceGlobal.substr_compare
                                                .env(env)
                                                .call(
                                                        real.getObject(),
                                                        tail.getObject(),
                                                        ZVal.minusSign(tailLen),
                                                        tailLen,
                                                        true)
                                                .value()))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        0,
                                        "!==",
                                        NamespaceGlobal.substr_compare
                                                .env(env)
                                                .call(
                                                        real.getObject(),
                                                        tail.getObject(),
                                                        ZVal.minusSign(tailLen),
                                                        tailLen,
                                                        false)
                                                .value()))) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Case mismatch between class and real file names: \"%s\" vs \"%s\" in \"%s\".",
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    tail.getObject(),
                                                                    ZVal.add(
                                                                            ZVal.minusSign(tailLen),
                                                                            1))
                                                            .value(),
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    real.getObject(),
                                                                    ZVal.add(
                                                                            ZVal.minusSign(tailLen),
                                                                            1))
                                                            .value(),
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    real.getObject(),
                                                                    0,
                                                                    ZVal.add(
                                                                            ZVal.minusSign(tailLen),
                                                                            1))
                                                            .value())
                                            .value()));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "parent")
    private Object getOwnInterfaces(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        ReferenceContainer ownInterfaces = new BasicReferenceContainer(null);
        Object _pInterface = null;
        ownInterfaces.setObject(function_class_implements.f.env(env).call(_pClass, false).value());
        if (ZVal.isTrue(parent)) {
            for (ZPair zpairResult1768 :
                    ZVal.getIterable(
                            function_class_implements.f.env(env).call(parent, false).value(),
                            env,
                            true)) {
                _pInterface = ZVal.assign(zpairResult1768.getValue());
                arrayActionR(ArrayAction.UNSET, ownInterfaces, env, _pInterface);
            }
        }

        for (ZPair zpairResult1769 : ZVal.getIterable(ownInterfaces.getObject(), env, true)) {
            _pInterface = ZVal.assign(zpairResult1769.getValue());
            for (ZPair zpairResult1770 :
                    ZVal.getIterable(
                            function_class_implements.f.env(env).call(_pInterface).value(),
                            env,
                            true)) {
                _pInterface = ZVal.assign(zpairResult1770.getValue());
                arrayActionR(ArrayAction.UNSET, ownInterfaces, env, _pInterface);
            }
        }

        return ZVal.assign(ownInterfaces.getObject());
    }

    public static final Object CONST_class = "Symfony\\Component\\Debug\\DebugClassLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object enable(RuntimeEnv env, Object... args) {
            Object functions = null;
            ReferenceContainer function = new BasicReferenceContainer(null);
            function_class_exists.f.env(env).call("Symfony\\Component\\Debug\\ErrorHandler");
            function_class_exists.f.env(env).call("Psr\\Log\\LogLevel");
            if (!function_is_array
                    .f
                    .env(env)
                    .call(
                            functions =
                                    NamespaceGlobal.spl_autoload_functions.env(env).call().value())
                    .getBool()) {
                return null;
            }

            for (ZPair zpairResult1756 : ZVal.getIterable(functions, env, true)) {
                function.setObject(ZVal.assign(zpairResult1756.getValue()));
                function_spl_autoload_unregister.f.env(env).call(function.getObject());
            }

            for (ZPair zpairResult1757 : ZVal.getIterable(functions, env, true)) {
                function.setObject(ZVal.assign(zpairResult1757.getValue()));
                if (ZVal.toBool(!function_is_array.f.env(env).call(function.getObject()).getBool())
                        || ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                function.arrayGet(env, 0),
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .DebugClassLoader
                                                        .class,
                                                "Symfony\\Component\\Debug\\DebugClassLoader")))) {
                    function.setObject(
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            env.createNewWithLateStaticBindings(
                                                    this, function.getObject())),
                                    new ZPair(1, "loadClass")));
                }

                function_spl_autoload_register.f.env(env).call(function.getObject());
            }

            return null;
        }

        @ConvertedMethod
        public Object disable(RuntimeEnv env, Object... args) {
            Object functions = null;
            ReferenceContainer function = new BasicReferenceContainer(null);
            if (!function_is_array
                    .f
                    .env(env)
                    .call(
                            functions =
                                    NamespaceGlobal.spl_autoload_functions.env(env).call().value())
                    .getBool()) {
                return null;
            }

            for (ZPair zpairResult1758 : ZVal.getIterable(functions, env, true)) {
                function.setObject(ZVal.assign(zpairResult1758.getValue()));
                function_spl_autoload_unregister.f.env(env).call(function.getObject());
            }

            for (ZPair zpairResult1759 : ZVal.getIterable(functions, env, true)) {
                function.setObject(ZVal.assign(zpairResult1759.getValue()));
                if (ZVal.toBool(function_is_array.f.env(env).call(function.getObject()).value())
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        function.arrayGet(env, 0),
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .DebugClassLoader
                                                .class,
                                        "Symfony\\Component\\Debug\\DebugClassLoader"))) {
                    function.setObject(
                            env.callMethod(
                                    function.arrayGet(env, 0),
                                    "getClassLoader",
                                    DebugClassLoader.class));
                }

                function_spl_autoload_register.f.env(env).call(function.getObject());
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object caseCheck = null;

        public Object checkedClasses = ZVal.newArray();

        public Object _pFinal = ZVal.newArray();

        public Object finalMethods = ZVal.newArray();

        public Object deprecated = ZVal.newArray();

        public Object internal = ZVal.newArray();

        public Object internalMethods = ZVal.newArray();

        public Object darwinCache =
                ZVal.newArray(
                        new ZPair(
                                "/",
                                ZVal.newArray(new ZPair(0, "/"), new ZPair(1, ZVal.newArray()))));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\DebugClassLoader")
                    .setLookup(
                            DebugClassLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("classLoader", "isFinder", "loaded")
                    .setStaticPropertyNames(
                            "caseCheck",
                            "checkedClasses",
                            "darwinCache",
                            "deprecated",
                            "final",
                            "finalMethods",
                            "internal",
                            "internalMethods")
                    .setFilename("vendor/symfony/debug/DebugClassLoader.php")
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

    private static class Scope62 implements UpdateRuntimeScopeInterface {

        Object wasCached;
        Object file;
        Object e;
        Object _thisVarAlias;
        Object ternaryExpressionTemp;
        Object _pClass;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("wasCached", this.wasCached);
            stack.setVariable("file", this.file);
            stack.setVariable("e", this.e);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("class", this._pClass);
        }

        public void updateScope(RuntimeStack stack) {

            this.wasCached = stack.getVariable("wasCached");
            this.file = stack.getVariable("file");
            this.e = stack.getVariable("e");
            this._thisVarAlias = stack.getVariable("this");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this._pClass = stack.getVariable("class");
        }
    }
}
