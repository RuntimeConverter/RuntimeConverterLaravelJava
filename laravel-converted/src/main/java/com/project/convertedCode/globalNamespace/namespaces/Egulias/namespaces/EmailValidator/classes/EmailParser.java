package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Parser.classes.LocalPart;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.EmailTooLong;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingATEXT;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Parser.classes.DomainPart;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes.EmailLexer;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.NoLocalPart;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/EmailParser.php

*/

public class EmailParser extends RuntimeClassBase {

    public Object warnings = null;

    public Object domainPart = "";

    public Object localPart = "";

    public Object lexer = null;

    public Object localPartParser = null;

    public Object domainPartParser = null;

    public EmailParser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EmailParser.class) {
            this.__construct(env, args);
        }
    }

    public EmailParser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lexer", typeHint = "Egulias\\EmailValidator\\EmailLexer")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lexer = assignParameter(args, 0, false);
        this.lexer = lexer;
        this.localPartParser = new LocalPart(env, this.lexer);
        this.domainPartParser = new DomainPart(env, this.lexer);
        this.warnings = new SplObjectStorage(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    public Object parse(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        env.callMethod(this.lexer, "setInput", EmailParser.class, str);
        if (!ZVal.isTrue(this.hasAtToken(env))) {
            throw ZVal.getException(env, new NoLocalPart(env));
        }

        env.callMethod(this.localPartParser, "parse", EmailParser.class, str);
        env.callMethod(this.domainPartParser, "parse", EmailParser.class, str);
        this.setParts(env, str);
        if (ZVal.isTrue(env.callMethod(this.lexer, "hasInvalidTokens", EmailParser.class))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("local", this.localPart), new ZPair("domain", this.domainPart)));
    }

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args) {
        Object localPartWarnings = null;
        Object domainPartWarnings = null;
        localPartWarnings = env.callMethod(this.localPartParser, "getWarnings", EmailParser.class);
        domainPartWarnings =
                env.callMethod(this.domainPartParser, "getWarnings", EmailParser.class);
        this.warnings =
                function_array_merge.f.env(env).call(localPartWarnings, domainPartWarnings).value();
        this.addLongEmailWarning(env, this.localPart, this.domainPart);
        return ZVal.assign(this.warnings);
    }

    @ConvertedMethod
    public Object getParsedDomainPart(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.domainPart);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    protected Object setParts(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, false);
        ReferenceContainer parts = new BasicReferenceContainer(null);
        parts.setObject(function_explode.f.env(env).call("@", email).value());
        this.domainPart = env.callMethod(this.domainPartParser, "getDomainPart", EmailParser.class);
        this.localPart = parts.arrayGet(env, 0);
        return null;
    }

    @ConvertedMethod
    protected Object hasAtToken(RuntimeEnv env, Object... args) {
        env.callMethod(this.lexer, "moveNext", EmailParser.class);
        env.callMethod(this.lexer, "moveNext", EmailParser.class);
        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(this.lexer, "token", env).arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_AT)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "localPart")
    @ConvertedParameter(index = 1, name = "parsedDomainPart")
    protected Object addLongEmailWarning(RuntimeEnv env, Object... args) {
        Object localPart = assignParameter(args, 0, false);
        Object parsedDomainPart = assignParameter(args, 1, false);
        if (ZVal.isGreaterThan(
                function_strlen
                        .f
                        .env(env)
                        .call(toStringR(localPart, env) + "@" + toStringR(parsedDomainPart, env))
                        .value(),
                '>',
                CONST_EMAIL_MAX_LENGTH)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, EmailTooLong.CONST_CODE)
                    .set(new EmailTooLong(env));
        }

        return null;
    }

    public static final Object CONST_EMAIL_MAX_LENGTH = 254;

    public static final Object CONST_class = "Egulias\\EmailValidator\\EmailParser";

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
                    .setName("Egulias\\EmailValidator\\EmailParser")
                    .setLookup(
                            EmailParser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "domainPart",
                            "domainPartParser",
                            "lexer",
                            "localPart",
                            "localPartParser",
                            "warnings")
                    .setFilename("vendor/egulias/email-validator/EmailValidator/EmailParser.php")
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
