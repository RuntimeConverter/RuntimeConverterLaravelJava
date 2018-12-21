package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ArgsStub;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ClassStub;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/PdoCaster.php

*/

public class PdoCaster extends RuntimeClassBase {

    public PdoCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PdoCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\PdoCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "PDO")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castPdo(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object e = null;
            ReferenceContainer v = new BasicReferenceContainer(null);
            Object prefix = null;
            ReferenceContainer k = new BasicReferenceContainer(null);
            ReferenceContainer attr = new BasicReferenceContainer(null);
            Object errmode = null;
            attr.setObject(ZVal.newArray());
            errmode = env.callMethod(c, "getAttribute", PdoCaster.class, 3);
            env.callMethod(c, "setAttribute", PdoCaster.class, 3, 2);
            for (ZPair zpairResult2190 :
                    ZVal.getIterable(
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
                                                    .Caster
                                                    .classes
                                                    .PdoCaster
                                                    .RequestStaticProperties
                                                    .class)
                                    .pdoAttributes,
                            env,
                            false)) {
                k.setObject(ZVal.assign(zpairResult2190.getKey()));
                v.setObject(ZVal.assign(zpairResult2190.getValue()));
                if (!arrayActionR(ArrayAction.ISSET, k, env, 0)) {
                    k.setObject(ZVal.assign(v.getObject()));
                    v.setObject(ZVal.newArray());
                }

                try {
                    attr.arrayAccess(env, k.getObject())
                            .set(
                                    ZVal.strictEqualityCheck("ERRMODE", "===", k.getObject())
                                            ? errmode
                                            : env.callMethod(
                                                    c,
                                                    "getAttribute",
                                                    PdoCaster.class,
                                                    function_constant
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "PDO::ATTR_"
                                                                            + toStringR(
                                                                                    k.getObject(),
                                                                                    env))
                                                            .value()));
                    if (ZVal.toBool(v.getObject())
                            && ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            v,
                                            env,
                                            attr.arrayGet(env, k.getObject())))) {
                        attr.arrayAccess(env, k.getObject())
                                .set(
                                        new ConstStub(
                                                env,
                                                v.arrayGet(env, attr.arrayGet(env, k.getObject())),
                                                attr.arrayGet(env, k.getObject())));
                    }

                } catch (ConvertedException convertedException318) {
                    if (convertedException318.instanceOf(PHPException.class, "Exception")) {
                        e = convertedException318.getObject();
                    } else {
                        throw convertedException318;
                    }
                }
            }

            if (arrayActionR(ArrayAction.ISSET, attr, env, k.setObject("STATEMENT_CLASS"), 1)) {
                if (ZVal.isTrue(attr.arrayGet(env, k.getObject(), 1))) {
                    attr.arrayAccess(env, k.getObject(), 1)
                            .set(
                                    new ArgsStub(
                                            env,
                                            attr.arrayGet(env, k.getObject(), 1),
                                            "__construct",
                                            attr.arrayGet(env, k.getObject(), 0)));
                }

                attr.arrayAccess(env, k.getObject(), 0)
                        .set(new ClassStub(env, attr.arrayGet(env, k.getObject(), 0)));
            }

            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "inTransaction",
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(c, "inTransaction")
                                                    .value()),
                                    new ZPair(
                                            toStringR(prefix, env) + "errorInfo",
                                            env.callMethod(c, "errorInfo", PdoCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "attributes",
                                            new EnumStub(env, attr.getObject())))));
            if (ZVal.isTrue(a.arrayGet(env, toStringR(prefix, env) + "inTransaction"))) {
                a.arrayAccess(env, toStringR(prefix, env) + "inTransaction")
                        .set(env.callMethod(c, "inTransaction", PdoCaster.class));

            } else {
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "inTransaction");
            }

            if (!ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    a,
                                    env,
                                    toStringR(prefix, env) + "errorInfo",
                                    1))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    a,
                                    env,
                                    toStringR(prefix, env) + "errorInfo",
                                    2))) {
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "errorInfo");
            }

            env.callMethod(c, "setAttribute", PdoCaster.class, 3, errmode);
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "PDOStatement")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castPdoStatement(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a.arrayAccess(env, toStringR(prefix, env) + "errorInfo")
                    .set(env.callMethod(c, "errorInfo", PdoCaster.class));
            if (!ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    a,
                                    env,
                                    toStringR(prefix, env) + "errorInfo",
                                    1))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    a,
                                    env,
                                    toStringR(prefix, env) + "errorInfo",
                                    2))) {
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "errorInfo");
            }

            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object pdoAttributes =
                ZVal.newArray(
                        new ZPair(
                                "CASE",
                                ZVal.newArray(
                                        new ZPair(2, "LOWER"),
                                        new ZPair(0, "NATURAL"),
                                        new ZPair(1, "UPPER"))),
                        new ZPair(
                                "ERRMODE",
                                ZVal.newArray(
                                        new ZPair(0, "SILENT"),
                                        new ZPair(1, "WARNING"),
                                        new ZPair(2, "EXCEPTION"))),
                        new ZPair(0, "TIMEOUT"),
                        new ZPair(1, "PREFETCH"),
                        new ZPair(2, "AUTOCOMMIT"),
                        new ZPair(3, "PERSISTENT"),
                        new ZPair(4, "DRIVER_NAME"),
                        new ZPair(5, "SERVER_INFO"),
                        new ZPair(
                                "ORACLE_NULLS",
                                ZVal.newArray(
                                        new ZPair(0, "NATURAL"),
                                        new ZPair(1, "EMPTY_STRING"),
                                        new ZPair(2, "TO_STRING"))),
                        new ZPair(6, "CLIENT_VERSION"),
                        new ZPair(7, "SERVER_VERSION"),
                        new ZPair(8, "STATEMENT_CLASS"),
                        new ZPair(9, "EMULATE_PREPARES"),
                        new ZPair(10, "CONNECTION_STATUS"),
                        new ZPair(11, "STRINGIFY_FETCHES"),
                        new ZPair(
                                "DEFAULT_FETCH_MODE",
                                ZVal.newArray(
                                        new ZPair(2, "ASSOC"),
                                        new ZPair(4, "BOTH"),
                                        new ZPair(1, "LAZY"),
                                        new ZPair(3, "NUM"),
                                        new ZPair(5, "OBJ"))));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\PdoCaster")
                    .setLookup(
                            PdoCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("pdoAttributes")
                    .setFilename("vendor/symfony/var-dumper/Caster/PdoCaster.php")
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
