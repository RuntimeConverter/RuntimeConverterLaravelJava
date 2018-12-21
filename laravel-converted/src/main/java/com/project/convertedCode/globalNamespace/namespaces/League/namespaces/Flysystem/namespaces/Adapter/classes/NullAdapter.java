package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Config;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.AbstractAdapter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Adapter/NullAdapter.php

*/

public class NullAdapter extends AbstractAdapter {

    public NullAdapter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NullAdapter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object has(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object write(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope169 scope = new Scope169();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/NullAdapter.php");
            scope.path = assignParameter(args, 0, false);
            scope.contents = assignParameter(args, 1, false);
            scope.config = assignParameter(args, 2, false);
            scope.result = new BasicReferenceContainer(null);
            scope.visibility = null;
            scope.type = null;
            scope.type = "file";
            scope.result.setObject(
                    function_compact.f.env(env).call(stack, "contents", "type", "path").value());
            if (ZVal.isTrue(
                    scope.visibility =
                            env.callMethod(scope.config, "get", NullAdapter.class, "visibility"))) {
                scope.result.arrayAccess(env, "visibility").set(scope.visibility);
            }

            throw new IncludeEventException(ZVal.assign(scope.result.getObject()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object update(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object read(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object rename(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object delete(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object listContents(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = "";
        }
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = false;
        }
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMetadata(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getSize(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMimetype(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getVisibility(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope170 scope = new Scope170();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/NullAdapter.php");
            scope.path = assignParameter(args, 0, false);
            scope.visibility = assignParameter(args, 1, false);
            throw new IncludeEventException(
                    ZVal.assign(function_compact.f.env(env).call(stack, "visibility").value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    @ConvertedParameter(index = 1, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object createDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        return ZVal.assign(ZVal.newArray(new ZPair("path", dirname), new ZPair("type", "dir")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    public Object deleteDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object readStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object stream = null;
        if (!ZVal.isTrue(data.setObject(this.read(env, path)))) {
            return ZVal.assign(false);
        }

        stream = function_fopen.f.env(env).call("php://temp", "w+b").value();
        function_fwrite.f.env(env).call(stream, data.arrayGet(env, "contents"));
        NamespaceGlobal.rewind.env(env).call(stream);
        data.arrayAccess(env, "stream").set(stream);
        arrayActionR(ArrayAction.UNSET, data, env, "contents");
        return ZVal.assign(data.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "League\\Flysystem\\Adapter\\Polyfill\\Config"
    )
    @ConvertedParameter(index = 3, name = "fallback")
    protected Object stream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, false);
        Object fallback = assignParameter(args, 3, false);
        Object contents = null;
        Object fallbackCall = null;
        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Util"), env)
                .callUnknownStaticMethod(
                        env, "rewindStream", new RuntimeArgsWithReferences(), resource);
        contents = NamespaceGlobal.stream_get_contents.env(env).call(resource).value();
        fallbackCall = ZVal.newArray(new ZPair(0, this), new ZPair(1, fallback));
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(fallbackCall, path, contents, config)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "League\\Flysystem\\Adapter\\Polyfill\\Config"
    )
    public Object writeStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, false);
        return ZVal.assign(this.stream(env, path, resource, config, "write"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "League\\Flysystem\\Adapter\\Polyfill\\Config"
    )
    public Object updateStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, false);
        return ZVal.assign(this.stream(env, path, resource, config, "update"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object copy(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        Object result = null;
        ReferenceContainer response = new BasicReferenceContainer(null);
        response.setObject(this.readStream(env, path));
        if (ZVal.toBool(ZVal.strictEqualityCheck(response.getObject(), "===", false))
                || ZVal.toBool(
                        !function_is_resource
                                .f
                                .env(env)
                                .call(response.arrayGet(env, "stream"))
                                .getBool())) {
            return ZVal.assign(false);
        }

        result = this.writeStream(env, newpath, response.arrayGet(env, "stream"), new Config(env));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(result, "!==", false))
                && ZVal.toBool(
                        function_is_resource
                                .f
                                .env(env)
                                .call(response.arrayGet(env, "stream"))
                                .value())) {
            function_fclose.f.env(env).call(response.arrayGet(env, "stream"));
        }

        return ZVal.assign(ZVal.strictNotEqualityCheck(result, "!==", false));
    }

    public static final Object CONST_class = "League\\Flysystem\\Adapter\\NullAdapter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractAdapter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Adapter\\NullAdapter")
                    .setLookup(
                            NullAdapter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("pathPrefix", "pathSeparator")
                    .setFilename("vendor/league/flysystem/src/Adapter/NullAdapter.php")
                    .addInterface("League\\Flysystem\\AdapterInterface")
                    .addInterface("League\\Flysystem\\ReadInterface")
                    .addTrait("League\\Flysystem\\Adapter\\Polyfill\\StreamedTrait")
                    .addTrait("League\\Flysystem\\Adapter\\Polyfill\\StreamedCopyTrait")
                    .addExtendsClass("League\\Flysystem\\Adapter\\AbstractAdapter")
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

    private static class Scope169 implements UpdateRuntimeScopeInterface {

        ReferenceContainer result;
        Object path;
        Object visibility;
        Object contents;
        Object type;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("result", this.result);
            stack.setVariable("path", this.path);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("contents", this.contents);
            stack.setVariable("type", this.type);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.result = ZVal.getStackReference(stack.getVariable("result"));
            this.path = stack.getVariable("path");
            this.visibility = stack.getVariable("visibility");
            this.contents = stack.getVariable("contents");
            this.type = stack.getVariable("type");
            this.config = stack.getVariable("config");
        }
    }

    private static class Scope170 implements UpdateRuntimeScopeInterface {

        Object path;
        Object visibility;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("visibility", this.visibility);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this.visibility = stack.getVariable("visibility");
        }
    }
}
