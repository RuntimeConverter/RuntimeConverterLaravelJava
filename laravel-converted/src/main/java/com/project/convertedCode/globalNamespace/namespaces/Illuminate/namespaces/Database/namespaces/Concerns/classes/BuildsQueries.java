package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Concerns.classes;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Concerns/BuildsQueries.php

*/

public class BuildsQueries {

    public static final Object CONST_class = "Illuminate\\Database\\Concerns\\BuildsQueries";

    private static class Scope81 implements UpdateRuntimeScopeInterface {

        Object total;
        Object perPage;
        Object options;
        Object currentPage;
        Object items;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("total", this.total);
            stack.setVariable("perPage", this.perPage);
            stack.setVariable("options", this.options);
            stack.setVariable("currentPage", this.currentPage);
            stack.setVariable("items", this.items);
        }

        public void updateScope(RuntimeStack stack) {

            this.total = stack.getVariable("total");
            this.perPage = stack.getVariable("perPage");
            this.options = stack.getVariable("options");
            this.currentPage = stack.getVariable("currentPage");
            this.items = stack.getVariable("items");
        }
    }

    private static class Scope82 implements UpdateRuntimeScopeInterface {

        Object perPage;
        Object options;
        Object currentPage;
        Object items;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("perPage", this.perPage);
            stack.setVariable("options", this.options);
            stack.setVariable("currentPage", this.currentPage);
            stack.setVariable("items", this.items);
        }

        public void updateScope(RuntimeStack stack) {

            this.perPage = stack.getVariable("perPage");
            this.options = stack.getVariable("options");
            this.currentPage = stack.getVariable("currentPage");
            this.items = stack.getVariable("items");
        }
    }
}
