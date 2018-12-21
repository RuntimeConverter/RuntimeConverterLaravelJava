package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Printer;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestListener;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.TestDox.classes.NamePrettifier;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/TestDox/XmlResultPrinter.php

*/

public class XmlResultPrinter extends Printer implements TestListener {

    public Object document = null;

    public Object root = null;

    public Object prettifier = null;

    public Object exception = null;

    public XmlResultPrinter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == XmlResultPrinter.class) {
            this.__construct(env, args);
        }
    }

    public XmlResultPrinter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "out",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, true);
        if (null == out) {
            out = ZVal.getNull();
        }
        this.document = new DOMDocument(env, "1.0", "UTF-8");
        toObjectR(this.document).accessProp(this, env).name("formatOutput").set(true);
        this.root = env.callMethod(this.document, "createElement", XmlResultPrinter.class, "tests");
        env.callMethod(this.document, "appendChild", XmlResultPrinter.class, this.root);
        this.prettifier = new NamePrettifier(env);
        super.__construct(env, out);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "write",
                XmlResultPrinter.class,
                env.callMethod(this.document, "saveXML", XmlResultPrinter.class));
        super.flush(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addError(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        this.exception = t;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "e", typeHint = "PHPUnit\\Framework\\Warning")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addWarning(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(
        index = 1,
        name = "e",
        typeHint = "PHPUnit\\Framework\\AssertionFailedError"
    )
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addFailure(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        this.exception = e;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addIncompleteTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addRiskyTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "t", typeHint = "Throwable")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object addSkippedTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object t = assignParameter(args, 1, false);
        Object time = assignParameter(args, 2, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object startTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object endTestSuite(RuntimeEnv env, Object... args) {
        Object suite = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    public Object startTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        this.exception = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "time", typeHint = "float")
    public Object endTest(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Util/TestDox")
                        .setFile("/vendor/phpunit/phpunit/src/Util/TestDox/XmlResultPrinter.php");
        int runtimeConverterBreakCount;
        Object test = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        Object node = null;
        Object file = null;
        ReferenceContainer inlineAnnotations = new BasicReferenceContainer(null);
        Object groups = null;
        ReferenceContainer step = new BasicReferenceContainer(null);
        Object steps = null;
        Object _pClass = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(test, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            return null;
        }

        groups =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(test, "getGroups", XmlResultPrinter.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "PHPUnit\\Util\\TestDox",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "group")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object group = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                !ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                group,
                                                                                                "===",
                                                                                                "small"))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                group,
                                                                                                "===",
                                                                                                "medium")))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        group, "===", "large")));
                                    }
                                })
                        .value();
        node = env.callMethod(this.document, "createElement", XmlResultPrinter.class, "test");
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "className",
                function_get_class.f.env(env).call(test).value());
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "methodName",
                env.callMethod(test, "getName", XmlResultPrinter.class));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "prettifiedClassName",
                env.callMethod(
                        this.prettifier,
                        "prettifyTestClass",
                        XmlResultPrinter.class,
                        function_get_class.f.env(env).call(test).value()));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "prettifiedMethodName",
                env.callMethod(
                        this.prettifier,
                        "prettifyTestMethod",
                        XmlResultPrinter.class,
                        env.callMethod(test, "getName", XmlResultPrinter.class)));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "status",
                env.callMethod(test, "getStatus", XmlResultPrinter.class));
        env.callMethod(node, "setAttribute", XmlResultPrinter.class, "time", time);
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "size",
                env.callMethod(test, "getSize", XmlResultPrinter.class));
        env.callMethod(
                node,
                "setAttribute",
                XmlResultPrinter.class,
                "groups",
                NamespaceGlobal.implode.env(env).call(",", groups).value());
        inlineAnnotations.setObject(
                Test.runtimeStaticObject.getInlineAnnotations(
                        env,
                        function_get_class.f.env(env).call(test).value(),
                        env.callMethod(test, "getName", XmlResultPrinter.class)));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET, inlineAnnotations, env, "given"))
                                && ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET, inlineAnnotations, env, "when")))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, inlineAnnotations, env, "then"))) {
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "given",
                    inlineAnnotations.arrayGet(env, "given", "value"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "givenStartLine",
                    inlineAnnotations.arrayGet(env, "given", "line"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "when",
                    inlineAnnotations.arrayGet(env, "when", "value"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "whenStartLine",
                    inlineAnnotations.arrayGet(env, "when", "line"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "then",
                    inlineAnnotations.arrayGet(env, "then", "value"));
            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "thenStartLine",
                    inlineAnnotations.arrayGet(env, "then", "line"));
        }

        if (ZVal.strictNotEqualityCheck(this.exception, "!==", ZVal.getNull())) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.exception, Exception.class, "PHPUnit\\Framework\\Exception"))) {
                steps =
                        env.callMethod(
                                this.exception, "getSerializableTrace", XmlResultPrinter.class);

            } else {
                steps = env.callMethod(this.exception, "getTrace", XmlResultPrinter.class);
            }

            _pClass = new ReflectionClass(env, test);
            file = env.callMethod(_pClass, "getFileName", XmlResultPrinter.class);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1329 : ZVal.getIterable(steps, env, true)) {
                step.setObject(ZVal.assign(zpairResult1329.getValue()));
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, step, env, "file"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        step.arrayGet(env, "file"), "===", file))) {
                    env.callMethod(
                            node,
                            "setAttribute",
                            XmlResultPrinter.class,
                            "exceptionLine",
                            step.arrayGet(env, "line"));
                    break;
                }
            }

            env.callMethod(
                    node,
                    "setAttribute",
                    XmlResultPrinter.class,
                    "exceptionMessage",
                    env.callMethod(this.exception, "getMessage", XmlResultPrinter.class));
        }

        env.callMethod(this.root, "appendChild", XmlResultPrinter.class, node);
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Util\\TestDox\\XmlResultPrinter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Printer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\TestDox\\XmlResultPrinter")
                    .setLookup(
                            XmlResultPrinter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoFlush",
                            "document",
                            "exception",
                            "out",
                            "outTarget",
                            "prettifier",
                            "root")
                    .setFilename("vendor/phpunit/phpunit/src/Util/TestDox/XmlResultPrinter.php")
                    .addInterface("PHPUnit\\Framework\\TestListener")
                    .addExtendsClass("PHPUnit\\Util\\Printer")
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
