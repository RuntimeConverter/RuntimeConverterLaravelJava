package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsReadable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsFinite;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Count;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.StringMatchesFormatDescription;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LessThan;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.TraversableContainsOnly;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsFalse;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.GreaterThan;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.FileExists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ArraySubset;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsInfinite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.StringEndsWith;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsType;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ArrayHasKey;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsAnything;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.StringContains;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.DirectoryExists;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEmpty;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.TraversableContains;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Attribute;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsIdentical;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalXor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.InvalidArgumentHelper;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsNan;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsInstanceOf;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalOr;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalNot;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.SameSize;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.JsonMatches;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.LogicalAnd;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsJson;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ObjectHasAttribute;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.RegularExpression;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.StringStartsWith;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ClassHasAttribute;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Type;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsWritable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Callback;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.ClassHasStaticAttribute;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestError;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Xml;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsTrue;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsNull;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Assert.php

*/

public abstract class Assert extends RuntimeClassBase {

    public Assert(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Assert(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Assert";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        @ConvertedParameter(index = 1, name = "array")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertArrayHasKey(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            Object array = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object constraint = null;
            if (!ZVal.toBool(function_is_int.f.env(env).call(key).value())
                    || ZVal.toBool(function_is_string.f.env(env).call(key).value())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "integer or string"));
            }

            if (!ZVal.toBool(function_is_array.f.env(env).call(array).value())
                    || ZVal.toBool(
                            ZVal.checkInstanceType(array, ArrayAccess.class, "ArrayAccess"))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "array or ArrayAccess"));
            }

            constraint = new ArrayHasKey(env, key);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(array, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "subset")
        @ConvertedParameter(index = 1, name = "array")
        @ConvertedParameter(
            index = 2,
            name = "checkForObjectIdentity",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertArraySubset(RuntimeEnv env, Object... args) {
            Object subset = assignParameter(args, 0, false);
            Object array = assignParameter(args, 1, false);
            Object checkForObjectIdentity = assignParameter(args, 2, true);
            if (null == checkForObjectIdentity) {
                checkForObjectIdentity = false;
            }
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object constraint = null;
            if (!ZVal.toBool(function_is_array.f.env(env).call(subset).value())
                    || ZVal.toBool(
                            ZVal.checkInstanceType(subset, ArrayAccess.class, "ArrayAccess"))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "array or ArrayAccess"));
            }

            if (!ZVal.toBool(function_is_array.f.env(env).call(array).value())
                    || ZVal.toBool(
                            ZVal.checkInstanceType(array, ArrayAccess.class, "ArrayAccess"))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "array or ArrayAccess"));
            }

            constraint = new ArraySubset(env, subset, checkForObjectIdentity);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(array, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        @ConvertedParameter(index = 1, name = "array")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertArrayNotHasKey(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            Object array = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object constraint = null;
            if (!ZVal.toBool(function_is_int.f.env(env).call(key).value())
                    || ZVal.toBool(function_is_string.f.env(env).call(key).value())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "integer or string"));
            }

            if (!ZVal.toBool(function_is_array.f.env(env).call(array).value())
                    || ZVal.toBool(
                            ZVal.checkInstanceType(array, ArrayAccess.class, "ArrayAccess"))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "array or ArrayAccess"));
            }

            constraint = new LogicalNot(env, new ArrayHasKey(env, key));
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(array, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "needle")
        @ConvertedParameter(index = 1, name = "haystack")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "checkForObjectIdentity",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "checkForNonObjectIdentity",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertContains(RuntimeEnv env, Object... args) {
            Object needle = assignParameter(args, 0, false);
            Object haystack = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ignoreCase = assignParameter(args, 3, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            Object checkForObjectIdentity = assignParameter(args, 4, true);
            if (null == checkForObjectIdentity) {
                checkForObjectIdentity = true;
            }
            Object checkForNonObjectIdentity = assignParameter(args, 5, true);
            if (null == checkForNonObjectIdentity) {
                checkForNonObjectIdentity = false;
            }
            Object constraint = null;
            if (ZVal.toBool(function_is_array.f.env(env).call(haystack).value())
                    || ZVal.toBool(
                            ZVal.toBool(function_is_object.f.env(env).call(haystack).value())
                                    && ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    haystack, Traversable.class, "Traversable")))) {
                constraint =
                        new TraversableContains(
                                env, needle, checkForObjectIdentity, checkForNonObjectIdentity);

            } else if (function_is_string.f.env(env).call(haystack).getBool()) {
                if (!function_is_string.f.env(env).call(needle).getBool()) {
                    throw ZVal.getException(
                            env,
                            InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
                }

                constraint = new StringContains(env, needle, ignoreCase);

            } else {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "array, traversable or string"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(haystack, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "needle")
        @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "haystackClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 4,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "checkForObjectIdentity",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "checkForNonObjectIdentity",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertAttributeContains(RuntimeEnv env, Object... args) {
            Object needle = assignParameter(args, 0, false);
            Object haystackAttributeName = assignParameter(args, 1, false);
            Object haystackClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object ignoreCase = assignParameter(args, 4, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            Object checkForObjectIdentity = assignParameter(args, 5, true);
            if (null == checkForObjectIdentity) {
                checkForObjectIdentity = true;
            }
            Object checkForNonObjectIdentity = assignParameter(args, 6, true);
            if (null == checkForNonObjectIdentity) {
                checkForNonObjectIdentity = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertContains")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            needle,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            message,
                            ignoreCase,
                            checkForObjectIdentity,
                            checkForNonObjectIdentity)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "needle")
        @ConvertedParameter(index = 1, name = "haystack")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "checkForObjectIdentity",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "checkForNonObjectIdentity",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertNotContains(RuntimeEnv env, Object... args) {
            Object needle = assignParameter(args, 0, false);
            Object haystack = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ignoreCase = assignParameter(args, 3, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            Object checkForObjectIdentity = assignParameter(args, 4, true);
            if (null == checkForObjectIdentity) {
                checkForObjectIdentity = true;
            }
            Object checkForNonObjectIdentity = assignParameter(args, 5, true);
            if (null == checkForNonObjectIdentity) {
                checkForNonObjectIdentity = false;
            }
            Object constraint = null;
            if (ZVal.toBool(function_is_array.f.env(env).call(haystack).value())
                    || ZVal.toBool(
                            ZVal.toBool(function_is_object.f.env(env).call(haystack).value())
                                    && ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    haystack, Traversable.class, "Traversable")))) {
                constraint =
                        new LogicalNot(
                                env,
                                new TraversableContains(
                                        env,
                                        needle,
                                        checkForObjectIdentity,
                                        checkForNonObjectIdentity));

            } else if (function_is_string.f.env(env).call(haystack).getBool()) {
                if (!function_is_string.f.env(env).call(needle).getBool()) {
                    throw ZVal.getException(
                            env,
                            InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "string"));
                }

                constraint = new LogicalNot(env, new StringContains(env, needle, ignoreCase));

            } else {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "array, traversable or string"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(haystack, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "needle")
        @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "haystackClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 4,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "checkForObjectIdentity",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "checkForNonObjectIdentity",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertAttributeNotContains(RuntimeEnv env, Object... args) {
            Object needle = assignParameter(args, 0, false);
            Object haystackAttributeName = assignParameter(args, 1, false);
            Object haystackClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object ignoreCase = assignParameter(args, 4, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            Object checkForObjectIdentity = assignParameter(args, 5, true);
            if (null == checkForObjectIdentity) {
                checkForObjectIdentity = true;
            }
            Object checkForNonObjectIdentity = assignParameter(args, 6, true);
            if (null == checkForNonObjectIdentity) {
                checkForNonObjectIdentity = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotContains")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            needle,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            message,
                            ignoreCase,
                            checkForObjectIdentity,
                            checkForNonObjectIdentity)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        @ConvertedParameter(index = 1, name = "haystack", typeHint = "iterable")
        @ConvertedParameter(
            index = 2,
            name = "isNativeType",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertContainsOnly(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            Object haystack = assignParameter(args, 1, false);
            Object isNativeType = assignParameter(args, 2, true);
            if (null == isNativeType) {
                isNativeType = ZVal.getNull();
            }
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.strictEqualityCheck(isNativeType, "===", ZVal.getNull())) {
                isNativeType = Type.runtimeStaticObject.isType(env, type);
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(haystack, new TraversableContainsOnly(env, type, isNativeType), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "haystack", typeHint = "iterable")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertContainsOnlyInstancesOf(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object haystack = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(haystack, new TraversableContainsOnly(env, className, false), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "haystackClassOrObject")
        @ConvertedParameter(
            index = 3,
            name = "isNativeType",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 4, name = "message", typeHint = "string")
        public Object assertAttributeContainsOnly(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            Object haystackAttributeName = assignParameter(args, 1, false);
            Object haystackClassOrObject = assignParameter(args, 2, false);
            Object isNativeType = assignParameter(args, 3, true);
            if (null == isNativeType) {
                isNativeType = ZVal.getNull();
            }
            Object message = assignParameter(args, 4, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertContainsOnly")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            type,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            isNativeType,
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        @ConvertedParameter(index = 1, name = "haystack", typeHint = "iterable")
        @ConvertedParameter(
            index = 2,
            name = "isNativeType",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertNotContainsOnly(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            Object haystack = assignParameter(args, 1, false);
            Object isNativeType = assignParameter(args, 2, true);
            if (null == isNativeType) {
                isNativeType = ZVal.getNull();
            }
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.strictEqualityCheck(isNativeType, "===", ZVal.getNull())) {
                isNativeType = Type.runtimeStaticObject.isType(env, type);
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            haystack,
                            new LogicalNot(
                                    env, new TraversableContainsOnly(env, type, isNativeType)),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "haystackClassOrObject")
        @ConvertedParameter(
            index = 3,
            name = "isNativeType",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 4, name = "message", typeHint = "string")
        public Object assertAttributeNotContainsOnly(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            Object haystackAttributeName = assignParameter(args, 1, false);
            Object haystackClassOrObject = assignParameter(args, 2, false);
            Object isNativeType = assignParameter(args, 3, true);
            if (null == isNativeType) {
                isNativeType = ZVal.getNull();
            }
            Object message = assignParameter(args, 4, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotContainsOnly")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            type,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            isNativeType,
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedCount", typeHint = "int")
        @ConvertedParameter(index = 1, name = "haystack")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertCount(RuntimeEnv env, Object... args) {
            Object expectedCount = assignParameter(args, 0, false);
            Object haystack = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(haystack, Countable.class, "Countable")))
                    && ZVal.toBool(
                            !NamespaceGlobal.is_iterable.env(env).call(haystack).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "countable or iterable"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(haystack, new Count(env, expectedCount), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedCount", typeHint = "int")
        @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "haystackClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeCount(RuntimeEnv env, Object... args) {
            Object expectedCount = assignParameter(args, 0, false);
            Object haystackAttributeName = assignParameter(args, 1, false);
            Object haystackClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertCount")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expectedCount,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedCount", typeHint = "int")
        @ConvertedParameter(index = 1, name = "haystack")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertNotCount(RuntimeEnv env, Object... args) {
            Object expectedCount = assignParameter(args, 0, false);
            Object haystack = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object constraint = null;
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(haystack, Countable.class, "Countable")))
                    && ZVal.toBool(
                            !NamespaceGlobal.is_iterable.env(env).call(haystack).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "countable or iterable"));
            }

            constraint = new LogicalNot(env, new Count(env, expectedCount));
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(haystack, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedCount", typeHint = "int")
        @ConvertedParameter(index = 1, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "haystackClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeNotCount(RuntimeEnv env, Object... args) {
            Object expectedCount = assignParameter(args, 0, false);
            Object haystackAttributeName = assignParameter(args, 1, false);
            Object haystackClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotCount")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expectedCount,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "delta",
            typeHint = "float",
            defaultValue = "0.0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 4,
            name = "maxDepth",
            typeHint = "int",
            defaultValue = "10",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 5,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertEquals(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object delta = assignParameter(args, 3, true);
            if (null == delta) {
                delta = 0.0;
            }
            Object maxDepth = assignParameter(args, 4, true);
            if (null == maxDepth) {
                maxDepth = 10;
            }
            Object canonicalize = assignParameter(args, 5, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 6, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            Object constraint = null;
            constraint = new IsEqual(env, expected, delta, maxDepth, canonicalize, ignoreCase);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 4,
            name = "delta",
            typeHint = "float",
            defaultValue = "0.0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 5,
            name = "maxDepth",
            typeHint = "int",
            defaultValue = "10",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 6,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 7,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertAttributeEquals(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object delta = assignParameter(args, 4, true);
            if (null == delta) {
                delta = 0.0;
            }
            Object maxDepth = assignParameter(args, 5, true);
            if (null == maxDepth) {
                maxDepth = 10;
            }
            Object canonicalize = assignParameter(args, 6, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 7, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message,
                            delta,
                            maxDepth,
                            canonicalize,
                            ignoreCase)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "delta",
            defaultValue = "0.0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 4,
            name = "maxDepth",
            defaultValue = "10",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 5,
            name = "canonicalize",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 6,
            name = "ignoreCase",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertNotEquals(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object delta = assignParameter(args, 3, true);
            if (null == delta) {
                delta = 0.0;
            }
            Object maxDepth = assignParameter(args, 4, true);
            if (null == maxDepth) {
                maxDepth = 10;
            }
            Object canonicalize = assignParameter(args, 5, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 6, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            Object constraint = null;
            constraint =
                    new LogicalNot(
                            env,
                            new IsEqual(env, expected, delta, maxDepth, canonicalize, ignoreCase));
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, constraint, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 4,
            name = "delta",
            typeHint = "float",
            defaultValue = "0.0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 5,
            name = "maxDepth",
            typeHint = "int",
            defaultValue = "10",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 6,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 7,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertAttributeNotEquals(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object delta = assignParameter(args, 4, true);
            if (null == delta) {
                delta = 0.0;
            }
            Object maxDepth = assignParameter(args, 5, true);
            if (null == maxDepth) {
                maxDepth = 10;
            }
            Object canonicalize = assignParameter(args, 6, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 7, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message,
                            delta,
                            maxDepth,
                            canonicalize,
                            ignoreCase)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertEmpty(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isEmpty")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "haystackClassOrObject")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertAttributeEmpty(RuntimeEnv env, Object... args) {
            Object haystackAttributeName = assignParameter(args, 0, false);
            Object haystackClassOrObject = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEmpty")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNotEmpty(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("logicalNot")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Assert.class)
                                                    .method("isEmpty")
                                                    .call()
                                                    .value())
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "haystackAttributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "haystackClassOrObject")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertAttributeNotEmpty(RuntimeEnv env, Object... args) {
            Object haystackAttributeName = assignParameter(args, 0, false);
            Object haystackClassOrObject = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotEmpty")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(haystackClassOrObject, haystackAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertGreaterThan(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("greaterThan")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(expected)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeGreaterThan(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertGreaterThan")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertGreaterThanOrEqual(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("greaterThanOrEqual")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(expected)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeGreaterThanOrEqual(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertGreaterThanOrEqual")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertLessThan(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("lessThan")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(expected)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeLessThan(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertLessThan")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertLessThanOrEqual(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("lessThanOrEqual")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(expected)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeLessThanOrEqual(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertLessThanOrEqual")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actual", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertFileEquals(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object canonicalize = assignParameter(args, 3, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 4, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            function_file_get_contents.f.env(env).call(expected).value(),
                            function_file_get_contents.f.env(env).call(actual).value(),
                            message,
                            0,
                            10,
                            canonicalize,
                            ignoreCase)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actual", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertFileNotEquals(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object canonicalize = assignParameter(args, 3, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 4, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            function_file_get_contents.f.env(env).call(expected).value(),
                            function_file_get_contents.f.env(env).call(actual).value(),
                            message,
                            0,
                            10,
                            canonicalize,
                            ignoreCase)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualString", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertStringEqualsFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualString = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object canonicalize = assignParameter(args, 3, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 4, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedFile, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            function_file_get_contents.f.env(env).call(expectedFile).value(),
                            actualString,
                            message,
                            0,
                            10,
                            canonicalize,
                            ignoreCase)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualString", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object assertStringNotEqualsFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualString = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object canonicalize = assignParameter(args, 3, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 4, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedFile, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            function_file_get_contents.f.env(env).call(expectedFile).value(),
                            actualString,
                            message,
                            0,
                            10,
                            canonicalize,
                            ignoreCase)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertIsReadable(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(filename, new IsReadable(env), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNotIsReadable(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(filename, new LogicalNot(env, new IsReadable(env)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertIsWritable(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(filename, new IsWritable(env), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNotIsWritable(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(filename, new LogicalNot(env, new IsWritable(env)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertDirectoryExists(RuntimeEnv env, Object... args) {
            Object directory = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(directory, new DirectoryExists(env), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertDirectoryNotExists(RuntimeEnv env, Object... args) {
            Object directory = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(directory, new LogicalNot(env, new DirectoryExists(env)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertDirectoryIsReadable(RuntimeEnv env, Object... args) {
            Object directory = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertDirectoryExists(env, directory, message);
            runtimeStaticObject.assertIsReadable(env, directory, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertDirectoryNotIsReadable(RuntimeEnv env, Object... args) {
            Object directory = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertDirectoryExists(env, directory, message);
            runtimeStaticObject.assertNotIsReadable(env, directory, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertDirectoryIsWritable(RuntimeEnv env, Object... args) {
            Object directory = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertDirectoryExists(env, directory, message);
            runtimeStaticObject.assertIsWritable(env, directory, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertDirectoryNotIsWritable(RuntimeEnv env, Object... args) {
            Object directory = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertDirectoryExists(env, directory, message);
            runtimeStaticObject.assertNotIsWritable(env, directory, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFileExists(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(filename, new FileExists(env), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFileNotExists(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(filename, new LogicalNot(env, new FileExists(env)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFileIsReadable(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertFileExists(env, file, message);
            runtimeStaticObject.assertIsReadable(env, file, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFileNotIsReadable(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertFileExists(env, file, message);
            runtimeStaticObject.assertNotIsReadable(env, file, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFileIsWritable(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertFileExists(env, file, message);
            runtimeStaticObject.assertIsWritable(env, file, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFileNotIsWritable(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            runtimeStaticObject.assertFileExists(env, file, message);
            runtimeStaticObject.assertNotIsWritable(env, file, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "condition")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertTrue(RuntimeEnv env, Object... args) {
            Object condition = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            condition,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isTrue")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "condition")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNotTrue(RuntimeEnv env, Object... args) {
            Object condition = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            condition,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("logicalNot")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Assert.class)
                                                    .method("isTrue")
                                                    .call()
                                                    .value())
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "condition")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFalse(RuntimeEnv env, Object... args) {
            Object condition = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            condition,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isFalse")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "condition")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNotFalse(RuntimeEnv env, Object... args) {
            Object condition = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            condition,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("logicalNot")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Assert.class)
                                                    .method("isFalse")
                                                    .call()
                                                    .value())
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNull(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isNull")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNotNull(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("logicalNot")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Assert.class)
                                                    .method("isNull")
                                                    .call()
                                                    .value())
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertFinite(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isFinite")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertInfinite(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isInfinite")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertNan(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actual,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isNan")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "className", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertClassHasAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            Object className = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "valid attribute name"));
            }

            if (!function_class_exists.f.env(env).call(className).getBool()) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "class name", className));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(className, new ClassHasAttribute(env, attributeName), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "className", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertClassNotHasAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            Object className = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "valid attribute name"));
            }

            if (!function_class_exists.f.env(env).call(className).getBool()) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "class name", className));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            className,
                            new LogicalNot(env, new ClassHasAttribute(env, attributeName)),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "className", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertClassHasStaticAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            Object className = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "valid attribute name"));
            }

            if (!function_class_exists.f.env(env).call(className).getBool()) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "class name", className));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(className, new ClassHasStaticAttribute(env, attributeName), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "className", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertClassNotHasStaticAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            Object className = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "valid attribute name"));
            }

            if (!function_class_exists.f.env(env).call(className).getBool()) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "class name", className));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            className,
                            new LogicalNot(env, new ClassHasStaticAttribute(env, attributeName)),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "object")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertObjectHasAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            Object _object = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "valid attribute name"));
            }

            if (!function_is_object.f.env(env).call(_object).getBool()) {
                throw ZVal.getException(
                        env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 2, "object"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(_object, new ObjectHasAttribute(env, attributeName), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "object")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertObjectNotHasAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            Object _object = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "valid attribute name"));
            }

            if (!function_is_object.f.env(env).call(_object).getBool()) {
                throw ZVal.getException(
                        env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 2, "object"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            _object,
                            new LogicalNot(env, new ObjectHasAttribute(env, attributeName)),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertSame(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.toBool(function_is_bool.f.env(env).call(expected).value())
                    && ZVal.toBool(function_is_bool.f.env(env).call(actual).value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("assertEquals")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(expected, actual, message)
                        .value();
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new IsIdentical(env, expected), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeSame(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertSame")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertNotSame(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.toBool(function_is_bool.f.env(env).call(expected).value())
                    && ZVal.toBool(function_is_bool.f.env(env).call(actual).value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("assertNotEquals")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(expected, actual, message)
                        .value();
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new LogicalNot(env, new IsIdentical(env, expected)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actualAttributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "actualClassOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeNotSame(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actualAttributeName = assignParameter(args, 1, false);
            Object actualClassOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotSame")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(actualClassOrObject, actualAttributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertInstanceOf(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.toBool(!function_class_exists.f.env(env).call(expected).getBool())
                    && ZVal.toBool(
                            !NamespaceGlobal.interface_exists.env(env).call(expected).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "class or interface name"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new IsInstanceOf(env, expected), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "classOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeInstanceOf(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            Object classOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertInstanceOf")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(classOrObject, attributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertNotInstanceOf(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.toBool(!function_class_exists.f.env(env).call(expected).getBool())
                    && ZVal.toBool(
                            !NamespaceGlobal.interface_exists.env(env).call(expected).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "class or interface name"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new LogicalNot(env, new IsInstanceOf(env, expected)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "classOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeNotInstanceOf(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            Object classOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotInstanceOf")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(classOrObject, attributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertInternalType(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new IsType(env, expected), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "classOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeInternalType(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            Object classOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertInternalType")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(classOrObject, attributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertNotInternalType(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new LogicalNot(env, new IsType(env, expected)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "classOrObject")
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertAttributeNotInternalType(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            Object classOrObject = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotInternalType")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            expected,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("readAttribute")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(classOrObject, attributeName)
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertRegExp(RuntimeEnv env, Object... args) {
            Object pattern = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(string, new RegularExpression(env, pattern), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertNotRegExp(RuntimeEnv env, Object... args) {
            Object pattern = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(string, new LogicalNot(env, new RegularExpression(env, pattern)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertSameSize(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(expected, Countable.class, "Countable")))
                    && ZVal.toBool(
                            !NamespaceGlobal.is_iterable.env(env).call(expected).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "countable or iterable"));
            }

            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(actual, Countable.class, "Countable")))
                    && ZVal.toBool(!NamespaceGlobal.is_iterable.env(env).call(actual).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "countable or iterable"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new SameSize(env, expected), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertNotSameSize(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(expected, Countable.class, "Countable")))
                    && ZVal.toBool(
                            !NamespaceGlobal.is_iterable.env(env).call(expected).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 1, "countable or iterable"));
            }

            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(actual, Countable.class, "Countable")))
                    && ZVal.toBool(!NamespaceGlobal.is_iterable.env(env).call(actual).getBool())) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "countable or iterable"));
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actual, new LogicalNot(env, new SameSize(env, expected)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "format", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringMatchesFormat(RuntimeEnv env, Object... args) {
            Object format = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(string, new StringMatchesFormatDescription(env, format), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "format", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringNotMatchesFormat(RuntimeEnv env, Object... args) {
            Object format = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            string,
                            new LogicalNot(env, new StringMatchesFormatDescription(env, format)),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "formatFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringMatchesFormatFile(RuntimeEnv env, Object... args) {
            Object formatFile = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(formatFile, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            string,
                            new StringMatchesFormatDescription(
                                    env,
                                    function_file_get_contents.f.env(env).call(formatFile).value()),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "formatFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringNotMatchesFormatFile(RuntimeEnv env, Object... args) {
            Object formatFile = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(formatFile, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            string,
                            new LogicalNot(
                                    env,
                                    new StringMatchesFormatDescription(
                                            env,
                                            function_file_get_contents
                                                    .f
                                                    .env(env)
                                                    .call(formatFile)
                                                    .value())),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "prefix", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringStartsWith(RuntimeEnv env, Object... args) {
            Object prefix = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(string, new StringStartsWith(env, prefix), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "prefix")
        @ConvertedParameter(index = 1, name = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringStartsNotWith(RuntimeEnv env, Object... args) {
            Object prefix = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(string, new LogicalNot(env, new StringStartsWith(env, prefix)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "suffix", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringEndsWith(RuntimeEnv env, Object... args) {
            Object suffix = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(string, new StringEndsWith(env, suffix), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "suffix", typeHint = "string")
        @ConvertedParameter(index = 1, name = "string", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertStringEndsNotWith(RuntimeEnv env, Object... args) {
            Object suffix = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(string, new LogicalNot(env, new StringEndsWith(env, suffix)), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualFile", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertXmlFileEqualsXmlFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualFile = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object actual = null;
            Object expected = null;
            expected = Xml.runtimeStaticObject.loadFile(env, expectedFile);
            actual = Xml.runtimeStaticObject.loadFile(env, actualFile);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, actual, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualFile", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertXmlFileNotEqualsXmlFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualFile = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object actual = null;
            Object expected = null;
            expected = Xml.runtimeStaticObject.loadFile(env, expectedFile);
            actual = Xml.runtimeStaticObject.loadFile(env, actualFile);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, actual, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualXml")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertXmlStringEqualsXmlFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualXml = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object actual = null;
            Object expected = null;
            expected = Xml.runtimeStaticObject.loadFile(env, expectedFile);
            actual = Xml.runtimeStaticObject.load(env, actualXml);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, actual, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualXml")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertXmlStringNotEqualsXmlFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualXml = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object actual = null;
            Object expected = null;
            expected = Xml.runtimeStaticObject.loadFile(env, expectedFile);
            actual = Xml.runtimeStaticObject.load(env, actualXml);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, actual, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedXml")
        @ConvertedParameter(index = 1, name = "actualXml")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertXmlStringEqualsXmlString(RuntimeEnv env, Object... args) {
            Object expectedXml = assignParameter(args, 0, false);
            Object actualXml = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object actual = null;
            Object expected = null;
            expected = Xml.runtimeStaticObject.load(env, expectedXml);
            actual = Xml.runtimeStaticObject.load(env, actualXml);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, actual, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedXml")
        @ConvertedParameter(index = 1, name = "actualXml")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertXmlStringNotEqualsXmlString(RuntimeEnv env, Object... args) {
            Object expectedXml = assignParameter(args, 0, false);
            Object actualXml = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object actual = null;
            Object expected = null;
            expected = Xml.runtimeStaticObject.load(env, expectedXml);
            actual = Xml.runtimeStaticObject.load(env, actualXml);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertNotEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expected, actual, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedElement", typeHint = "DOMElement")
        @ConvertedParameter(index = 1, name = "actualElement", typeHint = "DOMElement")
        @ConvertedParameter(
            index = 2,
            name = "checkAttributes",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 3, name = "message", typeHint = "string")
        public Object assertEqualXMLStructure(RuntimeEnv env, Object... args) {
            Object expectedElement = assignParameter(args, 0, false);
            Object actualElement = assignParameter(args, 1, false);
            Object checkAttributes = assignParameter(args, 2, true);
            if (null == checkAttributes) {
                checkAttributes = false;
            }
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object tmp = null;
            Object expectedAttribute = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object actualAttribute = null;
            tmp = new DOMDocument(env);
            expectedElement =
                    env.callMethod(tmp, "importNode", Assert.class, expectedElement, true);
            tmp = new DOMDocument(env);
            actualElement = env.callMethod(tmp, "importNode", Assert.class, actualElement, true);
            tmp = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            toObjectR(expectedElement)
                                    .accessProp(this, env)
                                    .name("tagName")
                                    .value(),
                            toObjectR(actualElement).accessProp(this, env).name("tagName").value(),
                            message)
                    .value();
            if (ZVal.isTrue(checkAttributes)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("assertEquals")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(expectedElement)
                                        .accessProp(this, env)
                                        .name("attributes")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("length")
                                        .value(),
                                toObjectR(actualElement)
                                        .accessProp(this, env)
                                        .name("attributes")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("length")
                                        .value(),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%s%sNumber of attributes on node \"%s\" does not match",
                                                message,
                                                !ZVal.isEmpty(message) ? "\n" : "",
                                                toObjectR(expectedElement)
                                                        .accessProp(this, env)
                                                        .name("tagName")
                                                        .value())
                                        .value())
                        .value();
                for (i.setObject(0);
                        ZVal.isLessThan(
                                i.getObject(),
                                '<',
                                toObjectR(expectedElement)
                                        .accessProp(this, env)
                                        .name("attributes")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("length")
                                        .value());
                        i.setObject(ZVal.increment(i.getObject()))) {
                    expectedAttribute =
                            env.callMethod(
                                    toObjectR(expectedElement)
                                            .accessProp(this, env)
                                            .name("attributes")
                                            .value(),
                                    "item",
                                    Assert.class,
                                    i.getObject());
                    actualAttribute =
                            env.callMethod(
                                    toObjectR(actualElement)
                                            .accessProp(this, env)
                                            .name("attributes")
                                            .value(),
                                    "getNamedItem",
                                    Assert.class,
                                    toObjectR(expectedAttribute)
                                            .accessProp(this, env)
                                            .name("name")
                                            .value());
                    if (!ZVal.isTrue(actualAttribute)) {
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                .method("fail")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s%sCould not find attribute \"%s\" on node \"%s\"",
                                                        message,
                                                        !ZVal.isEmpty(message) ? "\n" : "",
                                                        toObjectR(expectedAttribute)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value(),
                                                        toObjectR(expectedElement)
                                                                .accessProp(this, env)
                                                                .name("tagName")
                                                                .value())
                                                .value())
                                .value();
                    }
                }
            }

            Xml.runtimeStaticObject.removeCharacterDataNodes(env, expectedElement);
            Xml.runtimeStaticObject.removeCharacterDataNodes(env, actualElement);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertEquals")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            toObjectR(expectedElement)
                                    .accessProp(this, env)
                                    .name("childNodes")
                                    .getObject()
                                    .accessProp(this, env)
                                    .name("length")
                                    .value(),
                            toObjectR(actualElement)
                                    .accessProp(this, env)
                                    .name("childNodes")
                                    .getObject()
                                    .accessProp(this, env)
                                    .name("length")
                                    .value(),
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s%sNumber of child nodes of \"%s\" differs",
                                            message,
                                            !ZVal.isEmpty(message) ? "\n" : "",
                                            toObjectR(expectedElement)
                                                    .accessProp(this, env)
                                                    .name("tagName")
                                                    .value())
                                    .value())
                    .value();
            for (i.setObject(0);
                    ZVal.isLessThan(
                            i.getObject(),
                            '<',
                            toObjectR(expectedElement)
                                    .accessProp(this, env)
                                    .name("childNodes")
                                    .getObject()
                                    .accessProp(this, env)
                                    .name("length")
                                    .value());
                    i.setObject(ZVal.increment(i.getObject()))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("assertEqualXMLStructure")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                env.callMethod(
                                        toObjectR(expectedElement)
                                                .accessProp(this, env)
                                                .name("childNodes")
                                                .value(),
                                        "item",
                                        Assert.class,
                                        i.getObject()),
                                env.callMethod(
                                        toObjectR(actualElement)
                                                .accessProp(this, env)
                                                .name("childNodes")
                                                .value(),
                                        "item",
                                        Assert.class,
                                        i.getObject()),
                                checkAttributes,
                                message)
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "constraint",
            typeHint = "PHPUnit\\Framework\\Constraint\\Constraint"
        )
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertThat(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object constraint = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .Assert
                                            .RequestStaticProperties
                                            .class)
                            .count =
                    ZAssignment.add(
                            "+=",
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Framework
                                                    .classes
                                                    .Assert
                                                    .RequestStaticProperties
                                                    .class)
                                    .count,
                            function_count.f.env(env).call(constraint).value());
            env.callMethod(constraint, "evaluate", Assert.class, value, message);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actualJson", typeHint = "string")
        @ConvertedParameter(index = 1, name = "message", typeHint = "string")
        public Object assertJson(RuntimeEnv env, Object... args) {
            Object actualJson = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actualJson,
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                    .method("isJson")
                                    .call()
                                    .value(),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedJson", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualJson", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertJsonStringEqualsJsonString(RuntimeEnv env, Object... args) {
            Object expectedJson = assignParameter(args, 0, false);
            Object actualJson = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, new JsonMatches(env, expectedJson), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedJson")
        @ConvertedParameter(index = 1, name = "actualJson")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertJsonStringNotEqualsJsonString(RuntimeEnv env, Object... args) {
            Object expectedJson = assignParameter(args, 0, false);
            Object actualJson = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actualJson,
                            new LogicalNot(env, new JsonMatches(env, expectedJson)),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualJson", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertJsonStringEqualsJsonFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualJson = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object expectedJson = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedFile, message)
                    .value();
            expectedJson = function_file_get_contents.f.env(env).call(expectedFile).value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, new JsonMatches(env, expectedJson), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualJson", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertJsonStringNotEqualsJsonFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualJson = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object expectedJson = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedFile, message)
                    .value();
            expectedJson = function_file_get_contents.f.env(env).call(expectedFile).value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            actualJson,
                            new LogicalNot(env, new JsonMatches(env, expectedJson)),
                            message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualFile", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertJsonFileEqualsJsonFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualFile = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object expectedJson = null;
            Object actualJson = null;
            Object constraintActual = null;
            Object constraintExpected = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedFile, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualFile, message)
                    .value();
            actualJson = function_file_get_contents.f.env(env).call(actualFile).value();
            expectedJson = function_file_get_contents.f.env(env).call(expectedFile).value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, message)
                    .value();
            constraintExpected = new JsonMatches(env, expectedJson);
            constraintActual = new JsonMatches(env, actualJson);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, constraintActual, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, constraintExpected, message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expectedFile", typeHint = "string")
        @ConvertedParameter(index = 1, name = "actualFile", typeHint = "string")
        @ConvertedParameter(index = 2, name = "message", typeHint = "string")
        public Object assertJsonFileNotEqualsJsonFile(RuntimeEnv env, Object... args) {
            Object expectedFile = assignParameter(args, 0, false);
            Object actualFile = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object expectedJson = null;
            Object actualJson = null;
            Object constraintActual = null;
            Object constraintExpected = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedFile, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertFileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualFile, message)
                    .value();
            actualJson = function_file_get_contents.f.env(env).call(actualFile).value();
            expectedJson = function_file_get_contents.f.env(env).call(expectedFile).value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertJson")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, message)
                    .value();
            constraintExpected = new JsonMatches(env, expectedJson);
            constraintActual = new JsonMatches(env, actualJson);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(expectedJson, new LogicalNot(env, constraintActual), message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("assertThat")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(actualJson, new LogicalNot(env, constraintExpected), message)
                    .value();
            return null;
        }

        @ConvertedMethod
        public Object logicalAnd(RuntimeEnv env, Object... args) {
            Object constraint = null;
            Object constraints = null;
            constraints =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            constraint = new LogicalAnd(env);
            env.callMethod(constraint, "setConstraints", Assert.class, constraints);
            return ZVal.assign(constraint);
        }

        @ConvertedMethod
        public Object logicalOr(RuntimeEnv env, Object... args) {
            Object constraint = null;
            Object constraints = null;
            constraints =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            constraint = new LogicalOr(env);
            env.callMethod(constraint, "setConstraints", Assert.class, constraints);
            return ZVal.assign(constraint);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "constraint",
            typeHint = "PHPUnit\\Framework\\Constraint\\Constraint"
        )
        public Object logicalNot(RuntimeEnv env, Object... args) {
            Object constraint = assignParameter(args, 0, false);
            return ZVal.assign(new LogicalNot(env, constraint));
        }

        @ConvertedMethod
        public Object logicalXor(RuntimeEnv env, Object... args) {
            Object constraint = null;
            Object constraints = null;
            constraints =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            constraint = new LogicalXor(env);
            env.callMethod(constraint, "setConstraints", Assert.class, constraints);
            return ZVal.assign(constraint);
        }

        @ConvertedMethod
        public Object anything(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsAnything(env));
        }

        @ConvertedMethod
        public Object isTrue(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsTrue(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
        public Object callback(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            return ZVal.assign(new Callback(env, callback));
        }

        @ConvertedMethod
        public Object isFalse(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsFalse(env));
        }

        @ConvertedMethod
        public Object isJson(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsJson(env));
        }

        @ConvertedMethod
        public Object isNull(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsNull(env));
        }

        @ConvertedMethod
        public Object isFinite(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsFinite(env));
        }

        @ConvertedMethod
        public Object isInfinite(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsInfinite(env));
        }

        @ConvertedMethod
        public Object isNan(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsNan(env));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "constraint",
            typeHint = "PHPUnit\\Framework\\Constraint\\Constraint"
        )
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        public Object attribute(RuntimeEnv env, Object... args) {
            Object constraint = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            return ZVal.assign(new Attribute(env, constraint, attributeName));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "checkForObjectIdentity",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "checkForNonObjectIdentity",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object contains(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object checkForObjectIdentity = assignParameter(args, 1, true);
            if (null == checkForObjectIdentity) {
                checkForObjectIdentity = true;
            }
            Object checkForNonObjectIdentity = assignParameter(args, 2, true);
            if (null == checkForNonObjectIdentity) {
                checkForNonObjectIdentity = false;
            }
            return ZVal.assign(
                    new TraversableContains(
                            env, value, checkForObjectIdentity, checkForNonObjectIdentity));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        public Object containsOnly(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            return ZVal.assign(new TraversableContainsOnly(env, type));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        public Object containsOnlyInstancesOf(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            return ZVal.assign(new TraversableContainsOnly(env, className, false));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        public Object arrayHasKey(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            return ZVal.assign(new ArrayHasKey(env, key));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "delta",
            typeHint = "float",
            defaultValue = "0.0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "maxDepth",
            typeHint = "int",
            defaultValue = "10",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 3,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object equalTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object delta = assignParameter(args, 1, true);
            if (null == delta) {
                delta = 0.0;
            }
            Object maxDepth = assignParameter(args, 2, true);
            if (null == maxDepth) {
                maxDepth = 10;
            }
            Object canonicalize = assignParameter(args, 3, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 4, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            return ZVal.assign(new IsEqual(env, value, delta, maxDepth, canonicalize, ignoreCase));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        @ConvertedParameter(index = 1, name = "value")
        @ConvertedParameter(
            index = 2,
            name = "delta",
            typeHint = "float",
            defaultValue = "0.0",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 3,
            name = "maxDepth",
            typeHint = "int",
            defaultValue = "10",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 4,
            name = "canonicalize",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 5,
            name = "ignoreCase",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object attributeEqualTo(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            Object value = assignParameter(args, 1, false);
            Object delta = assignParameter(args, 2, true);
            if (null == delta) {
                delta = 0.0;
            }
            Object maxDepth = assignParameter(args, 3, true);
            if (null == maxDepth) {
                maxDepth = 10;
            }
            Object canonicalize = assignParameter(args, 4, true);
            if (null == canonicalize) {
                canonicalize = false;
            }
            Object ignoreCase = assignParameter(args, 5, true);
            if (null == ignoreCase) {
                ignoreCase = false;
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                            .method("attribute")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Assert.class)
                                            .method("equalTo")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(value, delta, maxDepth, canonicalize, ignoreCase)
                                            .value(),
                                    attributeName)
                            .value());
        }

        @ConvertedMethod
        public Object isEmpty(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsEmpty(env));
        }

        @ConvertedMethod
        public Object isWritable(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsWritable(env));
        }

        @ConvertedMethod
        public Object isReadable(RuntimeEnv env, Object... args) {
            return ZVal.assign(new IsReadable(env));
        }

        @ConvertedMethod
        public Object directoryExists(RuntimeEnv env, Object... args) {
            return ZVal.assign(new DirectoryExists(env));
        }

        @ConvertedMethod
        public Object fileExists(RuntimeEnv env, Object... args) {
            return ZVal.assign(new FileExists(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object greaterThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(new GreaterThan(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object greaterThanOrEqual(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                            .method("logicalOr")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(new IsEqual(env, value), new GreaterThan(env, value))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        public Object classHasAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            return ZVal.assign(new ClassHasAttribute(env, attributeName));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        public Object classHasStaticAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            return ZVal.assign(new ClassHasStaticAttribute(env, attributeName));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName")
        public Object objectHasAttribute(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            return ZVal.assign(new ObjectHasAttribute(env, attributeName));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object identicalTo(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(new IsIdentical(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        public Object isInstanceOf(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            return ZVal.assign(new IsInstanceOf(env, className));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        public Object isType(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            return ZVal.assign(new IsType(env, type));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object lessThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(new LessThan(env, value));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object lessThanOrEqual(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                            .method("logicalOr")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(new IsEqual(env, value), new LessThan(env, value))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
        public Object matchesRegularExpression(RuntimeEnv env, Object... args) {
            Object pattern = assignParameter(args, 0, false);
            return ZVal.assign(new RegularExpression(env, pattern));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        public Object matches(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(new StringMatchesFormatDescription(env, string));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "prefix")
        public Object stringStartsWith(RuntimeEnv env, Object... args) {
            Object prefix = assignParameter(args, 0, false);
            return ZVal.assign(new StringStartsWith(env, prefix));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        @ConvertedParameter(
            index = 1,
            name = "case",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object stringContains(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object _pCase = assignParameter(args, 1, true);
            if (null == _pCase) {
                _pCase = true;
            }
            return ZVal.assign(new StringContains(env, string, _pCase));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "suffix", typeHint = "string")
        public Object stringEndsWith(RuntimeEnv env, Object... args) {
            Object suffix = assignParameter(args, 0, false);
            return ZVal.assign(new StringEndsWith(env, suffix));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "count", typeHint = "int")
        public Object countOf(RuntimeEnv env, Object... args) {
            Object count = assignParameter(args, 0, false);
            return ZVal.assign(new Count(env, count));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message", typeHint = "string")
        public Object fail(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, true);
            if (null == message) {
                message = "";
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .Assert
                                            .RequestStaticProperties
                                            .class)
                            .count =
                    ZVal.increment(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Framework
                                                    .classes
                                                    .Assert
                                                    .RequestStaticProperties
                                                    .class)
                                    .count);
            throw ZVal.getException(env, new AssertionFailedError(env, message));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        public Object readAttribute(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "valid attribute name"));
            }

            if (function_is_string.f.env(env).call(classOrObject).getBool()) {
                if (!function_class_exists.f.env(env).call(classOrObject).getBool()) {
                    throw ZVal.getException(
                            env,
                            InvalidArgumentHelper.runtimeStaticObject.factory(
                                    env, 1, "class name"));
                }

                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                .method("getStaticAttribute")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(classOrObject, attributeName)
                                .value());
            }

            if (function_is_object.f.env(env).call(classOrObject).getBool()) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                                .method("getObjectAttribute")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(classOrObject, attributeName)
                                .value());
            }

            throw ZVal.getException(
                    env,
                    InvalidArgumentHelper.runtimeStaticObject.factory(
                            env, 1, "class name or object"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        public Object getStaticAttribute(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            ReferenceContainer attributes = new BasicReferenceContainer(null);
            Object _pClass = null;
            if (!function_class_exists.f.env(env).call(className).getBool()) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "class name"));
            }

            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "valid attribute name"));
            }

            _pClass = new ReflectionClass(env, className);
            while (ZVal.isTrue(_pClass)) {
                attributes.setObject(env.callMethod(_pClass, "getStaticProperties", Assert.class));
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(attributeName, attributes.getObject())
                        .getBool()) {
                    return ZVal.assign(attributes.arrayGet(env, attributeName));
                }

                _pClass = env.callMethod(_pClass, "getParentClass", Assert.class);
            }

            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Attribute \"%s\" not found in class.", attributeName)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(index = 1, name = "attributeName", typeHint = "string")
        public Object getObjectAttribute(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object _object = assignParameter(args, 0, false);
            Object attributeName = assignParameter(args, 1, false);
            Object reflector = null;
            Object e = null;
            Object attribute = null;
            Object value = null;
            if (!function_is_object.f.env(env).call(_object).getBool()) {
                throw ZVal.getException(
                        env, InvalidArgumentHelper.runtimeStaticObject.factory(env, 1, "object"));
            }

            if (!ZVal.isTrue(runtimeStaticObject.isValidAttributeName(env, attributeName))) {
                throw ZVal.getException(
                        env,
                        InvalidArgumentHelper.runtimeStaticObject.factory(
                                env, 2, "valid attribute name"));
            }

            try {
                attribute = new ReflectionProperty(env, _object, attributeName);
            } catch (ConvertedException convertedException123) {
                if (convertedException123.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException123.getObject();
                    reflector = new ReflectionObject(env, _object);
                    runtimeConverterBreakCount = 0;
                    while (ZVal.isTrue(
                            reflector =
                                    env.callMethod(reflector, "getParentClass", Assert.class))) {
                        try {
                            attribute =
                                    env.callMethod(
                                            reflector, "getProperty", Assert.class, attributeName);
                            break;
                        } catch (ConvertedException convertedException124) {
                            if (convertedException124.instanceOf(
                                    ReflectionException.class, "ReflectionException")) {
                                e = convertedException124.getObject();
                            } else {
                                throw convertedException124;
                            }
                        }
                    }

                } else {
                    throw convertedException123;
                }
            }

            if (ZVal.isset(attribute)) {
                if (ZVal.toBool(!ZVal.isTrue(attribute))
                        || ZVal.toBool(env.callMethod(attribute, "isPublic", Assert.class))) {
                    return ZVal.assign(
                            toObjectR(_object).accessProp(this, env).name(attributeName).value());
                }

                env.callMethod(attribute, "setAccessible", Assert.class, true);
                value = env.callMethod(attribute, "getValue", Assert.class, _object);
                env.callMethod(attribute, "setAccessible", Assert.class, false);
                return ZVal.assign(value);
            }

            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Attribute \"%s\" not found in object.", attributeName)
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message", typeHint = "string")
        public Object markTestIncomplete(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, true);
            if (null == message) {
                message = "";
            }
            throw ZVal.getException(env, new IncompleteTestError(env, message));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message", typeHint = "string")
        public Object markTestSkipped(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, true);
            if (null == message) {
                message = "";
            }
            throw ZVal.getException(env, new SkippedTestError(env, message));
        }

        @ConvertedMethod
        public Object getCount(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .Assert
                                            .RequestStaticProperties
                                            .class)
                            .count);
        }

        @ConvertedMethod
        public Object resetCount(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Framework
                                            .classes
                                            .Assert
                                            .RequestStaticProperties
                                            .class)
                            .count =
                    0;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attributeName", typeHint = "string")
        private Object isValidAttributeName(RuntimeEnv env, Object... args) {
            Object attributeName = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_preg_match
                            .f
                            .env(env)
                            .call("/[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*/", attributeName)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object count = 0;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Assert")
                    .setLookup(
                            Assert.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("count")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/Assert.php")
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
