package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/AbstractNode.php

*/

public abstract class AbstractNode extends RuntimeClassBase implements Countable {

    public Object name = null;

    public Object path = null;

    public Object pathArray = null;

    public Object parent = null;

    public Object id = null;

    public AbstractNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractNode.class) {
            this.__construct(env, args);
        }
    }

    public AbstractNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "parent",
        typeHint = "self",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, true);
        if (null == parent) {
            parent = ZVal.getNull();
        }
        if (ZVal.equalityCheck(function_substr.f.env(env).call(name, -1).value(), "/")) {
            name = function_substr.f.env(env).call(name, 0, -1).value();
        }

        this.name = name;
        this.parent = parent;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        Object parent = null;
        Object parentId = null;
        if (ZVal.strictEqualityCheck(this.id, "===", ZVal.getNull())) {
            parent = this.getParent(env);
            if (ZVal.strictEqualityCheck(parent, "===", ZVal.getNull())) {
                this.id = "index";

            } else {
                parentId = env.callMethod(parent, "getId", AbstractNode.class);
                if (ZVal.strictEqualityCheck(parentId, "===", "index")) {
                    this.id = function_str_replace.f.env(env).call(":", "_", this.name).value();

                } else {
                    this.id = toStringR(parentId, env) + "/" + toStringR(this.name, env);
                }
            }
        }

        return ZVal.assign(this.id);
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.path, "===", ZVal.getNull())) {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    this.parent, "===", ZVal.getNull()))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    env.callMethod(
                                                            this.parent,
                                                            "getPath",
                                                            AbstractNode.class),
                                                    "===",
                                                    ZVal.getNull())))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    env.callMethod(this.parent, "getPath", AbstractNode.class),
                                    "===",
                                    false))) {
                this.path = this.name;

            } else {
                this.path =
                        toStringR(env.callMethod(this.parent, "getPath", AbstractNode.class), env)
                                + "/"
                                + toStringR(this.name, env);
            }
        }

        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    public Object getPathAsArray(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.pathArray, "===", ZVal.getNull())) {
            if (ZVal.strictEqualityCheck(this.parent, "===", ZVal.getNull())) {
                this.pathArray = ZVal.newArray();

            } else {
                this.pathArray = env.callMethod(this.parent, "getPathAsArray", AbstractNode.class);
            }

            new ReferenceClassProperty(this, "pathArray", env).arrayAppend(env).set(this);
        }

        return ZVal.assign(this.pathArray);
    }

    @ConvertedMethod
    public Object getParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parent);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedClassesPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, true);
        if (null == asString) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedClasses", AbstractNode.class),
                        env.callMethod(this, "getNumClasses", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedTraitsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, true);
        if (null == asString) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedTraits", AbstractNode.class),
                        env.callMethod(this, "getNumTraits", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedClassesAndTraitsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, true);
        if (null == asString) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        this.getNumTestedClassesAndTraits(env),
                        this.getNumClassesAndTraits(env),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedFunctionsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, true);
        if (null == asString) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedFunctions", AbstractNode.class),
                        env.callMethod(this, "getNumFunctions", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedMethodsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, true);
        if (null == asString) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumTestedMethods", AbstractNode.class),
                        env.callMethod(this, "getNumMethods", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getTestedFunctionsAndMethodsPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, true);
        if (null == asString) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        this.getNumTestedFunctionsAndMethods(env),
                        this.getNumFunctionsAndMethods(env),
                        asString));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asString",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getLineExecutedPercent(RuntimeEnv env, Object... args) {
        Object asString = assignParameter(args, 0, true);
        if (null == asString) {
            asString = true;
        }
        return ZVal.assign(
                Util.runtimeStaticObject.percent(
                        env,
                        env.callMethod(this, "getNumExecutedLines", AbstractNode.class),
                        env.callMethod(this, "getNumExecutableLines", AbstractNode.class),
                        asString));
    }

    @ConvertedMethod
    public Object getNumClassesAndTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumClasses", AbstractNode.class),
                        env.callMethod(this, "getNumTraits", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getNumTestedClassesAndTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumTestedClasses", AbstractNode.class),
                        env.callMethod(this, "getNumTestedTraits", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getClassesAndTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this, "getClasses", AbstractNode.class),
                                env.callMethod(this, "getTraits", AbstractNode.class))
                        .value());
    }

    @ConvertedMethod
    public Object getNumFunctionsAndMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumFunctions", AbstractNode.class),
                        env.callMethod(this, "getNumMethods", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getNumTestedFunctionsAndMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.add(
                        env.callMethod(this, "getNumTestedFunctions", AbstractNode.class),
                        env.callMethod(this, "getNumTestedMethods", AbstractNode.class)));
    }

    @ConvertedMethod
    public Object getFunctionsAndMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this, "getFunctions", AbstractNode.class),
                                env.callMethod(this, "getMethods", AbstractNode.class))
                        .value());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode";

    @ConvertedMethod()
    public abstract Object count(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\AbstractNode")
                    .setLookup(
                            AbstractNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("id", "name", "parent", "path", "pathArray")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/AbstractNode.php")
                    .addInterface("Countable")
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
