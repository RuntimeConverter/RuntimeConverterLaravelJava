package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/PgSqlCaster.php

*/

public class PgSqlCaster extends RuntimeClassBase {

    public PgSqlCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PgSqlCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\PgSqlCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "lo")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castLargeObject(RuntimeEnv env, Object... args) {
            Object lo = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.arrayAccess(env, "seek position")
                    .set(NamespaceGlobal.pg_lo_tell.env(env).call(lo).value());
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "link")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castLink(RuntimeEnv env, Object... args) {
            Object link = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object s = null;
            Object v = null;
            a.arrayAccess(env, "status")
                    .set(NamespaceGlobal.pg_connection_status.env(env).call(link).value());
            a.arrayAccess(env, "status")
                    .set(
                            new ConstStub(
                                    env,
                                    ZVal.strictEqualityCheck(0, "===", a.arrayGet(env, "status"))
                                            ? "PGSQL_CONNECTION_OK"
                                            : "PGSQL_CONNECTION_BAD",
                                    a.arrayGet(env, "status")));
            a.arrayAccess(env, "busy")
                    .set(NamespaceGlobal.pg_connection_busy.env(env).call(link).value());
            a.arrayAccess(env, "transaction")
                    .set(NamespaceGlobal.pg_transaction_status.env(env).call(link).value());
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
                                    .VarDumper
                                    .namespaces
                                    .Caster
                                    .classes
                                    .PgSqlCaster
                                    .RequestStaticProperties
                                    .class,
                            "transactionStatus"),
                    env,
                    a.arrayGet(env, "transaction"))) {
                a.arrayAccess(env, "transaction")
                        .set(
                                new ConstStub(
                                        env,
                                        env.getRequestStaticPropertiesReference(
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
                                                                .PgSqlCaster
                                                                .RequestStaticProperties
                                                                .class,
                                                        "transactionStatus")
                                                .arrayGet(env, a.arrayGet(env, "transaction")),
                                        a.arrayGet(env, "transaction")));
            }

            a.arrayAccess(env, "pid").set(NamespaceGlobal.pg_get_pid.env(env).call(link).value());
            a.arrayAccess(env, "last error")
                    .set(NamespaceGlobal.pg_last_error.env(env).call(link).value());
            a.arrayAccess(env, "last notice")
                    .set(NamespaceGlobal.pg_last_notice.env(env).call(link).value());
            a.arrayAccess(env, "host").set(NamespaceGlobal.pg_host.env(env).call(link).value());
            a.arrayAccess(env, "port").set(NamespaceGlobal.pg_port.env(env).call(link).value());
            a.arrayAccess(env, "dbname").set(NamespaceGlobal.pg_dbname.env(env).call(link).value());
            a.arrayAccess(env, "options")
                    .set(NamespaceGlobal.pg_options.env(env).call(link).value());
            a.arrayAccess(env, "version")
                    .set(NamespaceGlobal.pg_version.env(env).call(link).value());
            for (ZPair zpairResult2191 :
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
                                                    .PgSqlCaster
                                                    .RequestStaticProperties
                                                    .class)
                                    .paramCodes,
                            env,
                            true)) {
                v = ZVal.assign(zpairResult2191.getValue());
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        s = NamespaceGlobal.pg_parameter_status.env(env).call(link, v).value())) {
                    a.arrayAccess(env, "param", v).set(s);
                }
            }

            a.arrayAccess(env, "param", "client_encoding")
                    .set(NamespaceGlobal.pg_client_encoding.env(env).call(link).value());
            a.arrayAccess(env, "param").set(new EnumStub(env, a.arrayGet(env, "param")));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "result")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castResult(RuntimeEnv env, Object... args) {
            Object result = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            ReferenceContainer field = new BasicReferenceContainer(null);
            Object v = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object k = null;
            Object fields = null;
            a.arrayAccess(env, "num rows")
                    .set(NamespaceGlobal.pg_num_rows.env(env).call(result).value());
            a.arrayAccess(env, "status")
                    .set(NamespaceGlobal.pg_result_status.env(env).call(result).value());
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
                                    .VarDumper
                                    .namespaces
                                    .Caster
                                    .classes
                                    .PgSqlCaster
                                    .RequestStaticProperties
                                    .class,
                            "resultStatus"),
                    env,
                    a.arrayGet(env, "status"))) {
                a.arrayAccess(env, "status")
                        .set(
                                new ConstStub(
                                        env,
                                        env.getRequestStaticPropertiesReference(
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
                                                                .PgSqlCaster
                                                                .RequestStaticProperties
                                                                .class,
                                                        "resultStatus")
                                                .arrayGet(env, a.arrayGet(env, "status")),
                                        a.arrayGet(env, "status")));
            }

            a.arrayAccess(env, "command-completion tag")
                    .set(NamespaceGlobal.pg_result_status.env(env).call(result, 2).value());
            if (ZVal.strictEqualityCheck(-1, "===", a.arrayGet(env, "num rows"))) {
                for (ZPair zpairResult2192 :
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
                                                        .PgSqlCaster
                                                        .RequestStaticProperties
                                                        .class)
                                        .diagCodes,
                                env,
                                false)) {
                    k = ZVal.assign(zpairResult2192.getKey());
                    v = ZVal.assign(zpairResult2192.getValue());
                    a.arrayAccess(env, "error", k)
                            .set(
                                    NamespaceGlobal.pg_result_error_field
                                            .env(env)
                                            .call(result, v)
                                            .value());
                }
            }

            a.arrayAccess(env, "affected rows")
                    .set(NamespaceGlobal.pg_affected_rows.env(env).call(result).value());
            a.arrayAccess(env, "last OID")
                    .set(NamespaceGlobal.pg_last_oid.env(env).call(result).value());
            fields = NamespaceGlobal.pg_num_fields.env(env).call(result).value();
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', fields);
                    i.setObject(ZVal.increment(i.getObject()))) {
                field.setObject(
                        ZVal.newArray(
                                new ZPair(
                                        "name",
                                        NamespaceGlobal.pg_field_name
                                                .env(env)
                                                .call(result, i.getObject())
                                                .value()),
                                new ZPair(
                                        "table",
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s (OID: %s)",
                                                        NamespaceGlobal.pg_field_table
                                                                .env(env)
                                                                .call(result, i.getObject())
                                                                .value(),
                                                        NamespaceGlobal.pg_field_table
                                                                .env(env)
                                                                .call(result, i.getObject(), true)
                                                                .value())
                                                .value()),
                                new ZPair(
                                        "type",
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s (OID: %s)",
                                                        NamespaceGlobal.pg_field_type
                                                                .env(env)
                                                                .call(result, i.getObject())
                                                                .value(),
                                                        NamespaceGlobal.pg_field_type_oid
                                                                .env(env)
                                                                .call(result, i.getObject())
                                                                .value())
                                                .value()),
                                new ZPair(
                                        "nullable",
                                        ZVal.toBool(
                                                NamespaceGlobal.pg_field_is_null
                                                        .env(env)
                                                        .call(result, i.getObject())
                                                        .value())),
                                new ZPair(
                                        "storage",
                                        toStringR(
                                                        NamespaceGlobal.pg_field_size
                                                                .env(env)
                                                                .call(result, i.getObject())
                                                                .value(),
                                                        env)
                                                + " bytes"),
                                new ZPair(
                                        "display",
                                        toStringR(
                                                        NamespaceGlobal.pg_field_prtlen
                                                                .env(env)
                                                                .call(result, i.getObject())
                                                                .value(),
                                                        env)
                                                + " chars")));
                if (ZVal.strictEqualityCheck(" (OID: )", "===", field.arrayGet(env, "table"))) {
                    field.arrayAccess(env, "table").set(ZVal.getNull());
                }

                if (ZVal.strictEqualityCheck("-1 bytes", "===", field.arrayGet(env, "storage"))) {
                    field.arrayAccess(env, "storage").set("variable size");

                } else if (ZVal.strictEqualityCheck(
                        "1 bytes", "===", field.arrayGet(env, "storage"))) {
                    field.arrayAccess(env, "storage").set("1 byte");
                }

                if (ZVal.strictEqualityCheck("1 chars", "===", field.arrayGet(env, "display"))) {
                    field.arrayAccess(env, "display").set("1 char");
                }

                a.arrayAppend(env, "fields").set(new EnumStub(env, field.getObject()));
            }

            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object paramCodes =
                ZVal.arrayFromList(
                        "server_encoding",
                        "client_encoding",
                        "is_superuser",
                        "session_authorization",
                        "DateStyle",
                        "TimeZone",
                        "IntervalStyle",
                        "integer_datetimes",
                        "application_name",
                        "standard_conforming_strings");

        public Object transactionStatus =
                ZVal.newArray(
                        new ZPair(0, "PGSQL_TRANSACTION_IDLE"),
                        new ZPair(1, "PGSQL_TRANSACTION_ACTIVE"),
                        new ZPair(2, "PGSQL_TRANSACTION_INTRANS"),
                        new ZPair(3, "PGSQL_TRANSACTION_INERROR"),
                        new ZPair(4, "PGSQL_TRANSACTION_UNKNOWN"));

        public Object resultStatus =
                ZVal.newArray(
                        new ZPair(0, "PGSQL_EMPTY_QUERY"),
                        new ZPair(1, "PGSQL_COMMAND_OK"),
                        new ZPair(2, "PGSQL_TUPLES_OK"),
                        new ZPair(3, "PGSQL_COPY_OUT"),
                        new ZPair(4, "PGSQL_COPY_IN"),
                        new ZPair(5, "PGSQL_BAD_RESPONSE"),
                        new ZPair(6, "PGSQL_NONFATAL_ERROR"),
                        new ZPair(7, "PGSQL_FATAL_ERROR"));

        public Object diagCodes =
                ZVal.newArray(
                        new ZPair("severity", 83),
                        new ZPair("sqlstate", 67),
                        new ZPair("message", 77),
                        new ZPair("detail", 68),
                        new ZPair("hint", 72),
                        new ZPair("statement position", 80),
                        new ZPair("internal position", 112),
                        new ZPair("internal query", 113),
                        new ZPair("context", 87),
                        new ZPair("file", 70),
                        new ZPair("line", 76),
                        new ZPair("function", 82));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\PgSqlCaster")
                    .setLookup(
                            PgSqlCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames(
                            "diagCodes", "paramCodes", "resultStatus", "transactionStatus")
                    .setFilename("vendor/symfony/var-dumper/Caster/PgSqlCaster.php")
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
