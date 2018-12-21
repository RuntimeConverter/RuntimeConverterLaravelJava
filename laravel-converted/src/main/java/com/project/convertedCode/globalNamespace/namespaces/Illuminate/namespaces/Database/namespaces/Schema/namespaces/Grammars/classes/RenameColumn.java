package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/RenameColumn.php

*/

public class RenameColumn extends RuntimeClassBase {

    public RenameColumn(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RenameColumn(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\Grammars\\RenameColumn";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "grammar",
            typeHint = "Illuminate\\Database\\Schema\\Grammars\\Grammar"
        )
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
            Object column = null;
            column =
                    env.callMethod(
                            connection,
                            "getDoctrineColumn",
                            RenameColumn.class,
                            toStringR(
                                            env.callMethod(
                                                    grammar, "getTablePrefix", RenameColumn.class),
                                            env)
                                    + toStringR(
                                            env.callMethod(
                                                    blueprint, "getTable", RenameColumn.class),
                                            env),
                            toObjectR(command).accessProp(this, env).name("from").value());
            schema = env.callMethod(connection, "getDoctrineSchemaManager", RenameColumn.class);
            return ZVal.assign(
                    rToArrayCast(
                            env.callMethod(
                                    env.callMethod(
                                            schema, "getDatabasePlatform", RenameColumn.class),
                                    "getAlterTableSQL",
                                    RenameColumn.class,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, RenameColumn.class)
                                            .method("getRenamedDiff")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(grammar, blueprint, command, column, schema)
                                            .value())));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "grammar",
            typeHint = "Illuminate\\Database\\Schema\\Grammars\\Grammar"
        )
        @ConvertedParameter(
            index = 1,
            name = "blueprint",
            typeHint = "Illuminate\\Database\\Schema\\Blueprint"
        )
        @ConvertedParameter(index = 2, name = "command", typeHint = "Illuminate\\Support\\Fluent")
        @ConvertedParameter(index = 3, name = "column", typeHint = "Doctrine\\DBAL\\Schema\\Column")
        @ConvertedParameter(
            index = 4,
            name = "schema",
            typeHint = "Doctrine\\DBAL\\Schema\\AbstractSchemaManager"
        )
        protected Object getRenamedDiff(RuntimeEnv env, Object... args) {
            Object grammar = assignParameter(args, 0, false);
            Object blueprint = assignParameter(args, 1, false);
            Object command = assignParameter(args, 2, false);
            Object column = assignParameter(args, 3, false);
            Object schema = assignParameter(args, 4, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, RenameColumn.class)
                            .method("setRenamedColumns")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.callMethod(
                                            grammar,
                                            "getDoctrineTableDiff",
                                            RenameColumn.class,
                                            blueprint,
                                            schema),
                                    command,
                                    column)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "tableDiff",
            typeHint = "Doctrine\\DBAL\\Schema\\TableDiff"
        )
        @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
        @ConvertedParameter(index = 2, name = "column", typeHint = "Doctrine\\DBAL\\Schema\\Column")
        protected Object setRenamedColumns(RuntimeEnv env, Object... args) {
            Object tableDiff = assignParameter(args, 0, false);
            Object command = assignParameter(args, 1, false);
            Object column = assignParameter(args, 2, false);
            toObjectR(tableDiff)
                    .accessProp(this, env)
                    .name("renamedColumns")
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            toObjectR(command)
                                                    .accessProp(this, env)
                                                    .name("from")
                                                    .value(),
                                            env.createNew(
                                                    ZVal.resolveClassAlias(env, "Column"),
                                                    toObjectR(command)
                                                            .accessProp(this, env)
                                                            .name("to")
                                                            .value(),
                                                    env.callMethod(
                                                            column, "getType", RenameColumn.class),
                                                    env.callMethod(
                                                            column,
                                                            "toArray",
                                                            RenameColumn.class)))));
            return ZVal.assign(tableDiff);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Schema\\Grammars\\RenameColumn")
                    .setLookup(
                            RenameColumn.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/RenameColumn.php")
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
