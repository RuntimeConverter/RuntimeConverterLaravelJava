package com.project.convertedCode.includes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 server.php

*/

public class file_server_php implements RuntimeIncludable {

    public static final file_server_php instance = new file_server_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope228 scope = new Scope228();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope228 scope)
            throws IncludeEventException {
        scope.uri =
                NamespaceGlobal.urldecode
                        .env(env)
                        .call(
                                NamespaceGlobal.parse_url
                                        .env(env)
                                        .call(scope._SERVER.arrayGet(env, "REQUEST_URI"), 5)
                                        .value())
                        .value();
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(scope.uri, "!==", "/"))
                && ZVal.toBool(
                        function_file_exists
                                .f
                                .env(env)
                                .call(
                                        toStringR(env.addRootFilesystemPrefix("/"), env)
                                                + "/public"
                                                + toStringR(scope.uri, env))
                                .value())) {
            throw new IncludeEventException(ZVal.assign(false));
        }

        env.include(
                toStringR(env.addRootFilesystemPrefix("/"), env) + "/public/index.php",
                stack,
                this,
                true,
                true);
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/").setFile("/server.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope228 implements UpdateRuntimeScopeInterface {

        ReferenceContainer _SERVER;
        Object uri;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("_SERVER", this._SERVER);
            stack.setVariable("uri", this.uri);
        }

        public void updateScope(RuntimeStack stack) {

            this._SERVER = ZVal.getStackReference(stack.getVariable("_SERVER"));
            this.uri = stack.getVariable("uri");
        }
    }
}
