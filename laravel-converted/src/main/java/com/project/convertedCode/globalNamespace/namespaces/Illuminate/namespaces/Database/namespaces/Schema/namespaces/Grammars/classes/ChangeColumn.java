package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/ChangeColumn.php

*/

public class ChangeColumn extends RuntimeClassBase {

    public ChangeColumn(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ChangeColumn(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\Grammars\\ChangeColumn";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "grammar")
        @ConvertedParameter(
            index = 1,
            name = "blueprint",
            typeHint = "Illuminate\\Database\\Schema\\Blueprint"
        )
        @ConvertedParameter(index = 2, name = "command", typeHint = "Illuminate\\Support\\Fluent")
        @ConvertedParameter(
            index = 3,
            name = "connection",
            typeHint = "Illuminate\\Database\\Connection"
        )
        public Object compile(RuntimeEnv env, Object... args) {
            Object grammar = assignParameter(args, 0, false);
            Object blueprint = assignParameter(args, 1, false);
            Object command = assignParameter(args, 2, false);
            Object connection = assignParameter(args, 3, false);
            Object schema = null;
            Object tableDiff = null;
            if (!ZVal.isTrue(
                    env.callMethod(connection, "isDoctrineAvailable", ChangeColumn.class))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Changing columns for table \"%s\" requires Doctrine DBAL; install \"doctrine/dbal\".",
                                                env.callMethod(
                                                        blueprint, "getTable", ChangeColumn.class))
                                        .value()));
            }

            tableDiff =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ChangeColumn.class)
                            .method("getChangedDiff")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    grammar,
                                    blueprint,
                                    schema =
                                            env.callMethod(
                                                    connection,
                                                    "getDoctrineSchemaManager",
                                                    ChangeColumn.class))
                            .value();
            if (ZVal.strictNotEqualityCheck(tableDiff, "!==", false)) {
                return ZVal.assign(
                        rToArrayCast(
                                env.callMethod(
                                        env.callMethod(
                                                schema, "getDatabasePlatform", ChangeColumn.class),
                                        "getAlterTableSQL",
                                        ChangeColumn.class,
                                        tableDiff)));
            }

            return ZVal.assign(ZVal.newArray());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "grammar")
        @ConvertedParameter(
            index = 1,
            name = "blueprint",
            typeHint = "Illuminate\\Database\\Schema\\Blueprint"
        )
        @ConvertedParameter(
            index = 2,
            name = "schema",
            typeHint = "Doctrine\\DBAL\\Schema\\AbstractSchemaManager"
        )
        protected Object getChangedDiff(RuntimeEnv env, Object... args) {
            Object grammar = assignParameter(args, 0, false);
            Object blueprint = assignParameter(args, 1, false);
            Object schema = assignParameter(args, 2, false);
            Object current = null;
            current =
                    env.callMethod(
                            schema,
                            "listTableDetails",
                            ChangeColumn.class,
                            toStringR(
                                            env.callMethod(
                                                    grammar, "getTablePrefix", ChangeColumn.class),
                                            env)
                                    + toStringR(
                                            env.callMethod(
                                                    blueprint, "getTable", ChangeColumn.class),
                                            env));
            return ZVal.assign(
                    env.callMethod(
                            env.createNew(ZVal.resolveClassAlias(env, "Comparator")),
                            "diffTable",
                            ChangeColumn.class,
                            current,
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, ChangeColumn.class)
                                    .method("getTableWithColumnChanges")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(blueprint, current)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "blueprint",
            typeHint = "Illuminate\\Database\\Schema\\Blueprint"
        )
        @ConvertedParameter(index = 1, name = "table", typeHint = "Doctrine\\DBAL\\Schema\\Table")
        protected Object getTableWithColumnChanges(RuntimeEnv env, Object... args) {
            PassByReferenceArgs rLastRefArgs;
            Object blueprint = assignParameter(args, 0, false);
            Object table = assignParameter(args, 1, false);
            Object method = null;
            Object column = null;
            Object fluent = null;
            Object value = null;
            Object key = null;
            Object option = null;
            table = ZVal.assign(((RuntimeClassInterface) table).phpClone(env));
            for (ZPair zpairResult365 :
                    ZVal.getIterable(
                            env.callMethod(blueprint, "getChangedColumns", ChangeColumn.class),
                            env,
                            true)) {
                fluent = ZVal.assign(zpairResult365.getValue());
                column =
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, ChangeColumn.class)
                                .method("getDoctrineColumn")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(table, fluent)
                                .value();
                for (ZPair zpairResult366 :
                        ZVal.getIterable(
                                env.callMethod(fluent, "getAttributes", ChangeColumn.class),
                                env,
                                false)) {
                    key = ZVal.assign(zpairResult366.getKey());
                    value = ZVal.assign(zpairResult366.getValue());
                    if (!function_is_null
                            .f
                            .env(env)
                            .call(
                                    option =
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, ChangeColumn.class)
                                                    .method("mapFluentOptionToDoctrine")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(key)
                                                    .value())
                            .getBool()) {
                        if (function_method_exists
                                .f
                                .env(env)
                                .call(
                                        column,
                                        method =
                                                "set"
                                                        + toStringR(
                                                                NamespaceGlobal.ucfirst
                                                                        .env(env)
                                                                        .call(option)
                                                                        .value(),
                                                                env))
                                .getBool()) {
                            env.callMethod(
                                    column,
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            0,
                                                            handleReturnReference(
                                                                    StaticMethodUtils
                                                                            .accessUnknownLateStaticMethod(
                                                                                    env,
                                                                                    this,
                                                                                    ChangeColumn
                                                                                            .class)
                                                                            .method(
                                                                                    "mapFluentValueToDoctrine")
                                                                            .addReferenceArgs(
                                                                                    new RuntimeArgsWithReferences())
                                                                            .call(option, value)
                                                                            .value())),
                                    toStringR(method, env),
                                    ChangeColumn.class,
                                    rLastRefArgs.get(0));
                        }
                    }
                }
            }

            return ZVal.assign(table);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "table", typeHint = "Doctrine\\DBAL\\Schema\\Table")
        @ConvertedParameter(index = 1, name = "fluent", typeHint = "Illuminate\\Support\\Fluent")
        protected Object getDoctrineColumn(RuntimeEnv env, Object... args) {
            Object table = assignParameter(args, 0, false);
            ReferenceContainer fluent =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    table,
                                    "changeColumn",
                                    ChangeColumn.class,
                                    fluent.arrayGet(env, "name"),
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, ChangeColumn.class)
                                            .method("getDoctrineColumnChangeOptions")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(fluent.getObject())
                                            .value()),
                            "getColumn",
                            ChangeColumn.class,
                            fluent.arrayGet(env, "name")));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "fluent", typeHint = "Illuminate\\Support\\Fluent")
        protected Object getDoctrineColumnChangeOptions(RuntimeEnv env, Object... args) {
            ReferenceContainer fluent =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer options = new BasicReferenceContainer(null);
            options.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "type",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, ChangeColumn.class)
                                            .method("getDoctrineColumnType")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(fluent.arrayGet(env, "type"))
                                            .value())));
            if (function_in_array
                    .f
                    .env(env)
                    .call(
                            fluent.arrayGet(env, "type"),
                            ZVal.arrayFromList("text", "mediumText", "longText"))
                    .getBool()) {
                options.arrayAccess(env, "length")
                        .set(
                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                env, this, ChangeColumn.class)
                                        .method("calculateDoctrineTextLength")
                                        .addReferenceArgs(new RuntimeArgsWithReferences())
                                        .call(fluent.arrayGet(env, "type"))
                                        .value());
            }

            return ZVal.assign(options.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        protected Object getDoctrineColumnType(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object type = assignParameter(args, 0, false);
            type = NamespaceGlobal.strtolower.env(env).call(type).value();
            switch (toStringR(type)) {
                case "biginteger":
                    type = "bigint";
                    break;
                case "smallinteger":
                    type = "smallint";
                    break;
                case "mediumtext":
                case "longtext":
                    type = "text";
                    break;
                case "binary":
                    type = "blob";
                    break;
            }
            ;
            return ZVal.assign(
                    StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Type"), env)
                            .callUnknownStaticMethod(
                                    env, "getType", new RuntimeArgsWithReferences(), type));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        protected Object calculateDoctrineTextLength(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            SwitchEnumType24 switchVariable24 =
                    ZVal.getEnum(
                            type,
                            SwitchEnumType24.DEFAULT_CASE,
                            SwitchEnumType24.STRING_mediumText,
                            "mediumText",
                            SwitchEnumType24.STRING_longText,
                            "longText");
            switch (switchVariable24) {
                case STRING_mediumText:
                    return ZVal.assign(ZVal.add(65535, 1));
                case STRING_longText:
                    return ZVal.assign(ZVal.add(16777215, 1));
                case DEFAULT_CASE:
                    return ZVal.assign(ZVal.add(255, 1));
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attribute")
        protected Object mapFluentOptionToDoctrine(RuntimeEnv env, Object... args) {
            Object attribute = assignParameter(args, 0, false);
            SwitchEnumType25 switchVariable25 =
                    ZVal.getEnum(
                            attribute,
                            SwitchEnumType25.DEFAULT_CASE,
                            SwitchEnumType25.STRING_type,
                            "type",
                            SwitchEnumType25.STRING_name,
                            "name",
                            SwitchEnumType25.STRING_nullable,
                            "nullable",
                            SwitchEnumType25.STRING_total,
                            "total",
                            SwitchEnumType25.STRING_places,
                            "places");
            switch (switchVariable25) {
                case STRING_type:
                case STRING_name:
                    return null;
                case STRING_nullable:
                    return "notnull";
                case STRING_total:
                    return "precision";
                case STRING_places:
                    return "scale";
                case DEFAULT_CASE:
                    return ZVal.assign(attribute);
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "option")
        @ConvertedParameter(index = 1, name = "value")
        protected Object mapFluentValueToDoctrine(RuntimeEnv env, Object... args) {
            Object option = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            return ZVal.assign(ZVal.equalityCheck(option, "notnull") ? !ZVal.isTrue(value) : value);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Schema\\Grammars\\ChangeColumn")
                    .setLookup(
                            ChangeColumn.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/ChangeColumn.php")
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

    private enum SwitchEnumType24 {
        STRING_mediumText,
        STRING_longText,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType25 {
        STRING_type,
        STRING_name,
        STRING_nullable,
        STRING_total,
        STRING_places,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
