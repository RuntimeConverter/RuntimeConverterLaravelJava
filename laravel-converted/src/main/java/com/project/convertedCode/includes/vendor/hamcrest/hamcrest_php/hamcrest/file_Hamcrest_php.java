package com.project.convertedCode.includes.vendor.hamcrest.hamcrest_php.hamcrest;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php

*/

public class file_Hamcrest_php implements RuntimeIncludable {

    public static final file_Hamcrest_php instance = new file_Hamcrest_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope797 scope = new Scope797();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope797 scope)
            throws IncludeEventException {
        if (function_function_exists.functionHasBeenDefined(env, "assertThat")) {
            env.addManualFunctionLoad("assertThat");
        }
        if (function_function_exists.functionHasBeenDefined(env, "anArray")) {
            env.addManualFunctionLoad("anArray");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasItemInArray")) {
            env.addManualFunctionLoad("hasItemInArray");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasValue")) {
            env.addManualFunctionLoad("hasValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "arrayContainingInAnyOrder")) {
            env.addManualFunctionLoad("arrayContainingInAnyOrder");
        }
        if (function_function_exists.functionHasBeenDefined(env, "containsInAnyOrder")) {
            env.addManualFunctionLoad("containsInAnyOrder");
        }
        if (function_function_exists.functionHasBeenDefined(env, "arrayContaining")) {
            env.addManualFunctionLoad("arrayContaining");
        }
        if (function_function_exists.functionHasBeenDefined(env, "contains")) {
            env.addManualFunctionLoad("contains");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasKeyInArray")) {
            env.addManualFunctionLoad("hasKeyInArray");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasKey")) {
            env.addManualFunctionLoad("hasKey");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasKeyValuePair")) {
            env.addManualFunctionLoad("hasKeyValuePair");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasEntry")) {
            env.addManualFunctionLoad("hasEntry");
        }
        if (function_function_exists.functionHasBeenDefined(env, "arrayWithSize")) {
            env.addManualFunctionLoad("arrayWithSize");
        }
        if (function_function_exists.functionHasBeenDefined(env, "emptyArray")) {
            env.addManualFunctionLoad("emptyArray");
        }
        if (function_function_exists.functionHasBeenDefined(env, "nonEmptyArray")) {
            env.addManualFunctionLoad("nonEmptyArray");
        }
        if (function_function_exists.functionHasBeenDefined(env, "emptyTraversable")) {
            env.addManualFunctionLoad("emptyTraversable");
        }
        if (function_function_exists.functionHasBeenDefined(env, "nonEmptyTraversable")) {
            env.addManualFunctionLoad("nonEmptyTraversable");
        }
        if (function_function_exists.functionHasBeenDefined(env, "traversableWithSize")) {
            env.addManualFunctionLoad("traversableWithSize");
        }
        if (function_function_exists.functionHasBeenDefined(env, "allOf")) {
            env.addManualFunctionLoad("allOf");
        }
        if (function_function_exists.functionHasBeenDefined(env, "anyOf")) {
            env.addManualFunctionLoad("anyOf");
        }
        if (function_function_exists.functionHasBeenDefined(env, "noneOf")) {
            env.addManualFunctionLoad("noneOf");
        }
        if (function_function_exists.functionHasBeenDefined(env, "both")) {
            env.addManualFunctionLoad("both");
        }
        if (function_function_exists.functionHasBeenDefined(env, "either")) {
            env.addManualFunctionLoad("either");
        }
        if (function_function_exists.functionHasBeenDefined(env, "describedAs")) {
            env.addManualFunctionLoad("describedAs");
        }
        if (function_function_exists.functionHasBeenDefined(env, "everyItem")) {
            env.addManualFunctionLoad("everyItem");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasToString")) {
            env.addManualFunctionLoad("hasToString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "is")) {
            env.addManualFunctionLoad("is");
        }
        if (function_function_exists.functionHasBeenDefined(env, "anything")) {
            env.addManualFunctionLoad("anything");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasItem")) {
            env.addManualFunctionLoad("hasItem");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasItems")) {
            env.addManualFunctionLoad("hasItems");
        }
        if (function_function_exists.functionHasBeenDefined(env, "equalTo")) {
            env.addManualFunctionLoad("equalTo");
        }
        if (function_function_exists.functionHasBeenDefined(env, "identicalTo")) {
            env.addManualFunctionLoad("identicalTo");
        }
        if (function_function_exists.functionHasBeenDefined(env, "anInstanceOf")) {
            env.addManualFunctionLoad("anInstanceOf");
        }
        if (function_function_exists.functionHasBeenDefined(env, "any")) {
            env.addManualFunctionLoad("any");
        }
        if (function_function_exists.functionHasBeenDefined(env, "not")) {
            env.addManualFunctionLoad("not");
        }
        if (function_function_exists.functionHasBeenDefined(env, "nullValue")) {
            env.addManualFunctionLoad("nullValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "notNullValue")) {
            env.addManualFunctionLoad("notNullValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "sameInstance")) {
            env.addManualFunctionLoad("sameInstance");
        }
        if (function_function_exists.functionHasBeenDefined(env, "typeOf")) {
            env.addManualFunctionLoad("typeOf");
        }
        if (function_function_exists.functionHasBeenDefined(env, "set")) {
            env.addManualFunctionLoad("set");
        }
        if (function_function_exists.functionHasBeenDefined(env, "notSet")) {
            env.addManualFunctionLoad("notSet");
        }
        if (function_function_exists.functionHasBeenDefined(env, "closeTo")) {
            env.addManualFunctionLoad("closeTo");
        }
        if (function_function_exists.functionHasBeenDefined(env, "comparesEqualTo")) {
            env.addManualFunctionLoad("comparesEqualTo");
        }
        if (function_function_exists.functionHasBeenDefined(env, "greaterThan")) {
            env.addManualFunctionLoad("greaterThan");
        }
        if (function_function_exists.functionHasBeenDefined(env, "greaterThanOrEqualTo")) {
            env.addManualFunctionLoad("greaterThanOrEqualTo");
        }
        if (function_function_exists.functionHasBeenDefined(env, "atLeast")) {
            env.addManualFunctionLoad("atLeast");
        }
        if (function_function_exists.functionHasBeenDefined(env, "lessThan")) {
            env.addManualFunctionLoad("lessThan");
        }
        if (function_function_exists.functionHasBeenDefined(env, "lessThanOrEqualTo")) {
            env.addManualFunctionLoad("lessThanOrEqualTo");
        }
        if (function_function_exists.functionHasBeenDefined(env, "atMost")) {
            env.addManualFunctionLoad("atMost");
        }
        if (function_function_exists.functionHasBeenDefined(env, "isEmptyString")) {
            env.addManualFunctionLoad("isEmptyString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "emptyString")) {
            env.addManualFunctionLoad("emptyString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "isEmptyOrNullString")) {
            env.addManualFunctionLoad("isEmptyOrNullString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "nullOrEmptyString")) {
            env.addManualFunctionLoad("nullOrEmptyString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "isNonEmptyString")) {
            env.addManualFunctionLoad("isNonEmptyString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "nonEmptyString")) {
            env.addManualFunctionLoad("nonEmptyString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "equalToIgnoringCase")) {
            env.addManualFunctionLoad("equalToIgnoringCase");
        }
        if (function_function_exists.functionHasBeenDefined(env, "equalToIgnoringWhiteSpace")) {
            env.addManualFunctionLoad("equalToIgnoringWhiteSpace");
        }
        if (function_function_exists.functionHasBeenDefined(env, "matchesPattern")) {
            env.addManualFunctionLoad("matchesPattern");
        }
        if (function_function_exists.functionHasBeenDefined(env, "containsString")) {
            env.addManualFunctionLoad("containsString");
        }
        if (function_function_exists.functionHasBeenDefined(env, "containsStringIgnoringCase")) {
            env.addManualFunctionLoad("containsStringIgnoringCase");
        }
        if (function_function_exists.functionHasBeenDefined(env, "stringContainsInOrder")) {
            env.addManualFunctionLoad("stringContainsInOrder");
        }
        if (function_function_exists.functionHasBeenDefined(env, "endsWith")) {
            env.addManualFunctionLoad("endsWith");
        }
        if (function_function_exists.functionHasBeenDefined(env, "startsWith")) {
            env.addManualFunctionLoad("startsWith");
        }
        if (function_function_exists.functionHasBeenDefined(env, "arrayValue")) {
            env.addManualFunctionLoad("arrayValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "booleanValue")) {
            env.addManualFunctionLoad("booleanValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "boolValue")) {
            env.addManualFunctionLoad("boolValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "callableValue")) {
            env.addManualFunctionLoad("callableValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "doubleValue")) {
            env.addManualFunctionLoad("doubleValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "floatValue")) {
            env.addManualFunctionLoad("floatValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "integerValue")) {
            env.addManualFunctionLoad("integerValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "intValue")) {
            env.addManualFunctionLoad("intValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "numericValue")) {
            env.addManualFunctionLoad("numericValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "objectValue")) {
            env.addManualFunctionLoad("objectValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "anObject")) {
            env.addManualFunctionLoad("anObject");
        }
        if (function_function_exists.functionHasBeenDefined(env, "resourceValue")) {
            env.addManualFunctionLoad("resourceValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "scalarValue")) {
            env.addManualFunctionLoad("scalarValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "stringValue")) {
            env.addManualFunctionLoad("stringValue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "hasXPath")) {
            env.addManualFunctionLoad("hasXPath");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/hamcrest/hamcrest-php/hamcrest")
                    .setFile("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope797 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
