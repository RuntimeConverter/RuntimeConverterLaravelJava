package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsArray;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.IsEmptyString;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsInteger;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Number.classes.OrderingComparison;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Collection.classes.IsTraversableWithSize;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsNot;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes.IsArrayContainingKeyValuePair;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.StringContainsIgnoringCase;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.MatchesPattern;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.StringEndsWith;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsString;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsObject;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Xml.classes.HasXPath;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsScalar;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes.IsArrayContaining;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsAnything;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.StringContains;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsBoolean;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.Set;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsNumeric;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsDouble;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsIdentical;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes.IsArrayContainingKey;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.Is;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsInstanceOf;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsTypeOf;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsResource;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Collection.classes.IsEmptyTraversable;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.IsEqualIgnoringWhiteSpace;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.HasToString;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsSame;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.CombinableMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Number.classes.IsCloseTo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.StringStartsWith;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Type.classes.IsCallable;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes.IsArrayWithSize;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsEqual;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes.IsEqualIgnoringCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.Every;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsNull;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Matchers.php

*/

public class Matchers extends RuntimeClassBase {

    public Matchers(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Matchers(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Hamcrest\\Matchers";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object anArray(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList("\\Hamcrest\\Arrays\\IsArray", "anArray"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "item")
        public Object hasItemInArray(RuntimeEnv env, Object... args) {
            Object item = assignParameter(args, 0, false);
            return ZVal.assign(IsArrayContaining.runtimeStaticObject.hasItemInArray(env, item));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "item")
        public Object hasValue(RuntimeEnv env, Object... args) {
            Object item = assignParameter(args, 0, false);
            return ZVal.assign(IsArrayContaining.runtimeStaticObject.hasItemInArray(env, item));
        }

        @ConvertedMethod
        public Object arrayContainingInAnyOrder(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Arrays\\IsArrayContainingInAnyOrder",
                                            "arrayContainingInAnyOrder"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        public Object containsInAnyOrder(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Arrays\\IsArrayContainingInAnyOrder",
                                            "arrayContainingInAnyOrder"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        public Object arrayContaining(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Arrays\\IsArrayContainingInOrder",
                                            "arrayContaining"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        public Object contains(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Arrays\\IsArrayContainingInOrder",
                                            "arrayContaining"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        public Object hasKeyInArray(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            return ZVal.assign(IsArrayContainingKey.runtimeStaticObject.hasKeyInArray(env, key));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        public Object hasKey(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            return ZVal.assign(IsArrayContainingKey.runtimeStaticObject.hasKeyInArray(env, key));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        @ConvertedParameter(index = 1, name = "value")
        public Object hasKeyValuePair(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            return ZVal.assign(
                    IsArrayContainingKeyValuePair.runtimeStaticObject.hasKeyValuePair(
                            env, key, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        @ConvertedParameter(index = 1, name = "value")
        public Object hasEntry(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            return ZVal.assign(
                    IsArrayContainingKeyValuePair.runtimeStaticObject.hasKeyValuePair(
                            env, key, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "size")
        public Object arrayWithSize(RuntimeEnv env, Object... args) {
            Object size = assignParameter(args, 0, false);
            return ZVal.assign(IsArrayWithSize.runtimeStaticObject.arrayWithSize(env, size));
        }

        @ConvertedMethod
        public Object emptyArray(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsArrayWithSize.runtimeStaticObject.emptyArray(env));
        }

        @ConvertedMethod
        public Object nonEmptyArray(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsArrayWithSize.runtimeStaticObject.nonEmptyArray(env));
        }

        @ConvertedMethod
        public Object emptyTraversable(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyTraversable.runtimeStaticObject.emptyTraversable(env));
        }

        @ConvertedMethod
        public Object nonEmptyTraversable(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyTraversable.runtimeStaticObject.nonEmptyTraversable(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "size")
        public Object traversableWithSize(RuntimeEnv env, Object... args) {
            Object size = assignParameter(args, 0, false);
            return ZVal.assign(
                    IsTraversableWithSize.runtimeStaticObject.traversableWithSize(env, size));
        }

        @ConvertedMethod
        public Object allOf(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(ZVal.arrayFromList("\\Hamcrest\\Core\\AllOf", "allOf"), ___args)
                            .value());
        }

        @ConvertedMethod
        public Object anyOf(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(ZVal.arrayFromList("\\Hamcrest\\Core\\AnyOf", "anyOf"), ___args)
                            .value());
        }

        @ConvertedMethod
        public Object noneOf(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(ZVal.arrayFromList("\\Hamcrest\\Core\\AnyOf", "noneOf"), ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "matcher", typeHint = "Hamcrest\\Matcher")
        public Object both(RuntimeEnv env, Object... args) {
            Object matcher = assignParameter(args, 0, false);
            return ZVal.assign(CombinableMatcher.runtimeStaticObject.both(env, matcher));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "matcher", typeHint = "Hamcrest\\Matcher")
        public Object either(RuntimeEnv env, Object... args) {
            Object matcher = assignParameter(args, 0, false);
            return ZVal.assign(CombinableMatcher.runtimeStaticObject.either(env, matcher));
        }

        @ConvertedMethod
        public Object describedAs(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Core\\DescribedAs", "describedAs"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "itemMatcher", typeHint = "Hamcrest\\Matcher")
        public Object everyItem(RuntimeEnv env, Object... args) {
            Object itemMatcher = assignParameter(args, 0, false);
            return ZVal.assign(Every.runtimeStaticObject.everyItem(env, itemMatcher));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "matcher")
        public Object hasToString(RuntimeEnv env, Object... args) {
            Object matcher = assignParameter(args, 0, false);
            return ZVal.assign(HasToString.runtimeStaticObject.hasToString(env, matcher));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object is(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(Is.runtimeStaticObject.is(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "description")
        public Object anything(RuntimeEnv env, Object... args) {
            Object description = assignParameter(args, 0, true);
            if (null == description) {
                description = "ANYTHING";
            }
            return ZVal.assign(IsAnything.runtimeStaticObject.anything(env, description));
        }

        @ConvertedMethod
        public Object hasItem(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Core\\IsCollectionContaining", "hasItem"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        public Object hasItems(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Core\\IsCollectionContaining", "hasItems"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "item")
        public Object equalTo(RuntimeEnv env, Object... args) {
            Object item = assignParameter(args, 0, false);
            return ZVal.assign(IsEqual.runtimeStaticObject.equalTo(env, item));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object identicalTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(IsIdentical.runtimeStaticObject.identicalTo(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "theClass")
        public Object anInstanceOf(RuntimeEnv env, Object... args) {
            Object theClass = assignParameter(args, 0, false);
            return ZVal.assign(IsInstanceOf.runtimeStaticObject.anInstanceOf(env, theClass));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "theClass")
        public Object any(RuntimeEnv env, Object... args) {
            Object theClass = assignParameter(args, 0, false);
            return ZVal.assign(IsInstanceOf.runtimeStaticObject.anInstanceOf(env, theClass));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object not(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(IsNot.runtimeStaticObject.not(env, value));
        }

        @ConvertedMethod
        public Object nullValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsNull.runtimeStaticObject.nullValue(env));
        }

        @ConvertedMethod
        public Object notNullValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsNull.runtimeStaticObject.notNullValue(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        public Object sameInstance(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            return ZVal.assign(IsSame.runtimeStaticObject.sameInstance(env, _object));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "theType")
        public Object typeOf(RuntimeEnv env, Object... args) {
            Object theType = assignParameter(args, 0, false);
            return ZVal.assign(IsTypeOf.runtimeStaticObject.typeOf(env, theType));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "property")
        public Object set(RuntimeEnv env, Object... args) {
            Object property = assignParameter(args, 0, false);
            return ZVal.assign(Set.runtimeStaticObject.set(env, property));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "property")
        public Object notSet(RuntimeEnv env, Object... args) {
            Object property = assignParameter(args, 0, false);
            return ZVal.assign(Set.runtimeStaticObject.notSet(env, property));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "delta")
        public Object closeTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object delta = assignParameter(args, 1, false);
            return ZVal.assign(IsCloseTo.runtimeStaticObject.closeTo(env, value, delta));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object comparesEqualTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(OrderingComparison.runtimeStaticObject.comparesEqualTo(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object greaterThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(OrderingComparison.runtimeStaticObject.greaterThan(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object greaterThanOrEqualTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    OrderingComparison.runtimeStaticObject.greaterThanOrEqualTo(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object atLeast(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    OrderingComparison.runtimeStaticObject.greaterThanOrEqualTo(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object lessThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(OrderingComparison.runtimeStaticObject.lessThan(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object lessThanOrEqualTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    OrderingComparison.runtimeStaticObject.lessThanOrEqualTo(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object atMost(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    OrderingComparison.runtimeStaticObject.lessThanOrEqualTo(env, value));
        }

        @ConvertedMethod
        public Object isEmptyString(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyString.runtimeStaticObject.isEmptyString(env));
        }

        @ConvertedMethod
        public Object emptyString(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyString.runtimeStaticObject.isEmptyString(env));
        }

        @ConvertedMethod
        public Object isEmptyOrNullString(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyString.runtimeStaticObject.isEmptyOrNullString(env));
        }

        @ConvertedMethod
        public Object nullOrEmptyString(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyString.runtimeStaticObject.isEmptyOrNullString(env));
        }

        @ConvertedMethod
        public Object isNonEmptyString(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyString.runtimeStaticObject.isNonEmptyString(env));
        }

        @ConvertedMethod
        public Object nonEmptyString(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsEmptyString.runtimeStaticObject.isNonEmptyString(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object equalToIgnoringCase(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(
                    IsEqualIgnoringCase.runtimeStaticObject.equalToIgnoringCase(env, string));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object equalToIgnoringWhiteSpace(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(
                    IsEqualIgnoringWhiteSpace.runtimeStaticObject.equalToIgnoringWhiteSpace(
                            env, string));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern")
        public Object matchesPattern(RuntimeEnv env, Object... args) {
            Object pattern = assignParameter(args, 0, false);
            return ZVal.assign(MatchesPattern.runtimeStaticObject.matchesPattern(env, pattern));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "substring")
        public Object containsString(RuntimeEnv env, Object... args) {
            Object substring = assignParameter(args, 0, false);
            return ZVal.assign(StringContains.runtimeStaticObject.containsString(env, substring));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "substring")
        public Object containsStringIgnoringCase(RuntimeEnv env, Object... args) {
            Object substring = assignParameter(args, 0, false);
            return ZVal.assign(
                    StringContainsIgnoringCase.runtimeStaticObject.containsStringIgnoringCase(
                            env, substring));
        }

        @ConvertedMethod
        public Object stringContainsInOrder(RuntimeEnv env, Object... args) {
            Object ___args = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.arrayFromList(
                                            "\\Hamcrest\\Text\\StringContainsInOrder",
                                            "stringContainsInOrder"),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "substring")
        public Object endsWith(RuntimeEnv env, Object... args) {
            Object substring = assignParameter(args, 0, false);
            return ZVal.assign(StringEndsWith.runtimeStaticObject.endsWith(env, substring));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "substring")
        public Object startsWith(RuntimeEnv env, Object... args) {
            Object substring = assignParameter(args, 0, false);
            return ZVal.assign(StringStartsWith.runtimeStaticObject.startsWith(env, substring));
        }

        @ConvertedMethod
        public Object arrayValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsArray.runtimeStaticObject.arrayValue(env));
        }

        @ConvertedMethod
        public Object booleanValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsBoolean.runtimeStaticObject.booleanValue(env));
        }

        @ConvertedMethod
        public Object boolValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsBoolean.runtimeStaticObject.booleanValue(env));
        }

        @ConvertedMethod
        public Object callableValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsCallable.runtimeStaticObject.callableValue(env));
        }

        @ConvertedMethod
        public Object doubleValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsDouble.runtimeStaticObject.doubleValue(env));
        }

        @ConvertedMethod
        public Object floatValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsDouble.runtimeStaticObject.doubleValue(env));
        }

        @ConvertedMethod
        public Object integerValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsInteger.runtimeStaticObject.integerValue(env));
        }

        @ConvertedMethod
        public Object intValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsInteger.runtimeStaticObject.integerValue(env));
        }

        @ConvertedMethod
        public Object numericValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsNumeric.runtimeStaticObject.numericValue(env));
        }

        @ConvertedMethod
        public Object objectValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsObject.runtimeStaticObject.objectValue(env));
        }

        @ConvertedMethod
        public Object anObject(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsObject.runtimeStaticObject.objectValue(env));
        }

        @ConvertedMethod
        public Object resourceValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsResource.runtimeStaticObject.resourceValue(env));
        }

        @ConvertedMethod
        public Object scalarValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsScalar.runtimeStaticObject.scalarValue(env));
        }

        @ConvertedMethod
        public Object stringValue(RuntimeEnv env, Object... args) {
            return ZVal.assign(IsString.runtimeStaticObject.stringValue(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "xpath")
        @ConvertedParameter(
            index = 1,
            name = "matcher",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object hasXPath(RuntimeEnv env, Object... args) {
            Object xpath = assignParameter(args, 0, false);
            Object matcher = assignParameter(args, 1, true);
            if (null == matcher) {
                matcher = ZVal.getNull();
            }
            return ZVal.assign(HasXPath.runtimeStaticObject.hasXPath(env, xpath, matcher));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Matchers")
                    .setLookup(
                            Matchers.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Matchers.php")
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
