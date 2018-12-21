package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes.Readline;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Readline/HoaConsole.php

*/

public class HoaConsole extends RuntimeClassBase implements Readline {

    public Object hoaReadline = null;

    public HoaConsole(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HoaConsole.class) {
            this.__construct(env, args);
        }
    }

    public HoaConsole(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.hoaReadline = env.createNew(ZVal.resolveClassAlias(env, "HoaReadline"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object addHistory(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        env.callMethod(this.hoaReadline, "addHistory", HoaConsole.class, line);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object clearHistory(RuntimeEnv env, Object... args) {
        env.callMethod(this.hoaReadline, "clearHistory", HoaConsole.class);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object listHistory(RuntimeEnv env, Object... args) {
        Object item = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer list = new BasicReferenceContainer(null);
        i.setObject(0);
        list.setObject(ZVal.newArray());
        while (ZVal.strictNotEqualityCheck(
                item =
                        env.callMethod(
                                this.hoaReadline,
                                "getHistory",
                                HoaConsole.class,
                                ZVal.postIncrement(i)),
                "!==",
                ZVal.getNull())) {
            list.arrayAppend(env).set(item);
        }

        return ZVal.assign(list.getObject());
    }

    @ConvertedMethod
    public Object readHistory(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prompt",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object readline(RuntimeEnv env, Object... args) {
        Object prompt = assignParameter(args, 0, true);
        if (null == prompt) {
            prompt = ZVal.getNull();
        }
        return ZVal.assign(env.callMethod(this.hoaReadline, "readLine", HoaConsole.class, prompt));
    }

    @ConvertedMethod
    public Object redisplay(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object writeHistory(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    public static final Object CONST_class = "Psy\\Readline\\HoaConsole";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_class_exists.f.env(env).call("\\Hoa\\Console\\Console", true).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Readline\\HoaConsole")
                    .setLookup(
                            HoaConsole.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("hoaReadline")
                    .setFilename("vendor/psy/psysh/src/Readline/HoaConsole.php")
                    .addInterface("Psy\\Readline\\Readline")
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
