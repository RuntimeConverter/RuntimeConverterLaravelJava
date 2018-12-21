package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.AbstractNode;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Iterator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/Directory.php

*/

public final class Directory extends AbstractNode implements IteratorAggregate {

    public Object children = ZVal.newArray();

    public Object directories = ZVal.newArray();

    public Object files = ZVal.newArray();

    public Object classes = null;

    public Object traits = null;

    public Object functions = null;

    public Object linesOfCode = null;

    public Object numFiles = -1;

    public Object numExecutableLines = -1;

    public Object numExecutedLines = -1;

    public Object numClasses = -1;

    public Object numTestedClasses = -1;

    public Object numTraits = -1;

    public Object numTestedTraits = -1;

    public Object numMethods = -1;

    public Object numTestedMethods = -1;

    public Object numFunctions = -1;

    public Object numTestedFunctions = -1;

    public Directory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Directory.class) {
            this.__construct(env, args);
        }
    }

    public Directory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numFiles, "===", -1)) {
            this.numFiles = 0;
            for (ZPair zpairResult1020 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1020.getValue());
                this.numFiles =
                        ZAssignment.add(
                                "+=", this.numFiles, function_count.f.env(env).call(child).value());
            }
        }

        return ZVal.assign(this.numFiles);
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new RecursiveIteratorIterator(env, new Iterator(env, this), 1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object addDirectory(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object directory = null;
        directory =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .SebastianBergmann
                        .namespaces
                        .CodeCoverage
                        .namespaces
                        .Node
                        .classes
                        .Directory(env, name, this);
        new ReferenceClassProperty(this, "children", env).arrayAppend(env).set(directory);
        new ReferenceClassProperty(this, "directories", env)
                .arrayAppend(env)
                .set(
                        new ReferenceClassProperty(this, "children", env)
                                .arrayGet(
                                        env,
                                        ZVal.subtract(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(this.children)
                                                        .value(),
                                                1)));
        return ZVal.assign(directory);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "coverageData", typeHint = "array")
    @ConvertedParameter(index = 2, name = "testData", typeHint = "array")
    @ConvertedParameter(index = 3, name = "cacheTokens", typeHint = "bool")
    public Object addFile(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object coverageData = assignParameter(args, 1, false);
        Object testData = assignParameter(args, 2, false);
        Object cacheTokens = assignParameter(args, 3, false);
        Object file = null;
        file = new File(env, name, this, coverageData, testData, cacheTokens);
        new ReferenceClassProperty(this, "children", env).arrayAppend(env).set(file);
        new ReferenceClassProperty(this, "files", env)
                .arrayAppend(env)
                .set(
                        new ReferenceClassProperty(this, "children", env)
                                .arrayGet(
                                        env,
                                        ZVal.subtract(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(this.children)
                                                        .value(),
                                                1)));
        this.numExecutableLines = -1;
        this.numExecutedLines = -1;
        return ZVal.assign(file);
    }

    @ConvertedMethod
    public Object getDirectories(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.directories);
    }

    @ConvertedMethod
    public Object getFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.files);
    }

    @ConvertedMethod
    public Object getChildNodes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.children);
    }

    @ConvertedMethod
    public Object getClasses(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.classes, "===", ZVal.getNull())) {
            this.classes = ZVal.newArray();
            for (ZPair zpairResult1021 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1021.getValue());
                this.classes =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        this.classes,
                                        env.callMethod(child, "getClasses", Directory.class))
                                .value();
            }
        }

        return ZVal.assign(this.classes);
    }

    @ConvertedMethod
    public Object getTraits(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.traits, "===", ZVal.getNull())) {
            this.traits = ZVal.newArray();
            for (ZPair zpairResult1022 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1022.getValue());
                this.traits =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        this.traits,
                                        env.callMethod(child, "getTraits", Directory.class))
                                .value();
            }
        }

        return ZVal.assign(this.traits);
    }

    @ConvertedMethod
    public Object getFunctions(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.functions, "===", ZVal.getNull())) {
            this.functions = ZVal.newArray();
            for (ZPair zpairResult1023 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1023.getValue());
                this.functions =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        this.functions,
                                        env.callMethod(child, "getFunctions", Directory.class))
                                .value();
            }
        }

        return ZVal.assign(this.functions);
    }

    @ConvertedMethod
    public Object getLinesOfCode(RuntimeEnv env, Object... args) {
        ReferenceContainer linesOfCode = new BasicReferenceContainer(null);
        Object child = null;
        if (ZVal.strictEqualityCheck(this.linesOfCode, "===", ZVal.getNull())) {
            this.linesOfCode =
                    ZVal.newArray(new ZPair("loc", 0), new ZPair("cloc", 0), new ZPair("ncloc", 0));
            for (ZPair zpairResult1024 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1024.getValue());
                linesOfCode.setObject(env.callMethod(child, "getLinesOfCode", Directory.class));
                new ReferenceClassProperty(this, "linesOfCode", env)
                        .arrayAccess(env, "loc")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        new ReferenceClassProperty(this, "linesOfCode", env)
                                                .arrayGet(env, "loc"),
                                        linesOfCode.arrayGet(env, "loc")));
                new ReferenceClassProperty(this, "linesOfCode", env)
                        .arrayAccess(env, "cloc")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        new ReferenceClassProperty(this, "linesOfCode", env)
                                                .arrayGet(env, "cloc"),
                                        linesOfCode.arrayGet(env, "cloc")));
                new ReferenceClassProperty(this, "linesOfCode", env)
                        .arrayAccess(env, "ncloc")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        new ReferenceClassProperty(this, "linesOfCode", env)
                                                .arrayGet(env, "ncloc"),
                                        linesOfCode.arrayGet(env, "ncloc")));
            }
        }

        return ZVal.assign(this.linesOfCode);
    }

    @ConvertedMethod
    public Object getNumExecutableLines(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numExecutableLines, "===", -1)) {
            this.numExecutableLines = 0;
            for (ZPair zpairResult1025 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1025.getValue());
                this.numExecutableLines =
                        ZAssignment.add(
                                "+=",
                                this.numExecutableLines,
                                env.callMethod(child, "getNumExecutableLines", Directory.class));
            }
        }

        return ZVal.assign(this.numExecutableLines);
    }

    @ConvertedMethod
    public Object getNumExecutedLines(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numExecutedLines, "===", -1)) {
            this.numExecutedLines = 0;
            for (ZPair zpairResult1026 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1026.getValue());
                this.numExecutedLines =
                        ZAssignment.add(
                                "+=",
                                this.numExecutedLines,
                                env.callMethod(child, "getNumExecutedLines", Directory.class));
            }
        }

        return ZVal.assign(this.numExecutedLines);
    }

    @ConvertedMethod
    public Object getNumClasses(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numClasses, "===", -1)) {
            this.numClasses = 0;
            for (ZPair zpairResult1027 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1027.getValue());
                this.numClasses =
                        ZAssignment.add(
                                "+=",
                                this.numClasses,
                                env.callMethod(child, "getNumClasses", Directory.class));
            }
        }

        return ZVal.assign(this.numClasses);
    }

    @ConvertedMethod
    public Object getNumTestedClasses(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numTestedClasses, "===", -1)) {
            this.numTestedClasses = 0;
            for (ZPair zpairResult1028 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1028.getValue());
                this.numTestedClasses =
                        ZAssignment.add(
                                "+=",
                                this.numTestedClasses,
                                env.callMethod(child, "getNumTestedClasses", Directory.class));
            }
        }

        return ZVal.assign(this.numTestedClasses);
    }

    @ConvertedMethod
    public Object getNumTraits(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numTraits, "===", -1)) {
            this.numTraits = 0;
            for (ZPair zpairResult1029 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1029.getValue());
                this.numTraits =
                        ZAssignment.add(
                                "+=",
                                this.numTraits,
                                env.callMethod(child, "getNumTraits", Directory.class));
            }
        }

        return ZVal.assign(this.numTraits);
    }

    @ConvertedMethod
    public Object getNumTestedTraits(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numTestedTraits, "===", -1)) {
            this.numTestedTraits = 0;
            for (ZPair zpairResult1030 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1030.getValue());
                this.numTestedTraits =
                        ZAssignment.add(
                                "+=",
                                this.numTestedTraits,
                                env.callMethod(child, "getNumTestedTraits", Directory.class));
            }
        }

        return ZVal.assign(this.numTestedTraits);
    }

    @ConvertedMethod
    public Object getNumMethods(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numMethods, "===", -1)) {
            this.numMethods = 0;
            for (ZPair zpairResult1031 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1031.getValue());
                this.numMethods =
                        ZAssignment.add(
                                "+=",
                                this.numMethods,
                                env.callMethod(child, "getNumMethods", Directory.class));
            }
        }

        return ZVal.assign(this.numMethods);
    }

    @ConvertedMethod
    public Object getNumTestedMethods(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numTestedMethods, "===", -1)) {
            this.numTestedMethods = 0;
            for (ZPair zpairResult1032 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1032.getValue());
                this.numTestedMethods =
                        ZAssignment.add(
                                "+=",
                                this.numTestedMethods,
                                env.callMethod(child, "getNumTestedMethods", Directory.class));
            }
        }

        return ZVal.assign(this.numTestedMethods);
    }

    @ConvertedMethod
    public Object getNumFunctions(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numFunctions, "===", -1)) {
            this.numFunctions = 0;
            for (ZPair zpairResult1033 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1033.getValue());
                this.numFunctions =
                        ZAssignment.add(
                                "+=",
                                this.numFunctions,
                                env.callMethod(child, "getNumFunctions", Directory.class));
            }
        }

        return ZVal.assign(this.numFunctions);
    }

    @ConvertedMethod
    public Object getNumTestedFunctions(RuntimeEnv env, Object... args) {
        Object child = null;
        if (ZVal.strictEqualityCheck(this.numTestedFunctions, "===", -1)) {
            this.numTestedFunctions = 0;
            for (ZPair zpairResult1034 : ZVal.getIterable(this.children, env, true)) {
                child = ZVal.assign(zpairResult1034.getValue());
                this.numTestedFunctions =
                        ZAssignment.add(
                                "+=",
                                this.numTestedFunctions,
                                env.callMethod(child, "getNumTestedFunctions", Directory.class));
            }
        }

        return ZVal.assign(this.numTestedFunctions);
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\Directory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractNode.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\Directory")
                    .setLookup(
                            Directory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "children",
                            "classes",
                            "directories",
                            "files",
                            "functions",
                            "id",
                            "linesOfCode",
                            "name",
                            "numClasses",
                            "numExecutableLines",
                            "numExecutedLines",
                            "numFiles",
                            "numFunctions",
                            "numMethods",
                            "numTestedClasses",
                            "numTestedFunctions",
                            "numTestedMethods",
                            "numTestedTraits",
                            "numTraits",
                            "parent",
                            "path",
                            "pathArray",
                            "traits")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/Directory.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Node\\AbstractNode")
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
