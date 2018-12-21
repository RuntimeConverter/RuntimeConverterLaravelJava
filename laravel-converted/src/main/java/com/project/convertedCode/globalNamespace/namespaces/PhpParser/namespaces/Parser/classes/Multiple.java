package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Parser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Parser;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.ErrorHandler.classes.Throwing;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Parser/Multiple.php

*/

public class Multiple extends RuntimeClassBase implements Parser {

    public Object parsers = null;

    public Multiple(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Multiple.class) {
            this.__construct(env, args);
        }
    }

    public Multiple(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parsers", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parsers = assignParameter(args, 0, false);
        this.parsers = parsers;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "errorHandler",
        typeHint = "PhpParser\\ErrorHandler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object parse(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object errorHandler = assignParameter(args, 1, true);
        if (null == errorHandler) {
            errorHandler = ZVal.getNull();
        }
        Object stmts = null;
        Object firstError = null;
        Object c = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object firstStmts = null;
        Object error = null;
        Object runtimeTempArrayResult121 = null;
        Object runtimeTempArrayResult120 = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", errorHandler)) {
            errorHandler = new Throwing(env);
        }

        ZVal.list(
                runtimeTempArrayResult120 =
                        this.tryParse(
                                env,
                                new ReferenceClassProperty(this, "parsers", env).arrayGet(env, 0),
                                errorHandler,
                                code),
                (firstStmts = listGet(runtimeTempArrayResult120, 0, env)),
                (firstError = listGet(runtimeTempArrayResult120, 1, env)));
        if (ZVal.strictEqualityCheck(firstError, "===", ZVal.getNull())) {
            return ZVal.assign(firstStmts);
        }

        for (i.setObject(1), c = function_count.f.env(env).call(this.parsers).value();
                ZVal.isLessThan(i.getObject(), '<', c);
                i.setObject(ZVal.increment(i.getObject()))) {
            ZVal.list(
                    runtimeTempArrayResult121 =
                            this.tryParse(
                                    env,
                                    new ReferenceClassProperty(this, "parsers", env)
                                            .arrayGet(env, i.getObject()),
                                    errorHandler,
                                    code),
                    (stmts = listGet(runtimeTempArrayResult121, 0, env)),
                    (error = listGet(runtimeTempArrayResult121, 1, env)));
            if (ZVal.strictEqualityCheck(error, "===", ZVal.getNull())) {
                return ZVal.assign(stmts);
            }
        }

        throw ZVal.getException(env, firstError);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parser", typeHint = "PhpParser\\Parser")
    @ConvertedParameter(index = 1, name = "errorHandler", typeHint = "PhpParser\\ErrorHandler")
    @ConvertedParameter(index = 2, name = "code")
    private Object tryParse(RuntimeEnv env, Object... args) {
        Object parser = assignParameter(args, 0, false);
        ReferenceContainer errorHandler =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object code = assignParameter(args, 2, false);
        Object stmts = null;
        Object error = null;
        stmts = ZVal.getNull();
        error = ZVal.getNull();
        try {
            stmts =
                    env.callMethod(
                            parser,
                            new RuntimeArgsWithReferences().add(1, errorHandler),
                            "parse",
                            Multiple.class,
                            code,
                            errorHandler.getObject());
        } catch (ConvertedException convertedException97) {
            if (convertedException97.instanceOf(Error.class, "PhpParser\\Error")) {
                error = convertedException97.getObject();
            } else {
                throw convertedException97;
            }
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, stmts), new ZPair(1, error)));
    }

    public static final Object CONST_class = "PhpParser\\Parser\\Multiple";

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
                    .setName("PhpParser\\Parser\\Multiple")
                    .setLookup(
                            Multiple.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parsers")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Parser/Multiple.php")
                    .addInterface("PhpParser\\Parser")
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
