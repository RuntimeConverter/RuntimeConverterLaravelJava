package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.namespaces.ListCommand.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeInterfaces.Reflector;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.SignatureFormatter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes.Mirror;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.FilterOptions;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ListCommand/Enumerator.php

*/

public abstract class Enumerator extends RuntimeClassBase {

    public Object filter = null;

    public Object presenter = null;

    public Enumerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Enumerator.class) {
            this.__construct(env, args);
        }
    }

    public Enumerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "presenter", typeHint = "Psy\\VarDumper\\Presenter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object presenter = assignParameter(args, 0, false);
        this.filter = new FilterOptions(env);
        this.presenter = presenter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "reflector",
        typeHint = "Reflector",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object enumerate(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, true);
        if (null == reflector) {
            reflector = ZVal.getNull();
        }
        Object target = assignParameter(args, 2, true);
        if (null == target) {
            target = ZVal.getNull();
        }
        env.callMethod(this.filter, "bind", Enumerator.class, input);
        return ZVal.assign(
                env.callMethod(this, "listItems", Enumerator.class, input, reflector, target));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object showItem(RuntimeEnv env, Object... args) {
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                env.callMethod(
                        this.filter,
                        new RuntimeArgsWithReferences().add(0, name),
                        "match",
                        Enumerator.class,
                        name.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object presentRef(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.presenter, "presentRef", Enumerator.class, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    protected Object presentSignature(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, false);
        if (!ZVal.isTrue(ZVal.checkInstanceType(target, Reflector.class, "Reflector"))) {
            target = Mirror.runtimeStaticObject.get(env, target);
        }

        return ZVal.assign(SignatureFormatter.runtimeStaticObject.format(env, target));
    }

    public static final Object CONST_IS_PUBLIC = "public";

    public static final Object CONST_IS_PROTECTED = "protected";

    public static final Object CONST_IS_PRIVATE = "private";

    public static final Object CONST_IS_GLOBAL = "global";

    public static final Object CONST_IS_CONSTANT = "const";

    public static final Object CONST_IS_CLASS = "class";

    public static final Object CONST_IS_FUNCTION = "function";

    public static final Object CONST_class = "Psy\\Command\\ListCommand\\Enumerator";

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
                    .setName("Psy\\Command\\ListCommand\\Enumerator")
                    .setLookup(
                            Enumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "presenter")
                    .setFilename("vendor/psy/psysh/src/Command/ListCommand/Enumerator.php")
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
