package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_parents;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Exception.classes.ThrowingCasterException;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.ClonerInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Data;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Cloner/AbstractCloner.php

*/

public abstract class AbstractCloner extends RuntimeClassBase implements ClonerInterface {

    public Object maxItems = 2500;

    public Object maxString = -1;

    public Object minDepth = 1;

    public Object casters = ZVal.newArray();

    public Object prevErrorHandler = null;

    public Object classInfo = ZVal.newArray();

    public Object filter = 0;

    public AbstractCloner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractCloner.class) {
            this.__construct(env, args);
        }
    }

    public AbstractCloner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "casters",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object casters = assignParameter(args, 0, true);
        if (null == casters) {
            casters = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", casters)) {
            casters =
                    ZVal.assign(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .VarDumper
                                                    .namespaces
                                                    .Cloner
                                                    .classes
                                                    .AbstractCloner
                                                    .RequestStaticProperties
                                                    .class)
                                    .defaultCasters);
        }

        this.addCasters(env, casters);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "casters", typeHint = "array")
    public Object addCasters(RuntimeEnv env, Object... args) {
        Object casters = assignParameter(args, 0, false);
        Object callback = null;
        Object type = null;
        for (ZPair zpairResult2207 : ZVal.getIterable(casters, env, false)) {
            type = ZVal.assign(zpairResult2207.getKey());
            callback = ZVal.assign(zpairResult2207.getValue());
            new ReferenceClassProperty(this, "casters", env)
                    .arrayAppend(env, NamespaceGlobal.strtolower.env(env).call(type).value())
                    .set(
                            ZVal.toBool(function_is_string.f.env(env).call(callback).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            false,
                                                            "!==",
                                                            function_strpos
                                                                    .f
                                                                    .env(env)
                                                                    .call(callback, "::")
                                                                    .value()))
                                    ? function_explode.f.env(env).call("::", callback, 2).value()
                                    : callback);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxItems")
    public Object setMaxItems(RuntimeEnv env, Object... args) {
        Object maxItems = assignParameter(args, 0, false);
        this.maxItems = ZVal.toLong(maxItems);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxString")
    public Object setMaxString(RuntimeEnv env, Object... args) {
        Object maxString = assignParameter(args, 0, false);
        this.maxString = ZVal.toLong(maxString);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "minDepth")
    public Object setMinDepth(RuntimeEnv env, Object... args) {
        Object minDepth = assignParameter(args, 0, false);
        this.minDepth = ZVal.toLong(minDepth);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    @ConvertedParameter(index = 1, name = "filter", defaultValue = "0", defaultValueType = "number")
    public Object cloneVar(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/var-dumper/Cloner")
                        .setFile("/vendor/symfony/var-dumper/Cloner/AbstractCloner.php");
        Object var = assignParameter(args, 0, false);
        Object filter = assignParameter(args, 1, true);
        if (null == filter) {
            filter = 0;
        }
        Object gc = null;
        this.prevErrorHandler =
                function_set_error_handler
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\VarDumper\\Cloner",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "type")
                                    @ConvertedParameter(index = 1, name = "msg")
                                    @ConvertedParameter(index = 2, name = "file")
                                    @ConvertedParameter(index = 3, name = "line")
                                    @ConvertedParameter(
                                        index = 4,
                                        name = "context",
                                        defaultValue = "",
                                        defaultValueType = "array"
                                    )
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object type = assignParameter(args, 0, false);
                                        Object msg = assignParameter(args, 1, false);
                                        Object file = assignParameter(args, 2, false);
                                        Object line = assignParameter(args, 3, false);
                                        Object context = assignParameter(args, 4, true);
                                        if (null == context) {
                                            context = ZVal.newArray();
                                        }
                                        if (ZVal.toBool(ZVal.strictEqualityCheck(4096, "===", type))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                256, "===", type))) {
                                            throw ZVal.getException(
                                                    env,
                                                    new ErrorException(
                                                            env, msg, 0, type, file, line));
                                        }

                                        if (ZVal.isTrue(AbstractCloner.this.prevErrorHandler)) {
                                            return ZVal.assign(
                                                    function_call_user_func
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call(
                                                                    AbstractCloner.this
                                                                            .prevErrorHandler,
                                                                    type,
                                                                    msg,
                                                                    file,
                                                                    line,
                                                                    context)
                                                            .value());
                                        }

                                        return ZVal.assign(false);
                                    }
                                })
                        .value();
        this.filter = filter;
        if (ZVal.isTrue(gc = NamespaceGlobal.gc_enabled.env(env).call().value())) {
            NamespaceGlobal.gc_disable.env(env).call();
        }

        try {
            return ZVal.assign(
                    new Data(env, env.callMethod(this, "doClone", AbstractCloner.class, var)));
        } catch (ConvertedException convertedException323) {

            throw convertedException323;
        } finally {
            if (ZVal.isTrue(gc)) {
                NamespaceGlobal.gc_enable.env(env).call();
            }
            function_restore_error_handler.f.env(env).call();
            this.prevErrorHandler = ZVal.getNull();
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stub",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
    )
    @ConvertedParameter(index = 1, name = "isNested")
    protected Object castObject(RuntimeEnv env, Object... args) {
        ReferenceContainer stub = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer isNested = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer a = new BasicReferenceContainer(null);
        Object e = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object hasDebugInfo = null;
        Object p = null;
        ReferenceContainer obj = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult216 = null;
        Object callback = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        ReferenceContainer parents = new BasicReferenceContainer(null);
        obj.setObject(
                ZVal.assign(
                        toObjectR(stub.getObject()).accessProp(this, env).name("value").value()));
        _pClass.setObject(
                ZVal.assign(
                        toObjectR(stub.getObject()).accessProp(this, env).name("class").value()));
        if (ZVal.toBool(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, _pClass, env, 15))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                "\u0000", "===", _pClass.arrayGet(env, 15))))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                0,
                                "===",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(_pClass.getObject(), "class@anonymous\u0000")
                                        .value()))) {
            toObjectR(stub.getObject())
                    .accessProp(this, env)
                    .name("class")
                    .set(
                            toStringR(
                                            NamespaceGlobal.get_parent_class
                                                    .env(env)
                                                    .call(_pClass.getObject())
                                                    .value(),
                                            env)
                                    + "@anonymous");
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "classInfo", env),
                env,
                _pClass.getObject())) {
            ZVal.list(
                    runtimeTempArrayResult216 =
                            new ReferenceClassProperty(this, "classInfo", env)
                                    .arrayGet(env, _pClass.getObject()),
                    (i.setObject(listGet(runtimeTempArrayResult216, 0, env))),
                    (parents.setObject(listGet(runtimeTempArrayResult216, 1, env))),
                    (hasDebugInfo = listGet(runtimeTempArrayResult216, 2, env)));

        } else {
            i.setObject(2);
            parents.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    NamespaceGlobal.strtolower
                                            .env(env)
                                            .call(_pClass.getObject())
                                            .value())));
            hasDebugInfo =
                    function_method_exists
                            .f
                            .env(env)
                            .call(_pClass.getObject(), "__debugInfo")
                            .value();
            for (ZPair zpairResult2208 :
                    ZVal.getIterable(
                            function_class_parents.f.env(env).call(_pClass.getObject()).value(),
                            env,
                            true)) {
                p = ZVal.assign(zpairResult2208.getValue());
                parents.arrayAppend(env).set(NamespaceGlobal.strtolower.env(env).call(p).value());
                i.setObject(ZVal.increment(i.getObject()));
            }

            for (ZPair zpairResult2209 :
                    ZVal.getIterable(
                            function_class_implements.f.env(env).call(_pClass.getObject()).value(),
                            env,
                            true)) {
                p = ZVal.assign(zpairResult2209.getValue());
                parents.arrayAppend(env).set(NamespaceGlobal.strtolower.env(env).call(p).value());
                i.setObject(ZVal.increment(i.getObject()));
            }

            parents.arrayAppend(env).set("*");
            new ReferenceClassProperty(this, "classInfo", env)
                    .arrayAccess(env, _pClass.getObject())
                    .set(
                            ZVal.newArray(
                                    new ZPair(0, i.getObject()),
                                    new ZPair(1, parents.getObject()),
                                    new ZPair(2, hasDebugInfo)));
        }

        a.setObject(
                Caster.runtimeStaticObject.castObject(
                        env, obj.getObject(), _pClass.getObject(), hasDebugInfo));
        try {
            while (ZVal.isTrue(ZVal.postDecrement(i))) {
                if (!arrayActionR(
                        ArrayAction.EMPTY,
                        new ReferenceClassProperty(this, "casters", env),
                        env,
                        p = ZVal.assign(parents.arrayGet(env, i.getObject())))) {
                    for (ZPair zpairResult2210 :
                            ZVal.getIterable(
                                    new ReferenceClassProperty(this, "casters", env)
                                            .arrayGet(env, p),
                                    env,
                                    true)) {
                        callback = ZVal.assign(zpairResult2210.getValue());
                        a.setObject(
                                env.callFunctionDynamic(
                                                callback,
                                                new RuntimeArgsWithReferences()
                                                        .add(0, obj)
                                                        .add(1, a)
                                                        .add(2, stub)
                                                        .add(3, isNested)
                                                        .add(
                                                                4,
                                                                new ReferenceClassProperty(
                                                                        this, "filter", env)),
                                                obj.getObject(),
                                                a.getObject(),
                                                stub.getObject(),
                                                isNested.getObject(),
                                                this.filter)
                                        .value());
                    }
                }
            }

        } catch (ConvertedException convertedException324) {
            if (convertedException324.instanceOf(PHPException.class, "Exception")) {
                e = convertedException324.getObject();
                a.setObject(
                        ZVal.add(
                                ZVal.newArray(
                                        new ZPair(
                                                toStringR(
                                                                ZVal.strictEqualityCheck(
                                                                                Stub
                                                                                        .CONST_TYPE_OBJECT,
                                                                                "===",
                                                                                toObjectR(
                                                                                                stub
                                                                                                        .getObject())
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "type")
                                                                                        .value())
                                                                        ? Caster
                                                                                .CONST_PREFIX_VIRTUAL
                                                                        : "",
                                                                env)
                                                        + "\u26A0",
                                                new ThrowingCasterException(env, e))),
                                a.getObject()));
            } else {
                throw convertedException324;
            }
        }

        return ZVal.assign(a.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stub",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
    )
    @ConvertedParameter(index = 1, name = "isNested")
    protected Object castResource(RuntimeEnv env, Object... args) {
        ReferenceContainer stub = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer isNested = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer a = new BasicReferenceContainer(null);
        ReferenceContainer res = new BasicReferenceContainer(null);
        Object e = null;
        Object callback = null;
        Object type = null;
        a.setObject(ZVal.newArray());
        res.setObject(
                ZVal.assign(
                        toObjectR(stub.getObject()).accessProp(this, env).name("value").value()));
        type = ZVal.assign(toObjectR(stub.getObject()).accessProp(this, env).name("class").value());
        try {
            if (!arrayActionR(
                    ArrayAction.EMPTY,
                    new ReferenceClassProperty(this, "casters", env),
                    env,
                    ":" + toStringR(type, env))) {
                for (ZPair zpairResult2211 :
                        ZVal.getIterable(
                                new ReferenceClassProperty(this, "casters", env)
                                        .arrayGet(env, ":" + toStringR(type, env)),
                                env,
                                true)) {
                    callback = ZVal.assign(zpairResult2211.getValue());
                    a.setObject(
                            env.callFunctionDynamic(
                                            callback,
                                            new RuntimeArgsWithReferences()
                                                    .add(0, res)
                                                    .add(1, a)
                                                    .add(2, stub)
                                                    .add(3, isNested)
                                                    .add(
                                                            4,
                                                            new ReferenceClassProperty(
                                                                    this, "filter", env)),
                                            res.getObject(),
                                            a.getObject(),
                                            stub.getObject(),
                                            isNested.getObject(),
                                            this.filter)
                                    .value());
                }
            }

        } catch (ConvertedException convertedException325) {
            if (convertedException325.instanceOf(PHPException.class, "Exception")) {
                e = convertedException325.getObject();
                a.setObject(
                        ZVal.add(
                                ZVal.newArray(
                                        new ZPair(
                                                toStringR(
                                                                ZVal.strictEqualityCheck(
                                                                                Stub
                                                                                        .CONST_TYPE_OBJECT,
                                                                                "===",
                                                                                toObjectR(
                                                                                                stub
                                                                                                        .getObject())
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "type")
                                                                                        .value())
                                                                        ? Caster
                                                                                .CONST_PREFIX_VIRTUAL
                                                                        : "",
                                                                env)
                                                        + "\u26A0",
                                                new ThrowingCasterException(env, e))),
                                a.getObject()));
            } else {
                throw convertedException325;
            }
        }

        return ZVal.assign(a.getObject());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Cloner\\AbstractCloner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultCasters =
                ZVal.newArray(
                        new ZPair(
                                "__PHP_Incomplete_Class",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\Caster",
                                        "castPhpIncompleteClass")),
                        new ZPair(
                                "Symfony\\Component\\VarDumper\\Caster\\CutStub",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "castStub")),
                        new ZPair(
                                "Symfony\\Component\\VarDumper\\Caster\\CutArrayStub",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "castCutArray")),
                        new ZPair(
                                "Symfony\\Component\\VarDumper\\Caster\\ConstStub",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "castStub")),
                        new ZPair(
                                "Symfony\\Component\\VarDumper\\Caster\\EnumStub",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "castEnum")),
                        new ZPair(
                                "Closure",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castClosure")),
                        new ZPair(
                                "Generator",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castGenerator")),
                        new ZPair(
                                "ReflectionType",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castType")),
                        new ZPair(
                                "ReflectionGenerator",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castReflectionGenerator")),
                        new ZPair(
                                "ReflectionClass",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castClass")),
                        new ZPair(
                                "ReflectionFunctionAbstract",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castFunctionAbstract")),
                        new ZPair(
                                "ReflectionMethod",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castMethod")),
                        new ZPair(
                                "ReflectionParameter",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castParameter")),
                        new ZPair(
                                "ReflectionProperty",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castProperty")),
                        new ZPair(
                                "ReflectionExtension",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castExtension")),
                        new ZPair(
                                "ReflectionZendExtension",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster",
                                        "castZendExtension")),
                        new ZPair(
                                "Doctrine\\Common\\Persistence\\ObjectManager",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "cutInternals")),
                        new ZPair(
                                "Doctrine\\Common\\Proxy\\Proxy",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DoctrineCaster",
                                        "castCommonProxy")),
                        new ZPair(
                                "Doctrine\\ORM\\Proxy\\Proxy",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DoctrineCaster",
                                        "castOrmProxy")),
                        new ZPair(
                                "Doctrine\\ORM\\PersistentCollection",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DoctrineCaster",
                                        "castPersistentCollection")),
                        new ZPair(
                                "DOMException",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castException")),
                        new ZPair(
                                "DOMStringList",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castLength")),
                        new ZPair(
                                "DOMNameList",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castLength")),
                        new ZPair(
                                "DOMImplementation",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castImplementation")),
                        new ZPair(
                                "DOMImplementationList",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castLength")),
                        new ZPair(
                                "DOMNode",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castNode")),
                        new ZPair(
                                "DOMNameSpaceNode",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castNameSpaceNode")),
                        new ZPair(
                                "DOMDocument",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castDocument")),
                        new ZPair(
                                "DOMNodeList",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castLength")),
                        new ZPair(
                                "DOMNamedNodeMap",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castLength")),
                        new ZPair(
                                "DOMCharacterData",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castCharacterData")),
                        new ZPair(
                                "DOMAttr",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castAttr")),
                        new ZPair(
                                "DOMElement",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castElement")),
                        new ZPair(
                                "DOMText",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castText")),
                        new ZPair(
                                "DOMTypeinfo",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castTypeinfo")),
                        new ZPair(
                                "DOMDomError",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castDomError")),
                        new ZPair(
                                "DOMLocator",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castLocator")),
                        new ZPair(
                                "DOMDocumentType",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castDocumentType")),
                        new ZPair(
                                "DOMNotation",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castNotation")),
                        new ZPair(
                                "DOMEntity",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castEntity")),
                        new ZPair(
                                "DOMProcessingInstruction",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castProcessingInstruction")),
                        new ZPair(
                                "DOMXPath",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DOMCaster",
                                        "castXPath")),
                        new ZPair(
                                "XmlReader",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\XmlReaderCaster",
                                        "castXmlReader")),
                        new ZPair(
                                "ErrorException",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster",
                                        "castErrorException")),
                        new ZPair(
                                "Exception",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster",
                                        "castException")),
                        new ZPair(
                                "Error",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster",
                                        "castError")),
                        new ZPair(
                                "Symfony\\Component\\DependencyInjection\\ContainerInterface",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "cutInternals")),
                        new ZPair(
                                "Symfony\\Component\\HttpFoundation\\Request",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SymfonyCaster",
                                        "castRequest")),
                        new ZPair(
                                "Symfony\\Component\\VarDumper\\Exception\\ThrowingCasterException",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster",
                                        "castThrowingCasterException")),
                        new ZPair(
                                "Symfony\\Component\\VarDumper\\Caster\\TraceStub",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster",
                                        "castTraceStub")),
                        new ZPair(
                                "Symfony\\Component\\VarDumper\\Caster\\FrameStub",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster",
                                        "castFrameStub")),
                        new ZPair(
                                "Symfony\\Component\\Debug\\Exception\\SilencedErrorContext",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ExceptionCaster",
                                        "castSilencedErrorContext")),
                        new ZPair(
                                "PHPUnit_Framework_MockObject_MockObject",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "cutInternals")),
                        new ZPair(
                                "Prophecy\\Prophecy\\ProphecySubjectInterface",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "cutInternals")),
                        new ZPair(
                                "Mockery\\MockInterface",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\StubCaster",
                                        "cutInternals")),
                        new ZPair(
                                "PDO",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\PdoCaster",
                                        "castPdo")),
                        new ZPair(
                                "PDOStatement",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\PdoCaster",
                                        "castPdoStatement")),
                        new ZPair(
                                "AMQPConnection",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\AmqpCaster",
                                        "castConnection")),
                        new ZPair(
                                "AMQPChannel",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\AmqpCaster",
                                        "castChannel")),
                        new ZPair(
                                "AMQPQueue",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\AmqpCaster",
                                        "castQueue")),
                        new ZPair(
                                "AMQPExchange",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\AmqpCaster",
                                        "castExchange")),
                        new ZPair(
                                "AMQPEnvelope",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\AmqpCaster",
                                        "castEnvelope")),
                        new ZPair(
                                "ArrayObject",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castArrayObject")),
                        new ZPair(
                                "ArrayIterator",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castArrayIterator")),
                        new ZPair(
                                "SplDoublyLinkedList",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castDoublyLinkedList")),
                        new ZPair(
                                "SplFileInfo",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castFileInfo")),
                        new ZPair(
                                "SplFileObject",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castFileObject")),
                        new ZPair(
                                "SplFixedArray",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castFixedArray")),
                        new ZPair(
                                "SplHeap",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castHeap")),
                        new ZPair(
                                "SplObjectStorage",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castObjectStorage")),
                        new ZPair(
                                "SplPriorityQueue",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castHeap")),
                        new ZPair(
                                "OuterIterator",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\SplCaster",
                                        "castOuterIterator")),
                        new ZPair(
                                "Redis",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\RedisCaster",
                                        "castRedis")),
                        new ZPair(
                                "RedisArray",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\RedisCaster",
                                        "castRedisArray")),
                        new ZPair(
                                "DateTimeInterface",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DateCaster",
                                        "castDateTime")),
                        new ZPair(
                                "DateInterval",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DateCaster",
                                        "castInterval")),
                        new ZPair(
                                "DateTimeZone",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DateCaster",
                                        "castTimeZone")),
                        new ZPair(
                                "DatePeriod",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\DateCaster",
                                        "castPeriod")),
                        new ZPair(
                                "GMP",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\GmpCaster",
                                        "castGmp")),
                        new ZPair(
                                ":curl",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castCurl")),
                        new ZPair(
                                ":dba",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castDba")),
                        new ZPair(
                                ":dba persistent",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castDba")),
                        new ZPair(
                                ":gd",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castGd")),
                        new ZPair(
                                ":mysql link",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castMysqlLink")),
                        new ZPair(
                                ":pgsql large object",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\PgSqlCaster",
                                        "castLargeObject")),
                        new ZPair(
                                ":pgsql link",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\PgSqlCaster",
                                        "castLink")),
                        new ZPair(
                                ":pgsql link persistent",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\PgSqlCaster",
                                        "castLink")),
                        new ZPair(
                                ":pgsql result",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\PgSqlCaster",
                                        "castResult")),
                        new ZPair(
                                ":process",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castProcess")),
                        new ZPair(
                                ":stream",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castStream")),
                        new ZPair(
                                ":persistent stream",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castStream")),
                        new ZPair(
                                ":stream-context",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster",
                                        "castStreamContext")),
                        new ZPair(
                                ":xml",
                                ZVal.arrayFromList(
                                        "Symfony\\Component\\VarDumper\\Caster\\XmlResourceCaster",
                                        "castXml")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Cloner\\AbstractCloner")
                    .setLookup(
                            AbstractCloner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "casters",
                            "classInfo",
                            "filter",
                            "maxItems",
                            "maxString",
                            "minDepth",
                            "prevErrorHandler")
                    .setStaticPropertyNames("defaultCasters")
                    .setFilename("vendor/symfony/var-dumper/Cloner/AbstractCloner.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Cloner\\ClonerInterface")
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
