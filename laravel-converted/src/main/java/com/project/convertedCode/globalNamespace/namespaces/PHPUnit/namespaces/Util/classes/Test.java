package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Version.classes.VersionConstraintParser;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_parents;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.CodeCoverageException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.OperatingSystem;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Warning;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.InvalidCoversTargetException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Test.php

*/

public final class Test extends RuntimeClassBase {

    public Test(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Test(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_UNKNOWN = -1;

    public static final Object CONST_SMALL = 0;

    public static final Object CONST_MEDIUM = 1;

    public static final Object CONST_LARGE = 2;

    public static final Object CONST_REGEX_DATA_PROVIDER =
            "/@dataProvider\\s+([a-zA-Z0-9._:-\\\\x7f-\\xff]+)/";

    public static final Object CONST_REGEX_TEST_WITH = "/@testWith\\s+/";

    public static final Object CONST_REGEX_EXPECTED_EXCEPTION =
            "(@expectedException\\s+([:.\\w\\\\x7f-\\xff]+)(?:[\\t ]+(\\S*))?(?:[\\t ]+(\\S*))?\\s*$)m";

    public static final Object CONST_REGEX_REQUIRES_VERSION =
            "/@requires\\s+(?P<name>PHP(?:Unit)?)\\s+(?P<operator>[<>=!]{0,2})\\s*(?P<version>[\\d\\.-]+(dev|(RC|alpha|beta)[\\d\\.])?)[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES_VERSION_CONSTRAINT =
            "/@requires\\s+(?P<name>PHP(?:Unit)?)\\s+(?P<constraint>[\\d\\t -.|~^]+)[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES_OS =
            "/@requires\\s+(?P<name>OS(?:FAMILY)?)\\s+(?P<value>.+?)[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES_SETTING =
            "/@requires\\s+(?P<name>setting)\\s+(?P<setting>([^ ]+?))\\s*(?P<value>[\\w\\.-]+[\\w\\.]?)?[ \\t]*\\r?$/m";

    public static final Object CONST_REGEX_REQUIRES =
            "/@requires\\s+(?P<name>function|extension)\\s+(?P<value>([^ ]+?))\\s*(?P<operator>[<>=!]{0,2})\\s*(?P<version>[\\d\\.-]+[\\d\\.]?)?[ \\t]*\\r?$/m";

    public static final Object CONST_class = "PHPUnit\\Util\\Test";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
        public Object describe(RuntimeEnv env, Object... args) {
            Object test = assignParameter(args, 0, false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, function_get_class.f.env(env).call(test).value()),
                                new ZPair(1, env.callMethod(test, "getName", Test.class))));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, ""),
                                new ZPair(1, env.callMethod(test, "toString", Test.class))));
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, ""),
                            new ZPair(1, function_get_class.f.env(env).call(test).value())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
        public Object describeAsString(RuntimeEnv env, Object... args) {
            Object test = assignParameter(args, 0, false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            test, SelfDescribing.class, "PHPUnit\\Framework\\SelfDescribing"))) {
                return ZVal.assign(env.callMethod(test, "toString", Test.class));
            }

            return ZVal.assign(function_get_class.f.env(env).call(test).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getLinesToBeCovered(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object annotations = null;
            annotations =
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName);
            if (ZVal.strictEqualityCheck(
                    runtimeStaticObject.shouldCoversAnnotationBeUsed(env, annotations),
                    "===",
                    false)) {
                return ZVal.assign(false);
            }

            return ZVal.assign(
                    runtimeStaticObject.getLinesToBeCoveredOrUsed(
                            env, className, methodName, "covers"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getLinesToBeUsed(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            return ZVal.assign(
                    runtimeStaticObject.getLinesToBeCoveredOrUsed(
                            env, className, methodName, "uses"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getRequirements(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object reflector = null;
            Object e = null;
            Object docComment = null;
            Object count = null;
            Object name = null;
            Object i = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object versionConstraintParser = null;
            ReferenceContainer requires = new BasicReferenceContainer(null);
            reflector = new ReflectionClass(env, className);
            docComment = env.callMethod(reflector, "getDocComment", Test.class);
            reflector = new ReflectionMethod(env, className, methodName);
            docComment =
                    toStringR(docComment, env)
                            + "\n"
                            + toStringR(
                                    env.callMethod(reflector, "getDocComment", Test.class), env);
            requires.setObject(ZVal.newArray());
            if (ZVal.isTrue(
                    count =
                            function_preg_match_all
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(CONST_REGEX_REQUIRES_OS, docComment, matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1300 :
                        ZVal.getIterable(
                                function_range.f.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult1300.getValue());
                    requires.arrayAccess(env, matches.arrayGet(env, "name", i))
                            .set(matches.arrayGet(env, "value", i));
                }
            }

            if (ZVal.isTrue(
                    count =
                            function_preg_match_all
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(
                                            CONST_REGEX_REQUIRES_VERSION,
                                            docComment,
                                            matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1301 :
                        ZVal.getIterable(
                                function_range.f.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult1301.getValue());
                    requires.arrayAccess(env, matches.arrayGet(env, "name", i))
                            .set(
                                    ZVal.newArray(
                                            new ZPair(
                                                    "version", matches.arrayGet(env, "version", i)),
                                            new ZPair(
                                                    "operator",
                                                    matches.arrayGet(env, "operator", i))));
                }
            }

            if (ZVal.isTrue(
                    count =
                            function_preg_match_all
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(
                                            CONST_REGEX_REQUIRES_VERSION_CONSTRAINT,
                                            docComment,
                                            matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1302 :
                        ZVal.getIterable(
                                function_range.f.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult1302.getValue());
                    if (!arrayActionR(
                            ArrayAction.EMPTY, requires, env, matches.arrayGet(env, "name", i))) {
                        continue;
                    }

                    try {
                        versionConstraintParser = new VersionConstraintParser(env);
                        requires.arrayAccess(
                                        env,
                                        toStringR(matches.arrayGet(env, "name", i), env)
                                                + "_constraint")
                                .set(
                                        ZVal.newArray(
                                                new ZPair(
                                                        "constraint",
                                                        env.callMethod(
                                                                versionConstraintParser,
                                                                "parse",
                                                                Test.class,
                                                                function_trim
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                matches.arrayGet(
                                                                                        env,
                                                                                        "constraint",
                                                                                        i))
                                                                        .value()))));
                    } catch (ConvertedException convertedException168) {
                        if (convertedException168.instanceOf(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PharIo
                                        .namespaces
                                        .Version
                                        .classes
                                        .Exception
                                        .class,
                                "PharIo\\Version\\Exception")) {
                            e = convertedException168.getObject();
                            throw ZVal.getException(
                                    env,
                                    new Warning(
                                            env,
                                            env.callMethod(e, "getMessage", Test.class),
                                            env.callMethod(e, "getCode", Test.class),
                                            e));
                        } else {
                            throw convertedException168;
                        }
                    }
                }
            }

            if (ZVal.isTrue(
                    count =
                            function_preg_match_all
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(
                                            CONST_REGEX_REQUIRES_SETTING,
                                            docComment,
                                            matches.getObject())
                                    .value())) {
                requires.arrayAccess(env, "setting").set(ZVal.newArray());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1303 :
                        ZVal.getIterable(
                                function_range.f.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult1303.getValue());
                    requires.arrayAccess(env, "setting", matches.arrayGet(env, "setting", i))
                            .set(matches.arrayGet(env, "value", i));
                }
            }

            if (ZVal.isTrue(
                    count =
                            function_preg_match_all
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(CONST_REGEX_REQUIRES, docComment, matches.getObject())
                                    .value())) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1304 :
                        ZVal.getIterable(
                                function_range.f.env(env).call(0, ZVal.subtract(count, 1)).value(),
                                env,
                                true)) {
                    i = ZVal.assign(zpairResult1304.getValue());
                    name = toStringR(matches.arrayGet(env, "name", i), env) + "s";
                    if (!arrayActionR(ArrayAction.ISSET, requires, env, name)) {
                        requires.arrayAccess(env, name).set(ZVal.newArray());
                    }

                    requires.arrayAppend(env, name).set(matches.arrayGet(env, "value", i));
                    if (ZVal.toBool(ZVal.strictNotEqualityCheck(name, "!==", "extensions"))
                            || ZVal.toBool(
                                    arrayActionR(ArrayAction.EMPTY, matches, env, "version", i))) {
                        continue;
                    }

                    requires.arrayAccess(
                                    env, "extension_versions", matches.arrayGet(env, "value", i))
                            .set(
                                    ZVal.newArray(
                                            new ZPair(
                                                    "version", matches.arrayGet(env, "version", i)),
                                            new ZPair(
                                                    "operator",
                                                    matches.arrayGet(env, "operator", i))));
                }
            }

            return ZVal.assign(requires.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getMissingRequirements(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object extension = null;
            Object phpunitVersion = null;
            Object version = null;
            ReferenceContainer required = new BasicReferenceContainer(null);
            Object operator = null;
            Object requiredOsPattern = null;
            Object actualVersion = null;
            Object setting = null;
            ReferenceContainer pieces = new BasicReferenceContainer(null);
            Object function = null;
            ReferenceContainer missing = new BasicReferenceContainer(null);
            Object value = null;
            required.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Test.class)
                            .method("getRequirements")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(className, methodName)
                            .value());
            missing.setObject(ZVal.newArray());
            if (!arrayActionR(ArrayAction.EMPTY, required, env, "PHP")) {
                operator =
                        ZVal.assign(
                                arrayActionR(ArrayAction.EMPTY, required, env, "PHP", "operator")
                                        ? ">="
                                        : required.arrayGet(env, "PHP", "operator"));
                if (!NamespaceGlobal.version_compare
                        .env(env)
                        .call("7.2.11-dev", required.arrayGet(env, "PHP", "version"), operator)
                        .getBool()) {
                    missing.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "PHP %s %s is required.",
                                                    operator,
                                                    required.arrayGet(env, "PHP", "version"))
                                            .value());
                }

            } else if (!arrayActionR(ArrayAction.EMPTY, required, env, "PHP_constraint")) {
                version =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PharIo
                                .namespaces
                                .Version
                                .classes
                                .Version(
                                env, runtimeStaticObject.sanitizeVersionNumber(env, "7.2.11-dev"));
                if (!ZVal.isTrue(
                        env.callMethod(
                                required.arrayGet(env, "PHP_constraint", "constraint"),
                                "complies",
                                Test.class,
                                version))) {
                    missing.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "PHP version does not match the required constraint %s.",
                                                    env.callMethod(
                                                            required.arrayGet(
                                                                    env,
                                                                    "PHP_constraint",
                                                                    "constraint"),
                                                            "asString",
                                                            Test.class))
                                            .value());
                }
            }

            if (!arrayActionR(ArrayAction.EMPTY, required, env, "PHPUnit")) {
                phpunitVersion =
                        com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces
                                .Runner.classes.Version.runtimeStaticObject.id(env);
                operator =
                        ZVal.assign(
                                arrayActionR(
                                                ArrayAction.EMPTY,
                                                required,
                                                env,
                                                "PHPUnit",
                                                "operator")
                                        ? ">="
                                        : required.arrayGet(env, "PHPUnit", "operator"));
                if (!NamespaceGlobal.version_compare
                        .env(env)
                        .call(
                                phpunitVersion,
                                required.arrayGet(env, "PHPUnit", "version"),
                                operator)
                        .getBool()) {
                    missing.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "PHPUnit %s %s is required.",
                                                    operator,
                                                    required.arrayGet(env, "PHPUnit", "version"))
                                            .value());
                }

            } else if (!arrayActionR(ArrayAction.EMPTY, required, env, "PHPUnit_constraint")) {
                phpunitVersion =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .PharIo
                                .namespaces
                                .Version
                                .classes
                                .Version(
                                env,
                                runtimeStaticObject.sanitizeVersionNumber(
                                        env,
                                        com.project.convertedCode.globalNamespace.namespaces.PHPUnit
                                                .namespaces.Runner.classes.Version
                                                .runtimeStaticObject.id(env)));
                if (!ZVal.isTrue(
                        env.callMethod(
                                required.arrayGet(env, "PHPUnit_constraint", "constraint"),
                                "complies",
                                Test.class,
                                phpunitVersion))) {
                    missing.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "PHPUnit version does not match the required constraint %s.",
                                                    env.callMethod(
                                                            required.arrayGet(
                                                                    env,
                                                                    "PHPUnit_constraint",
                                                                    "constraint"),
                                                            "asString",
                                                            Test.class))
                                            .value());
                }
            }

            if (ZVal.toBool(!arrayActionR(ArrayAction.EMPTY, required, env, "OSFAMILY"))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    required.arrayGet(env, "OSFAMILY"),
                                    "!==",
                                    env.callMethod(
                                            new OperatingSystem(env), "getFamily", Test.class)))) {
                missing.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Operating system %s is required.",
                                                required.arrayGet(env, "OSFAMILY"))
                                        .value());
            }

            if (!arrayActionR(ArrayAction.EMPTY, required, env, "OS")) {
                requiredOsPattern =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "/%s/i",
                                        NamespaceGlobal.addcslashes
                                                .env(env)
                                                .call(required.arrayGet(env, "OS"), "/")
                                                .value())
                                .value();
                if (!function_preg_match.f.env(env).call(requiredOsPattern, "Linux").getBool()) {
                    missing.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Operating system matching %s is required.",
                                                    requiredOsPattern)
                                            .value());
                }
            }

            if (!arrayActionR(ArrayAction.EMPTY, required, env, "functions")) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1305 :
                        ZVal.getIterable(required.arrayGet(env, "functions"), env, true)) {
                    function = ZVal.assign(zpairResult1305.getValue());
                    pieces.setObject(function_explode.f.env(env).call("::", function).value());
                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            function_count
                                                    .f
                                                    .env(env)
                                                    .call(pieces.getObject())
                                                    .value(),
                                            "===",
                                            2))
                            && ZVal.toBool(
                                    function_method_exists
                                            .f
                                            .env(env)
                                            .call(pieces.arrayGet(env, 0), pieces.arrayGet(env, 1))
                                            .value())) {
                        continue;
                    }

                    if (function_function_exists.f.env(env).call(function).getBool()) {
                        continue;
                    }

                    missing.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("Function %s is required.", function)
                                            .value());
                }
            }

            if (!arrayActionR(ArrayAction.EMPTY, required, env, "setting")) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1306 :
                        ZVal.getIterable(required.arrayGet(env, "setting"), env, false)) {
                    setting = ZVal.assign(zpairResult1306.getKey());
                    value = ZVal.assign(zpairResult1306.getValue());
                    if (ZVal.notEqualityCheck(
                            function_ini_get.f.env(env).call(setting).value(), value)) {
                        missing.arrayAppend(env)
                                .set(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Setting \"%s\" must be \"%s\".",
                                                        setting, value)
                                                .value());
                    }
                }
            }

            if (!arrayActionR(ArrayAction.EMPTY, required, env, "extensions")) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1307 :
                        ZVal.getIterable(required.arrayGet(env, "extensions"), env, true)) {
                    extension = ZVal.assign(zpairResult1307.getValue());
                    if (arrayActionR(
                            ArrayAction.ISSET, required, env, "extension_versions", extension)) {
                        continue;
                    }

                    if (!function_extension_loaded.f.env(env).call(extension).getBool()) {
                        missing.arrayAppend(env)
                                .set(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call("Extension %s is required.", extension)
                                                .value());
                    }
                }
            }

            if (!arrayActionR(ArrayAction.EMPTY, required, env, "extension_versions")) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1308 :
                        ZVal.getIterable(
                                required.arrayGet(env, "extension_versions"), env, false)) {
                    extension = ZVal.assign(zpairResult1308.getKey());
                    required.setObject(ZVal.assign(zpairResult1308.getValue()));
                    actualVersion = NamespaceGlobal.phpversion.env(env).call(extension).value();
                    operator =
                            ZVal.assign(
                                    arrayActionR(ArrayAction.EMPTY, required, env, "operator")
                                            ? ">="
                                            : required.arrayGet(env, "operator"));
                    if (ZVal.toBool(ZVal.strictEqualityCheck(actualVersion, "===", false))
                            || ZVal.toBool(
                                    !NamespaceGlobal.version_compare
                                            .env(env)
                                            .call(
                                                    actualVersion,
                                                    required.arrayGet(env, "version"),
                                                    operator)
                                            .getBool())) {
                        missing.arrayAppend(env)
                                .set(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Extension %s %s %s is required.",
                                                        extension,
                                                        operator,
                                                        required.arrayGet(env, "version"))
                                                .value());
                    }
                }
            }

            return ZVal.assign(missing.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getExpectedException(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object code = null;
            Object messageRegExp = null;
            Object reflector = null;
            Object docComment = null;
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            Object message = null;
            Object _pClass = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            reflector = new ReflectionMethod(env, className, methodName);
            docComment = env.callMethod(reflector, "getDocComment", Test.class);
            docComment = function_substr.f.env(env).call(docComment, 3, -2).value();
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(CONST_REGEX_EXPECTED_EXCEPTION, docComment, matches.getObject())
                    .getBool()) {
                annotations.setObject(
                        runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName));
                _pClass = ZVal.assign(matches.arrayGet(env, 1));
                code = ZVal.getNull();
                message = "";
                messageRegExp = "";
                if (arrayActionR(ArrayAction.ISSET, matches, env, 2)) {
                    message = function_trim.f.env(env).call(matches.arrayGet(env, 2)).value();

                } else if (arrayActionR(
                        ArrayAction.ISSET,
                        annotations,
                        env,
                        "method",
                        "expectedExceptionMessage")) {
                    message =
                            runtimeStaticObject.parseAnnotationContent(
                                    env,
                                    annotations.arrayGet(
                                            env, "method", "expectedExceptionMessage", 0));
                }

                if (arrayActionR(
                        ArrayAction.ISSET,
                        annotations,
                        env,
                        "method",
                        "expectedExceptionMessageRegExp")) {
                    messageRegExp =
                            runtimeStaticObject.parseAnnotationContent(
                                    env,
                                    annotations.arrayGet(
                                            env, "method", "expectedExceptionMessageRegExp", 0));
                }

                if (arrayActionR(ArrayAction.ISSET, matches, env, 3)) {
                    code = ZVal.assign(matches.arrayGet(env, 3));

                } else if (arrayActionR(
                        ArrayAction.ISSET, annotations, env, "method", "expectedExceptionCode")) {
                    code =
                            runtimeStaticObject.parseAnnotationContent(
                                    env,
                                    annotations.arrayGet(
                                            env, "method", "expectedExceptionCode", 0));
                }

                if (function_is_numeric.f.env(env).call(code).getBool()) {
                    code = ZVal.assign(ZVal.toLong(code));

                } else if (ZVal.toBool(function_is_string.f.env(env).call(code).value())
                        && ZVal.toBool(function_defined.f.env(env).call(code).value())) {
                    code =
                            ZVal.assign(
                                    ZVal.toLong(function_constant.f.env(env).call(code).value()));
                }

                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair("class", _pClass),
                                new ZPair("code", code),
                                new ZPair("message", message),
                                new ZPair("message_regex", messageRegExp)));
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getProvidedData(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object data = null;
            Object reflector = null;
            Object docComment = null;
            Object value = null;
            Object key = null;
            reflector = new ReflectionMethod(env, className, methodName);
            docComment = env.callMethod(reflector, "getDocComment", Test.class);
            data =
                    runtimeStaticObject.getDataFromDataProviderAnnotation(
                            env, docComment, className, methodName);
            if (ZVal.strictEqualityCheck(data, "===", ZVal.getNull())) {
                data = runtimeStaticObject.getDataFromTestWithAnnotation(env, docComment);
            }

            if (ZVal.toBool(function_is_array.f.env(env).call(data).value())
                    && ZVal.toBool(ZVal.isEmpty(data))) {
                throw ZVal.getException(env, new SkippedTestError(env));
            }

            if (ZVal.strictNotEqualityCheck(data, "!==", ZVal.getNull())) {
                for (ZPair zpairResult1309 : ZVal.getIterable(data, env, false)) {
                    key = ZVal.assign(zpairResult1309.getKey());
                    value = ZVal.assign(zpairResult1309.getValue());
                    if (!function_is_array.f.env(env).call(value).getBool()) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Data set %s is invalid.",
                                                        function_is_int
                                                                        .f
                                                                        .env(env)
                                                                        .call(key)
                                                                        .getBool()
                                                                ? "#" + toStringR(key, env)
                                                                : "\"" + toStringR(key, env) + "\"")
                                                .value()));
                    }
                }
            }

            return ZVal.assign(data);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docComment", typeHint = "string")
        public Object getDataFromTestWithAnnotation(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object docComment = assignParameter(args, 0, false);
            ReferenceContainer candidateRow = new BasicReferenceContainer(null);
            Object annotationContent = null;
            Object offset = null;
            ReferenceContainer data = new BasicReferenceContainer(null);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object dataSet = null;
            docComment = runtimeStaticObject.cleanUpMultiLineAnnotation(env, docComment);
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(CONST_REGEX_TEST_WITH, docComment, matches.getObject(), 256)
                    .getBool()) {
                offset =
                        ZVal.add(
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(matches.arrayGet(env, 0, 0))
                                        .value(),
                                matches.arrayGet(env, 0, 1));
                annotationContent = function_substr.f.env(env).call(docComment, offset).value();
                data.setObject(ZVal.newArray());
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1310 :
                        ZVal.getIterable(
                                function_explode.f.env(env).call("\n", annotationContent).value(),
                                env,
                                true)) {
                    candidateRow.setObject(ZVal.assign(zpairResult1310.getValue()));
                    candidateRow.setObject(
                            function_trim.f.env(env).call(candidateRow.getObject()).value());
                    if (ZVal.strictNotEqualityCheck(candidateRow.arrayGet(env, 0), "!==", "[")) {
                        break;
                    }

                    dataSet =
                            NamespaceGlobal.json_decode
                                    .env(env)
                                    .call(candidateRow.getObject(), true)
                                    .value();
                    if (ZVal.strictNotEqualityCheck(
                            NamespaceGlobal.json_last_error.env(env).call().value(), "!==", 0)) {
                        throw ZVal.getException(
                                env,
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Framework
                                        .classes
                                        .Exception(
                                        env,
                                        "The data set for the @testWith annotation cannot be parsed: "
                                                + toStringR(
                                                        NamespaceGlobal.json_last_error_msg
                                                                .env(env)
                                                                .call()
                                                                .value(),
                                                        env)));
                    }

                    data.arrayAppend(env).set(dataSet);
                }

                if (!ZVal.isTrue(data.getObject())) {
                    throw ZVal.getException(
                            env,
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Framework
                                    .classes
                                    .Exception(
                                    env,
                                    "The data set for the @testWith annotation cannot be parsed."));
                }

                return ZVal.assign(data.getObject());
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object parseTestMethodAnnotations(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, true);
            if (null == methodName) {
                methodName = "";
            }
            Object traits = null;
            Object cacheKey = null;
            Object method = null;
            Object e = null;
            Object annotations = null;
            Object trait = null;
            Object _pClass = null;
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Util
                                    .classes
                                    .Test
                                    .RequestStaticProperties
                                    .class,
                            "annotationCache"),
                    env,
                    className)) {
                _pClass = new ReflectionClass(env, className);
                traits = env.callMethod(_pClass, "getTraits", Test.class);
                annotations = ZVal.newArray();
                for (ZPair zpairResult1311 : ZVal.getIterable(traits, env, true)) {
                    trait = ZVal.assign(zpairResult1311.getValue());
                    annotations =
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            annotations,
                                            runtimeStaticObject.parseAnnotations(
                                                    env,
                                                    env.callMethod(
                                                            trait, "getDocComment", Test.class)))
                                    .value();
                }

                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Util
                                        .classes
                                        .Test
                                        .RequestStaticProperties
                                        .class,
                                "annotationCache")
                        .arrayAccess(env, className)
                        .set(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                annotations,
                                                runtimeStaticObject.parseAnnotations(
                                                        env,
                                                        env.callMethod(
                                                                _pClass,
                                                                "getDocComment",
                                                                Test.class)))
                                        .value());
            }

            cacheKey = toStringR(className, env) + "::" + toStringR(methodName, env);
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(methodName, "!==", ZVal.getNull()))
                    && ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Test
                                                    .RequestStaticProperties
                                                    .class,
                                            "annotationCache"),
                                    env,
                                    cacheKey))) {
                try {
                    method = new ReflectionMethod(env, className, methodName);
                    annotations =
                            runtimeStaticObject.parseAnnotations(
                                    env, env.callMethod(method, "getDocComment", Test.class));
                } catch (ConvertedException convertedException169) {
                    if (convertedException169.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        e = convertedException169.getObject();
                        annotations = ZVal.newArray();
                    } else {
                        throw convertedException169;
                    }
                }

                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Util
                                        .classes
                                        .Test
                                        .RequestStaticProperties
                                        .class,
                                "annotationCache")
                        .arrayAccess(env, cacheKey)
                        .set(annotations);
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "class",
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .PHPUnit
                                                            .namespaces
                                                            .Util
                                                            .classes
                                                            .Test
                                                            .RequestStaticProperties
                                                            .class,
                                                    "annotationCache")
                                            .arrayGet(env, className)),
                            new ZPair(
                                    "method",
                                    ZVal.strictNotEqualityCheck(methodName, "!==", ZVal.getNull())
                                            ? env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "annotationCache")
                                                    .arrayGet(env, cacheKey)
                                            : ZVal.newArray())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getInlineAnnotations(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object endLine = null;
            Object methodLines = null;
            Object code = null;
            Object method = null;
            Object line = null;
            Object startLine = null;
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            ReferenceContainer lineNumber = new BasicReferenceContainer(null);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            method = new ReflectionMethod(env, className, methodName);
            code =
                    NamespaceGlobal.file
                            .env(env)
                            .call(env.callMethod(method, "getFileName", Test.class))
                            .value();
            lineNumber.setObject(env.callMethod(method, "getStartLine", Test.class));
            startLine = ZVal.subtract(env.callMethod(method, "getStartLine", Test.class), 1);
            endLine = ZVal.subtract(env.callMethod(method, "getEndLine", Test.class), 1);
            methodLines =
                    function_array_slice
                            .f
                            .env(env)
                            .call(code, startLine, ZVal.add(ZVal.subtract(endLine, startLine), 1))
                            .value();
            annotations.setObject(ZVal.newArray());
            for (ZPair zpairResult1312 : ZVal.getIterable(methodLines, env, true)) {
                line = ZVal.assign(zpairResult1312.getValue());
                if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "#/\\*\\*?\\s*@(?P<name>[A-Za-z_-]+)(?:[ \\t]+(?P<value>.*?))?[ \\t]*\\r?\\*/$#m",
                                line,
                                matches.getObject())
                        .getBool()) {
                    annotations
                            .arrayAccess(
                                    env,
                                    NamespaceGlobal.strtolower
                                            .env(env)
                                            .call(matches.arrayGet(env, "name"))
                                            .value())
                            .set(
                                    ZVal.newArray(
                                            new ZPair("line", lineNumber.getObject()),
                                            new ZPair("value", matches.arrayGet(env, "value"))));
                }

                lineNumber.setObject(ZVal.increment(lineNumber.getObject()));
            }

            return ZVal.assign(annotations.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docBlock", typeHint = "string")
        public Object parseAnnotations(RuntimeEnv env, Object... args) {
            Object docBlock = assignParameter(args, 0, false);
            Object numMatches = null;
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            annotations.setObject(ZVal.newArray());
            docBlock = function_substr.f.env(env).call(docBlock, 3, -2).value();
            if (function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/@(?P<name>[A-Za-z_-]+)(?:[ \\t]+(?P<value>.*?))?[ \\t]*\\r?$/m",
                            docBlock,
                            matches.getObject())
                    .getBool()) {
                numMatches = function_count.f.env(env).call(matches.arrayGet(env, 0)).value();
                for (i.setObject(0);
                        ZVal.isLessThan(i.getObject(), '<', numMatches);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    annotations
                            .arrayAppend(env, matches.arrayGet(env, "name", i.getObject()))
                            .set(toStringR(matches.arrayGet(env, "value", i.getObject()), env));
                }
            }

            return ZVal.assign(annotations.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getBackupSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "backupGlobals",
                                    runtimeStaticObject.getBooleanAnnotationSetting(
                                            env, className, methodName, "backupGlobals")),
                            new ZPair(
                                    "backupStaticAttributes",
                                    runtimeStaticObject.getBooleanAnnotationSetting(
                                            env,
                                            className,
                                            methodName,
                                            "backupStaticAttributes"))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getDependencies(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            Object dependencies = null;
            annotations.setObject(
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName));
            dependencies = ZVal.newArray();
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", "depends")) {
                dependencies = ZVal.assign(annotations.arrayGet(env, "class", "depends"));
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "depends")) {
                dependencies =
                        function_array_merge
                                .f
                                .env(env)
                                .call(dependencies, annotations.arrayGet(env, "method", "depends"))
                                .value();
            }

            return ZVal.assign(function_array_unique.f.env(env).call(dependencies).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getErrorHandlerSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            return ZVal.assign(
                    runtimeStaticObject.getBooleanAnnotationSetting(
                            env, className, methodName, "errorHandler"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getGroups(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, true);
            if (null == methodName) {
                methodName = "";
            }
            Object size = null;
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            ReferenceContainer groups = new BasicReferenceContainer(null);
            Object element = null;
            annotations.setObject(
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName));
            groups.setObject(ZVal.newArray());
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "author")) {
                groups.setObject(ZVal.assign(annotations.arrayGet(env, "method", "author")));

            } else if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", "author")) {
                groups.setObject(ZVal.assign(annotations.arrayGet(env, "class", "author")));
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", "group")) {
                groups.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        groups.getObject(),
                                        annotations.arrayGet(env, "class", "group"))
                                .value());
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "group")) {
                groups.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        groups.getObject(),
                                        annotations.arrayGet(env, "method", "group"))
                                .value());
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", "ticket")) {
                groups.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        groups.getObject(),
                                        annotations.arrayGet(env, "class", "ticket"))
                                .value());
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "ticket")) {
                groups.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        groups.getObject(),
                                        annotations.arrayGet(env, "method", "ticket"))
                                .value());
            }

            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1313 :
                    ZVal.getIterable(ZVal.arrayFromList("method", "class"), env, true)) {
                element = ZVal.assign(zpairResult1313.getValue());
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1314 :
                        ZVal.getIterable(
                                ZVal.arrayFromList("small", "medium", "large"), env, true)) {
                    size = ZVal.assign(zpairResult1314.getValue());
                    if (arrayActionR(ArrayAction.ISSET, annotations, env, element, size)) {
                        groups.arrayAppend(env).set(size);
                        runtimeConverterBreakCount = 2;
                        runtimeConverterBreakCount--;
                        break;
                    }
                }
            }

            return ZVal.assign(function_array_unique.f.env(env).call(groups.getObject()).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        public Object getSize(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            ReferenceContainer groups = new BasicReferenceContainer(null);
            groups.setObject(
                    function_array_flip
                            .f
                            .env(env)
                            .call(runtimeStaticObject.getGroups(env, className, methodName))
                            .value());
            if (arrayActionR(ArrayAction.ISSET, groups, env, "large")) {
                return ZVal.assign(CONST_LARGE);
            }

            if (arrayActionR(ArrayAction.ISSET, groups, env, "medium")) {
                return ZVal.assign(CONST_MEDIUM);
            }

            if (arrayActionR(ArrayAction.ISSET, groups, env, "small")) {
                return ZVal.assign(CONST_SMALL);
            }

            return ZVal.assign(CONST_UNKNOWN);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getProcessIsolationSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            annotations.setObject(
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName));
            return ZVal.assign(
                    ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            annotations,
                                            env,
                                            "class",
                                            "runTestsInSeparateProcesses"))
                            || ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            annotations,
                                            env,
                                            "method",
                                            "runInSeparateProcess")));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getClassProcessIsolationSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            annotations.setObject(
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName));
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            annotations,
                            env,
                            "class",
                            "runClassInSeparateProcess"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        public Object getPreserveGlobalStateSettings(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            return ZVal.assign(
                    runtimeStaticObject.getBooleanAnnotationSetting(
                            env, className, methodName, "preserveGlobalState"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        public Object getHookMethods(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object method = null;
            Object e = null;
            Object _pClass = null;
            if (!function_class_exists.f.env(env).call(className, false).getBool()) {
                return ZVal.assign(runtimeStaticObject.emptyHookMethodsArray(env));
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Util
                                    .classes
                                    .Test
                                    .RequestStaticProperties
                                    .class,
                            "hookMethods"),
                    env,
                    className)) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Util
                                        .classes
                                        .Test
                                        .RequestStaticProperties
                                        .class,
                                "hookMethods")
                        .arrayAccess(env, className)
                        .set(runtimeStaticObject.emptyHookMethodsArray(env));
                try {
                    _pClass = new ReflectionClass(env, className);
                    for (ZPair zpairResult1315 :
                            ZVal.getIterable(
                                    env.callMethod(_pClass, "getMethods", Test.class), env, true)) {
                        method = ZVal.assign(zpairResult1315.getValue());
                        if (ZVal.isTrue(runtimeStaticObject.isBeforeClassMethod(env, method))) {
                            function_array_unshift
                                    .f
                                    .env(env)
                                    .call(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "hookMethods")
                                                    .arrayGet(env, className, "beforeClass"),
                                            env.callMethod(method, "getName", Test.class));
                        }

                        if (ZVal.isTrue(runtimeStaticObject.isBeforeMethod(env, method))) {
                            function_array_unshift
                                    .f
                                    .env(env)
                                    .call(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PHPUnit
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Test
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "hookMethods")
                                                    .arrayGet(env, className, "before"),
                                            env.callMethod(method, "getName", Test.class));
                        }

                        if (ZVal.isTrue(runtimeStaticObject.isAfterMethod(env, method))) {
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Test
                                                    .RequestStaticProperties
                                                    .class,
                                            "hookMethods")
                                    .arrayAppend(env, className, "after")
                                    .set(env.callMethod(method, "getName", Test.class));
                        }

                        if (ZVal.isTrue(runtimeStaticObject.isAfterClassMethod(env, method))) {
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .PHPUnit
                                                    .namespaces
                                                    .Util
                                                    .classes
                                                    .Test
                                                    .RequestStaticProperties
                                                    .class,
                                            "hookMethods")
                                    .arrayAppend(env, className, "afterClass")
                                    .set(env.callMethod(method, "getName", Test.class));
                        }
                    }

                } catch (ConvertedException convertedException170) {
                    if (convertedException170.instanceOf(
                            ReflectionException.class, "ReflectionException")) {
                        e = convertedException170.getObject();
                    } else {
                        throw convertedException170;
                    }
                }
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Util
                                            .classes
                                            .Test
                                            .RequestStaticProperties
                                            .class,
                                    "hookMethods")
                            .arrayGet(env, className));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName", typeHint = "string")
        @ConvertedParameter(index = 2, name = "mode", typeHint = "string")
        private Object getLinesToBeCoveredOrUsed(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object mode = assignParameter(args, 2, false);
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            Object codeList = null;
            Object list = null;
            Object classShortcut = null;
            ReferenceContainer element = new BasicReferenceContainer(null);
            annotations.setObject(
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName));
            classShortcut = ZVal.getNull();
            if (!arrayActionR(
                    ArrayAction.EMPTY,
                    annotations,
                    env,
                    "class",
                    toStringR(mode, env) + "DefaultClass")) {
                if (ZVal.isGreaterThan(
                        function_count
                                .f
                                .env(env)
                                .call(
                                        annotations.arrayGet(
                                                env,
                                                "class",
                                                toStringR(mode, env) + "DefaultClass"))
                                .value(),
                        '>',
                        1)) {
                    throw ZVal.getException(
                            env,
                            new CodeCoverageException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "More than one @%sClass annotation in class or interface \"%s\".",
                                                    mode, className)
                                            .value()));
                }

                classShortcut =
                        ZVal.assign(
                                annotations.arrayGet(
                                        env, "class", toStringR(mode, env) + "DefaultClass", 0));
            }

            list = ZVal.newArray();
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", mode)) {
                list = ZVal.assign(annotations.arrayGet(env, "class", mode));
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", mode)) {
                list =
                        function_array_merge
                                .f
                                .env(env)
                                .call(list, annotations.arrayGet(env, "method", mode))
                                .value();
            }

            codeList = ZVal.newArray();
            for (ZPair zpairResult1316 :
                    ZVal.getIterable(
                            function_array_unique.f.env(env).call(list).value(), env, true)) {
                element.setObject(ZVal.assign(zpairResult1316.getValue()));
                if (ZVal.toBool(classShortcut)
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strncmp
                                                .env(env)
                                                .call(element.getObject(), "::", 2)
                                                .value(),
                                        "===",
                                        0))) {
                    element.setObject(
                            toStringR(classShortcut, env) + toStringR(element.getObject(), env));
                }

                element.setObject(
                        function_preg_replace
                                .f
                                .env(env)
                                .call("/[\\s()]+$/", "", element.getObject())
                                .value());
                element.setObject(
                        function_explode.f.env(env).call(" ", element.getObject()).value());
                element.setObject(ZVal.assign(element.arrayGet(env, 0)));
                codeList =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        codeList,
                                        runtimeStaticObject.resolveElementToReflectionObjects(
                                                env, element.getObject()))
                                .value();
            }

            return ZVal.assign(runtimeStaticObject.resolveReflectionObjectsToLines(env, codeList));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message", typeHint = "string")
        private Object parseAnnotationContent(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, false);
            if (ZVal.toBool(function_defined.f.env(env).call(message).value())
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(message, "::")
                                                            .value(),
                                                    "!==",
                                                    false))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    ZVal.add(
                                                            NamespaceGlobal.substr_count
                                                                    .env(env)
                                                                    .call(message, "::")
                                                                    .value(),
                                                            1),
                                                    "===",
                                                    2)))) {
                message = function_constant.f.env(env).call(message).value();
            }

            return ZVal.assign(message);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docComment", typeHint = "string")
        @ConvertedParameter(index = 1, name = "className", typeHint = "string")
        @ConvertedParameter(index = 2, name = "methodName", typeHint = "string")
        private Object getDataFromDataProviderAnnotation(RuntimeEnv env, Object... args) {
            Object docComment = assignParameter(args, 0, false);
            Object className = assignParameter(args, 1, false);
            Object methodName = assignParameter(args, 2, false);
            ReferenceContainer data = new BasicReferenceContainer(null);
            Object match = null;
            Object dataProviderClassName = null;
            Object origData = null;
            Object leaf = null;
            Object dataProviderMethod = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object result = null;
            Object dataProviderClass = null;
            Object dataProviderMethodNameNamespace = null;
            Object dataProviderMethodName = null;
            Object value = null;
            Object key = null;
            Object _object = null;
            if (function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(CONST_REGEX_DATA_PROVIDER, docComment, matches.getObject())
                    .getBool()) {
                result = ZVal.newArray();
                for (ZPair zpairResult1317 :
                        ZVal.getIterable(matches.arrayGet(env, 1), env, true)) {
                    match = ZVal.assign(zpairResult1317.getValue());
                    dataProviderMethodNameNamespace =
                            function_explode.f.env(env).call("\\", match).value();
                    leaf =
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            "::",
                                            function_array_pop
                                                    .f
                                                    .env(env)
                                                    .call(dataProviderMethodNameNamespace)
                                                    .value())
                                    .value();
                    dataProviderMethodName = function_array_pop.f.env(env).call(leaf).value();
                    if (ZVal.isEmpty(dataProviderMethodNameNamespace)) {
                        dataProviderMethodNameNamespace = "";

                    } else {
                        dataProviderMethodNameNamespace =
                                toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\\", dataProviderMethodNameNamespace)
                                                        .value(),
                                                env)
                                        + "\\";
                    }

                    if (ZVal.isEmpty(leaf)) {
                        dataProviderClassName = ZVal.assign(className);

                    } else {
                        dataProviderClassName =
                                toStringR(dataProviderMethodNameNamespace, env)
                                        + toStringR(
                                                function_array_pop.f.env(env).call(leaf).value(),
                                                env);
                    }

                    dataProviderClass = new ReflectionClass(env, dataProviderClassName);
                    dataProviderMethod =
                            env.callMethod(
                                    dataProviderClass,
                                    "getMethod",
                                    Test.class,
                                    dataProviderMethodName);
                    if (ZVal.isTrue(env.callMethod(dataProviderMethod, "isStatic", Test.class))) {
                        _object = ZVal.getNull();

                    } else {
                        _object = env.callMethod(dataProviderClass, "newInstance", Test.class);
                    }

                    if (ZVal.strictEqualityCheck(
                            env.callMethod(dataProviderMethod, "getNumberOfParameters", Test.class),
                            "===",
                            0)) {
                        data.setObject(
                                env.callMethod(dataProviderMethod, "invoke", Test.class, _object));

                    } else {
                        data.setObject(
                                env.callMethod(
                                        dataProviderMethod,
                                        "invoke",
                                        Test.class,
                                        _object,
                                        methodName));
                    }

                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    data.getObject(), Traversable.class, "Traversable"))) {
                        origData = ZVal.assign(data.getObject());
                        data.setObject(ZVal.newArray());
                        for (ZPair zpairResult1318 : ZVal.getIterable(origData, env, false)) {
                            key = ZVal.assign(zpairResult1318.getKey());
                            value = ZVal.assign(zpairResult1318.getValue());
                            if (function_is_int.f.env(env).call(key).getBool()) {
                                data.arrayAppend(env).set(value);

                            } else {
                                data.arrayAccess(env, key).set(value);
                            }
                        }
                    }

                    if (function_is_array.f.env(env).call(data.getObject()).getBool()) {
                        result =
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(result, data.getObject())
                                        .value();
                    }
                }

                return ZVal.assign(result);
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "docComment", typeHint = "string")
        private Object cleanUpMultiLineAnnotation(RuntimeEnv env, Object... args) {
            Object docComment = assignParameter(args, 0, false);
            docComment = function_str_replace.f.env(env).call("\r\n", "\n", docComment).value();
            docComment =
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/" + "\\n" + "\\s*" + "\\*" + "\\s?" + "/", "\n", docComment)
                            .value();
            docComment = function_substr.f.env(env).call(docComment, 0, -1).value();
            return ZVal.assign(function_rtrim.f.env(env).call(docComment, "\n").value());
        }

        @ConvertedMethod
        private Object emptyHookMethodsArray(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("beforeClass", ZVal.arrayFromList("setUpBeforeClass")),
                            new ZPair("before", ZVal.arrayFromList("setUp")),
                            new ZPair("after", ZVal.arrayFromList("tearDown")),
                            new ZPair("afterClass", ZVal.arrayFromList("tearDownAfterClass"))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "className", typeHint = "string")
        @ConvertedParameter(index = 1, name = "methodName")
        @ConvertedParameter(index = 2, name = "settingName", typeHint = "string")
        private Object getBooleanAnnotationSetting(RuntimeEnv env, Object... args) {
            Object className = assignParameter(args, 0, false);
            Object methodName = assignParameter(args, 1, false);
            Object settingName = assignParameter(args, 2, false);
            ReferenceContainer annotations = new BasicReferenceContainer(null);
            annotations.setObject(
                    runtimeStaticObject.parseTestMethodAnnotations(env, className, methodName));
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", settingName)) {
                if (ZVal.strictEqualityCheck(
                        annotations.arrayGet(env, "method", settingName, 0), "===", "enabled")) {
                    return ZVal.assign(true);
                }

                if (ZVal.strictEqualityCheck(
                        annotations.arrayGet(env, "method", settingName, 0), "===", "disabled")) {
                    return ZVal.assign(false);
                }
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", settingName)) {
                if (ZVal.strictEqualityCheck(
                        annotations.arrayGet(env, "class", settingName, 0), "===", "enabled")) {
                    return ZVal.assign(true);
                }

                if (ZVal.strictEqualityCheck(
                        annotations.arrayGet(env, "class", settingName, 0), "===", "disabled")) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "element", typeHint = "string")
        private Object resolveElementToReflectionObjects(RuntimeEnv env, Object... args) {
            Object element = assignParameter(args, 0, false);
            Object inverse = null;
            Object visibility = null;
            Object method = null;
            Object methods = null;
            ReferenceContainer codeToCoverList = new BasicReferenceContainer(null);
            Object classes = null;
            ReferenceContainer methodName = new BasicReferenceContainer(null);
            Object className = null;
            Object runtimeTempArrayResult143 = null;
            Object _pClass = null;
            Object extended = null;
            codeToCoverList.setObject(ZVal.newArray());
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_strpos.f.env(env).call(element, "\\").value(),
                                    "!==",
                                    false))
                    && ZVal.toBool(function_function_exists.f.env(env).call(element).value())) {
                codeToCoverList.arrayAppend(env).set(new ReflectionFunction(env, element));

            } else if (ZVal.strictNotEqualityCheck(
                    function_strpos.f.env(env).call(element, "::").value(), "!==", false)) {
                ZVal.list(
                        runtimeTempArrayResult143 =
                                function_explode.f.env(env).call("::", element).value(),
                        (className = listGet(runtimeTempArrayResult143, 0, env)),
                        (methodName.setObject(listGet(runtimeTempArrayResult143, 1, env))));
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, methodName, env, 0))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        methodName.arrayGet(env, 0), "===", "<"))) {
                    classes = ZVal.newArray(new ZPair(0, className));
                    for (ZPair zpairResult1319 : ZVal.getIterable(classes, env, true)) {
                        className = ZVal.assign(zpairResult1319.getValue());
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        !function_class_exists
                                                                .f
                                                                .env(env)
                                                                .call(className)
                                                                .getBool())
                                                && ZVal.toBool(
                                                        !NamespaceGlobal.interface_exists
                                                                .env(env)
                                                                .call(className)
                                                                .getBool()))
                                && ZVal.toBool(
                                        !NamespaceGlobal.trait_exists
                                                .env(env)
                                                .call(className)
                                                .getBool())) {
                            throw ZVal.getException(
                                    env,
                                    new InvalidCoversTargetException(
                                            env,
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "Trying to @cover or @use not existing class or "
                                                                    + "interface \"%s\".",
                                                            className)
                                                    .value()));
                        }

                        _pClass = new ReflectionClass(env, className);
                        methods = env.callMethod(_pClass, "getMethods", Test.class);
                        inverse =
                                ZVal.toBool(arrayActionR(ArrayAction.ISSET, methodName, env, 1))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        methodName.arrayGet(env, 1), "===", "!"));
                        visibility = "isPublic";
                        if (function_strpos
                                .f
                                .env(env)
                                .call(methodName.getObject(), "protected")
                                .getBool()) {
                            visibility = "isProtected";

                        } else if (function_strpos
                                .f
                                .env(env)
                                .call(methodName.getObject(), "private")
                                .getBool()) {
                            visibility = "isPrivate";
                        }

                        for (ZPair zpairResult1320 : ZVal.getIterable(methods, env, true)) {
                            method = ZVal.assign(zpairResult1320.getValue());
                            if (ZVal.toBool(inverse)
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            method,
                                                            toStringR(visibility, env),
                                                            Test.class)))) {
                                codeToCoverList.arrayAppend(env).set(method);

                            } else if (ZVal.toBool(!ZVal.isTrue(inverse))
                                    && ZVal.toBool(
                                            env.callMethod(
                                                    method,
                                                    toStringR(visibility, env),
                                                    Test.class))) {
                                codeToCoverList.arrayAppend(env).set(method);
                            }
                        }
                    }

                } else {
                    classes = ZVal.newArray(new ZPair(0, className));
                    for (ZPair zpairResult1321 : ZVal.getIterable(classes, env, true)) {
                        className = ZVal.assign(zpairResult1321.getValue());
                        if (ZVal.toBool(ZVal.strictEqualityCheck(className, "===", ""))
                                && ZVal.toBool(
                                        function_function_exists
                                                .f
                                                .env(env)
                                                .call(methodName.getObject())
                                                .value())) {
                            codeToCoverList
                                    .arrayAppend(env)
                                    .set(new ReflectionFunction(env, methodName.getObject()));

                        } else {
                            if (!ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.toBool(
                                                                            function_class_exists
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(className)
                                                                                    .value())
                                                                    || ZVal.toBool(
                                                                            NamespaceGlobal
                                                                                    .interface_exists
                                                                                    .env(env)
                                                                                    .call(className)
                                                                                    .value()))
                                                    || ZVal.toBool(
                                                            NamespaceGlobal.trait_exists
                                                                    .env(env)
                                                                    .call(className)
                                                                    .value()))
                                    && ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(className, methodName.getObject())
                                                    .value())) {
                                throw ZVal.getException(
                                        env,
                                        new InvalidCoversTargetException(
                                                env,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "Trying to @cover or @use not existing method \"%s::%s\".",
                                                                className, methodName.getObject())
                                                        .value()));
                            }

                            codeToCoverList
                                    .arrayAppend(env)
                                    .set(
                                            new ReflectionMethod(
                                                    env, className, methodName.getObject()));
                        }
                    }
                }

            } else {
                extended = false;
                if (ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(element, "<extended>").value(),
                        "!==",
                        false)) {
                    element =
                            function_str_replace.f.env(env).call("<extended>", "", element).value();
                    extended = true;
                }

                classes = ZVal.newArray(new ZPair(0, element));
                if (ZVal.isTrue(extended)) {
                    classes =
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            classes,
                                            function_class_implements
                                                    .f
                                                    .env(env)
                                                    .call(element)
                                                    .value(),
                                            function_class_parents.f.env(env).call(element).value())
                                    .value();
                }

                for (ZPair zpairResult1322 : ZVal.getIterable(classes, env, true)) {
                    className = ZVal.assign(zpairResult1322.getValue());
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    !function_class_exists
                                                            .f
                                                            .env(env)
                                                            .call(className)
                                                            .getBool())
                                            && ZVal.toBool(
                                                    !NamespaceGlobal.interface_exists
                                                            .env(env)
                                                            .call(className)
                                                            .getBool()))
                            && ZVal.toBool(
                                    !NamespaceGlobal.trait_exists
                                            .env(env)
                                            .call(className)
                                            .getBool())) {
                        throw ZVal.getException(
                                env,
                                new InvalidCoversTargetException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Trying to @cover or @use not existing class or "
                                                                + "interface \"%s\".",
                                                        className)
                                                .value()));
                    }

                    codeToCoverList.arrayAppend(env).set(new ReflectionClass(env, className));
                }
            }

            return ZVal.assign(codeToCoverList.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reflectors", typeHint = "array")
        private Object resolveReflectionObjectsToLines(RuntimeEnv env, Object... args) {
            Object reflectors = assignParameter(args, 0, false);
            ReferenceContainer result = new BasicReferenceContainer(null);
            Object lineNumbers = null;
            Object filename = null;
            Object reflector = null;
            result.setObject(ZVal.newArray());
            for (ZPair zpairResult1323 : ZVal.getIterable(reflectors, env, true)) {
                reflector = ZVal.assign(zpairResult1323.getValue());
                filename = env.callMethod(reflector, "getFileName", Test.class);
                if (!arrayActionR(ArrayAction.ISSET, result, env, filename)) {
                    result.arrayAccess(env, filename).set(ZVal.newArray());
                }

                result.arrayAccess(env, filename)
                        .set(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                result.arrayGet(env, filename),
                                                function_range
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        reflector,
                                                                        "getStartLine",
                                                                        Test.class),
                                                                env.callMethod(
                                                                        reflector,
                                                                        "getEndLine",
                                                                        Test.class))
                                                        .value())
                                        .value());
            }

            for (ZPair zpairResult1324 : ZVal.getIterable(result.getObject(), env, false)) {
                filename = ZVal.assign(zpairResult1324.getKey());
                lineNumbers = ZVal.assign(zpairResult1324.getValue());
                result.arrayAccess(env, filename)
                        .set(
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                function_array_flip
                                                        .f
                                                        .env(env)
                                                        .call(lineNumbers)
                                                        .value())
                                        .value());
            }

            return ZVal.assign(result.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isBeforeClassMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(env.callMethod(method, "isStatic", Test.class))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    method,
                                                                    "getDocComment",
                                                                    Test.class),
                                                            "@beforeClass")
                                                    .value(),
                                            "!==",
                                            false)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isBeforeMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.isGreaterThan(
                            function_preg_match
                                    .f
                                    .env(env)
                                    .call(
                                            "/@before\\b/",
                                            env.callMethod(method, "getDocComment", Test.class))
                                    .value(),
                            '>',
                            0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isAfterClassMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.toBool(env.callMethod(method, "isStatic", Test.class))
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    method,
                                                                    "getDocComment",
                                                                    Test.class),
                                                            "@afterClass")
                                                    .value(),
                                            "!==",
                                            false)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method", typeHint = "ReflectionMethod")
        private Object isAfterMethod(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.isGreaterThan(
                            function_preg_match
                                    .f
                                    .env(env)
                                    .call(
                                            "/@after\\b/",
                                            env.callMethod(method, "getDocComment", Test.class))
                                    .value(),
                            '>',
                            0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "version", typeHint = "string")
        private Object sanitizeVersionNumber(RuntimeEnv env, Object... args) {
            Object version = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_preg_replace
                            .f
                            .env(env)
                            .call("/^(\\d+\\.\\d+(?:.\\d+)?).*$/", "$1", version)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "annotations", typeHint = "array")
        private Object shouldCoversAnnotationBeUsed(RuntimeEnv env, Object... args) {
            ReferenceContainer annotations =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "coversNothing")) {
                return ZVal.assign(false);
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "method", "covers")) {
                return ZVal.assign(true);
            }

            if (arrayActionR(ArrayAction.ISSET, annotations, env, "class", "coversNothing")) {
                return ZVal.assign(false);
            }

            return ZVal.assign(true);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object annotationCache = ZVal.newArray();

        public Object hookMethods = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Test")
                    .setLookup(
                            Test.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("annotationCache", "hookMethods")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Test.php")
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
