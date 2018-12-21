package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Renderer;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/File.php

*/

public final class File extends Renderer {

    public Object htmlSpecialCharsFlags =
            ZVal.toLong(ZVal.toLong(2) | ZVal.toLong(0)) | ZVal.toLong(8);

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    public File(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    @ConvertedParameter(index = 1, name = "file", typeHint = "string")
    public Object render(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        Object template = null;
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "file.html",
                        "{{",
                        "}}");
        env.callMethod(
                template,
                "setVar",
                File.class,
                ZVal.newArray(
                        new ZPair("items", this.renderItems(env, node)),
                        new ZPair("lines", this.renderSource(env, node))));
        env.callMethod(this, "setCommonTemplateVariables", File.class, template, node);
        env.callMethod(template, "renderTo", File.class, file);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    protected Object renderItems(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object template = null;
        Object items = null;
        Object methodItemTemplate = null;
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "file_item.html",
                        "{{",
                        "}}");
        methodItemTemplate =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "method_item.html",
                        "{{",
                        "}}");
        items =
                env.callMethod(
                        this,
                        "renderItemTemplate",
                        File.class,
                        template,
                        ZVal.newArray(
                                new ZPair("name", "Total"),
                                new ZPair(
                                        "numClasses",
                                        env.callMethod(node, "getNumClassesAndTraits", File.class)),
                                new ZPair(
                                        "numTestedClasses",
                                        env.callMethod(
                                                node, "getNumTestedClassesAndTraits", File.class)),
                                new ZPair(
                                        "numMethods",
                                        env.callMethod(
                                                node, "getNumFunctionsAndMethods", File.class)),
                                new ZPair(
                                        "numTestedMethods",
                                        env.callMethod(
                                                node,
                                                "getNumTestedFunctionsAndMethods",
                                                File.class)),
                                new ZPair(
                                        "linesExecutedPercent",
                                        env.callMethod(
                                                node, "getLineExecutedPercent", File.class, false)),
                                new ZPair(
                                        "linesExecutedPercentAsString",
                                        env.callMethod(node, "getLineExecutedPercent", File.class)),
                                new ZPair(
                                        "numExecutedLines",
                                        env.callMethod(node, "getNumExecutedLines", File.class)),
                                new ZPair(
                                        "numExecutableLines",
                                        env.callMethod(node, "getNumExecutableLines", File.class)),
                                new ZPair(
                                        "testedMethodsPercent",
                                        env.callMethod(
                                                node,
                                                "getTestedFunctionsAndMethodsPercent",
                                                File.class,
                                                false)),
                                new ZPair(
                                        "testedMethodsPercentAsString",
                                        env.callMethod(
                                                node,
                                                "getTestedFunctionsAndMethodsPercent",
                                                File.class)),
                                new ZPair(
                                        "testedClassesPercent",
                                        env.callMethod(
                                                node,
                                                "getTestedClassesAndTraitsPercent",
                                                File.class,
                                                false)),
                                new ZPair(
                                        "testedClassesPercentAsString",
                                        env.callMethod(
                                                node,
                                                "getTestedClassesAndTraitsPercent",
                                                File.class)),
                                new ZPair(
                                        "crap",
                                        "<abbr title=\"Change Risk Anti-Patterns (CRAP) Index\">CRAP</abbr>")));
        items =
                toStringR(items, env)
                        + toStringR(
                                this.renderFunctionItems(
                                        env,
                                        env.callMethod(node, "getFunctions", File.class),
                                        methodItemTemplate),
                                env);
        items =
                toStringR(items, env)
                        + toStringR(
                                this.renderTraitOrClassItems(
                                        env,
                                        env.callMethod(node, "getTraits", File.class),
                                        template,
                                        methodItemTemplate),
                                env);
        items =
                toStringR(items, env)
                        + toStringR(
                                this.renderTraitOrClassItems(
                                        env,
                                        env.callMethod(node, "getClasses", File.class),
                                        template,
                                        methodItemTemplate),
                                env);
        return ZVal.assign(items);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items", typeHint = "array")
    @ConvertedParameter(index = 1, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(index = 2, name = "methodItemTemplate", typeHint = "Text_Template")
    protected Object renderTraitOrClassItems(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object template = assignParameter(args, 1, false);
        Object methodItemTemplate = assignParameter(args, 2, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object numTestedClasses = null;
        ReferenceContainer numTestedMethods = new BasicReferenceContainer(null);
        ReferenceContainer numMethods = new BasicReferenceContainer(null);
        Object numClasses = null;
        Object name = null;
        Object linesExecutedPercentAsString = null;
        Object buffer = null;
        buffer = "";
        if (ZVal.isEmpty(items)) {
            return ZVal.assign(buffer);
        }

        for (ZPair zpairResult1090 : ZVal.getIterable(items, env, false)) {
            name = ZVal.assign(zpairResult1090.getKey());
            item.setObject(ZVal.assign(zpairResult1090.getValue()));
            numMethods.setObject(0);
            numTestedMethods.setObject(0);
            for (ZPair zpairResult1091 :
                    ZVal.getIterable(item.arrayGet(env, "methods"), env, true)) {
                method.setObject(ZVal.assign(zpairResult1091.getValue()));
                if (ZVal.isGreaterThan(method.arrayGet(env, "executableLines"), '>', 0)) {
                    numMethods.setObject(ZVal.increment(numMethods.getObject()));
                    if (ZVal.strictEqualityCheck(
                            method.arrayGet(env, "executedLines"),
                            "===",
                            method.arrayGet(env, "executableLines"))) {
                        numTestedMethods.setObject(ZVal.increment(numTestedMethods.getObject()));
                    }
                }
            }

            if (ZVal.isGreaterThan(item.arrayGet(env, "executableLines"), '>', 0)) {
                numClasses = 1;
                numTestedClasses =
                        ZVal.assign(
                                ZVal.equalityCheck(
                                                numTestedMethods.getObject(),
                                                numMethods.getObject())
                                        ? 1
                                        : 0);
                linesExecutedPercentAsString =
                        Util.runtimeStaticObject.percent(
                                env,
                                item.arrayGet(env, "executedLines"),
                                item.arrayGet(env, "executableLines"),
                                true);

            } else {
                numClasses = "n/a";
                numTestedClasses = "n/a";
                linesExecutedPercentAsString = "n/a";
            }

            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "renderItemTemplate",
                                            File.class,
                                            template,
                                            ZVal.newArray(
                                                    new ZPair("name", name),
                                                    new ZPair("numClasses", numClasses),
                                                    new ZPair("numTestedClasses", numTestedClasses),
                                                    new ZPair("numMethods", numMethods.getObject()),
                                                    new ZPair(
                                                            "numTestedMethods",
                                                            numTestedMethods.getObject()),
                                                    new ZPair(
                                                            "linesExecutedPercent",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    item.arrayGet(
                                                                            env, "executedLines"),
                                                                    item.arrayGet(
                                                                            env, "executableLines"),
                                                                    false)),
                                                    new ZPair(
                                                            "linesExecutedPercentAsString",
                                                            linesExecutedPercentAsString),
                                                    new ZPair(
                                                            "numExecutedLines",
                                                            item.arrayGet(env, "executedLines")),
                                                    new ZPair(
                                                            "numExecutableLines",
                                                            item.arrayGet(env, "executableLines")),
                                                    new ZPair(
                                                            "testedMethodsPercent",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    numTestedMethods.getObject(),
                                                                    numMethods.getObject())),
                                                    new ZPair(
                                                            "testedMethodsPercentAsString",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    numTestedMethods.getObject(),
                                                                    numMethods.getObject(),
                                                                    true)),
                                                    new ZPair(
                                                            "testedClassesPercent",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    ZVal.equalityCheck(
                                                                                    numTestedMethods
                                                                                            .getObject(),
                                                                                    numMethods
                                                                                            .getObject())
                                                                            ? 1
                                                                            : 0,
                                                                    1)),
                                                    new ZPair(
                                                            "testedClassesPercentAsString",
                                                            Util.runtimeStaticObject.percent(
                                                                    env,
                                                                    ZVal.equalityCheck(
                                                                                    numTestedMethods
                                                                                            .getObject(),
                                                                                    numMethods
                                                                                            .getObject())
                                                                            ? 1
                                                                            : 0,
                                                                    1,
                                                                    true)),
                                                    new ZPair("crap", item.arrayGet(env, "crap")))),
                                    env);
            for (ZPair zpairResult1092 :
                    ZVal.getIterable(item.arrayGet(env, "methods"), env, true)) {
                method.setObject(ZVal.assign(zpairResult1092.getValue()));
                buffer =
                        toStringR(buffer, env)
                                + toStringR(
                                        this.renderFunctionOrMethodItem(
                                                env,
                                                methodItemTemplate,
                                                method.getObject(),
                                                "&nbsp;"),
                                        env);
            }
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "functions", typeHint = "array")
    @ConvertedParameter(index = 1, name = "template", typeHint = "Text_Template")
    protected Object renderFunctionItems(RuntimeEnv env, Object... args) {
        Object functions = assignParameter(args, 0, false);
        Object template = assignParameter(args, 1, false);
        Object function = null;
        Object buffer = null;
        if (ZVal.isEmpty(functions)) {
            return "";
        }

        buffer = "";
        for (ZPair zpairResult1093 : ZVal.getIterable(functions, env, true)) {
            function = ZVal.assign(zpairResult1093.getValue());
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    this.renderFunctionOrMethodItem(env, template, function), env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(index = 1, name = "item", typeHint = "array")
    @ConvertedParameter(index = 2, name = "indent", typeHint = "string")
    protected Object renderFunctionOrMethodItem(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object indent = assignParameter(args, 2, true);
        if (null == indent) {
            indent = "";
        }
        Object numTestedMethods = null;
        Object ternaryExpressionTemp = null;
        Object numMethods = null;
        numMethods = 0;
        numTestedMethods = 0;
        if (ZVal.isGreaterThan(item.arrayGet(env, "executableLines"), '>', 0)) {
            numMethods = 1;
            if (ZVal.strictEqualityCheck(
                    item.arrayGet(env, "executedLines"),
                    "===",
                    item.arrayGet(env, "executableLines"))) {
                numTestedMethods = 1;
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "renderItemTemplate",
                        File.class,
                        template,
                        ZVal.newArray(
                                new ZPair(
                                        "name",
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s<a href=\"#%d\"><abbr title=\"%s\">%s</abbr></a>",
                                                        indent,
                                                        item.arrayGet(env, "startLine"),
                                                        NamespaceGlobal.htmlspecialchars
                                                                .env(env)
                                                                .call(
                                                                        item.arrayGet(
                                                                                env, "signature"),
                                                                        this.htmlSpecialCharsFlags)
                                                                .value(),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                item.arrayGet(
                                                                                        env,
                                                                                        "functionName"))
                                                                ? ternaryExpressionTemp
                                                                : item.arrayGet(env, "methodName"))
                                                .value()),
                                new ZPair("numMethods", numMethods),
                                new ZPair("numTestedMethods", numTestedMethods),
                                new ZPair(
                                        "linesExecutedPercent",
                                        Util.runtimeStaticObject.percent(
                                                env,
                                                item.arrayGet(env, "executedLines"),
                                                item.arrayGet(env, "executableLines"))),
                                new ZPair(
                                        "linesExecutedPercentAsString",
                                        Util.runtimeStaticObject.percent(
                                                env,
                                                item.arrayGet(env, "executedLines"),
                                                item.arrayGet(env, "executableLines"),
                                                true)),
                                new ZPair("numExecutedLines", item.arrayGet(env, "executedLines")),
                                new ZPair(
                                        "numExecutableLines",
                                        item.arrayGet(env, "executableLines")),
                                new ZPair(
                                        "testedMethodsPercent",
                                        Util.runtimeStaticObject.percent(env, numTestedMethods, 1)),
                                new ZPair(
                                        "testedMethodsPercentAsString",
                                        Util.runtimeStaticObject.percent(
                                                env, numTestedMethods, 1, true)),
                                new ZPair("crap", item.arrayGet(env, "crap")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    protected Object renderSource(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, false);
        ReferenceContainer testData = new BasicReferenceContainer(null);
        Object trClass = null;
        Object test = null;
        Object lineCss = null;
        Object line = null;
        Object testCSS = null;
        Object popover = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object codeLines = null;
        Object numTests = null;
        ReferenceContainer coverageData = new BasicReferenceContainer(null);
        Object popoverTitle = null;
        Object lines = null;
        Object popoverContent = null;
        coverageData.setObject(env.callMethod(node, "getCoverageData", File.class));
        testData.setObject(env.callMethod(node, "getTestData", File.class));
        codeLines = this.loadFile(env, env.callMethod(node, "getPath", File.class));
        lines = "";
        i.setObject(1);
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1094 : ZVal.getIterable(codeLines, env, true)) {
            line = ZVal.assign(zpairResult1094.getValue());
            trClass = "";
            popoverContent = "";
            popoverTitle = "";
            if (function_array_key_exists
                    .f
                    .env(env)
                    .call(i.getObject(), coverageData.getObject())
                    .getBool()) {
                numTests =
                        ZVal.assign(
                                ZVal.isTrue(coverageData.arrayGet(env, i.getObject()))
                                        ? function_count
                                                .f
                                                .env(env)
                                                .call(coverageData.arrayGet(env, i.getObject()))
                                                .value()
                                        : 0);
                if (ZVal.strictEqualityCheck(
                        coverageData.arrayGet(env, i.getObject()), "===", ZVal.getNull())) {
                    trClass = " class=\"warning\"";

                } else if (ZVal.equalityCheck(numTests, 0)) {
                    trClass = " class=\"danger\"";

                } else {
                    lineCss = "covered-by-large-tests";
                    popoverContent = "<ul>";
                    if (ZVal.isGreaterThan(numTests, '>', 1)) {
                        popoverTitle =
                                toStringR(numTests, env)
                                        + " tests cover line "
                                        + toStringR(i.getObject(), env);

                    } else {
                        popoverTitle = "1 test covers line " + toStringR(i.getObject(), env);
                    }

                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult1095 :
                            ZVal.getIterable(
                                    coverageData.arrayGet(env, i.getObject()), env, true)) {
                        test = ZVal.assign(zpairResult1095.getValue());
                        if (ZVal.toBool(ZVal.equalityCheck(lineCss, "covered-by-large-tests"))
                                && ZVal.toBool(
                                        ZVal.equalityCheck(
                                                testData.arrayGet(env, test, "size"), "medium"))) {
                            lineCss = "covered-by-medium-tests";

                        } else if (ZVal.equalityCheck(
                                testData.arrayGet(env, test, "size"), "small")) {
                            lineCss = "covered-by-small-tests";
                        }

                        SwitchEnumType56 switchVariable56 =
                                ZVal.getEnum(
                                        testData.arrayGet(env, test, "status"),
                                        SwitchEnumType56.DEFAULT_CASE,
                                        SwitchEnumType56.INTEGER_0,
                                        0,
                                        SwitchEnumType56.INTEGER_1,
                                        1,
                                        SwitchEnumType56.INTEGER_2,
                                        2,
                                        SwitchEnumType56.INTEGER_3,
                                        3,
                                        SwitchEnumType56.INTEGER_4,
                                        4);
                        switch (switchVariable56) {
                            case INTEGER_0:
                                SwitchEnumType57 switchVariable57 =
                                        ZVal.getEnum(
                                                testData.arrayGet(env, test, "size"),
                                                SwitchEnumType57.DEFAULT_CASE,
                                                SwitchEnumType57.STRING_small,
                                                "small",
                                                SwitchEnumType57.STRING_medium,
                                                "medium");
                                switch (switchVariable57) {
                                    case STRING_small:
                                        testCSS = " class=\"covered-by-small-tests\"";
                                        break;
                                    case STRING_medium:
                                        testCSS = " class=\"covered-by-medium-tests\"";
                                        break;
                                    case DEFAULT_CASE:
                                        testCSS = " class=\"covered-by-large-tests\"";
                                        break;
                                }
                                ;
                                break;
                            case INTEGER_1:
                            case INTEGER_2:
                                testCSS = " class=\"warning\"";
                                break;
                            case INTEGER_3:
                                testCSS = " class=\"danger\"";
                                break;
                            case INTEGER_4:
                                testCSS = " class=\"danger\"";
                                break;
                            case DEFAULT_CASE:
                                testCSS = "";
                        }
                        ;
                        popoverContent =
                                toStringR(popoverContent, env)
                                        + toStringR(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "<li%s>%s</li>",
                                                                testCSS,
                                                                NamespaceGlobal.htmlspecialchars
                                                                        .env(env)
                                                                        .call(
                                                                                test,
                                                                                this
                                                                                        .htmlSpecialCharsFlags)
                                                                        .value())
                                                        .value(),
                                                env);
                    }

                    popoverContent = toStringR(popoverContent, env) + "</ul>";
                    trClass = " class=\"" + toStringR(lineCss, env) + " popin\"";
                }
            }

            popover = "";
            if (!ZVal.isEmpty(popoverTitle)) {
                popover =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        " data-title=\"%s\" data-content=\"%s\" data-placement=\"bottom\" data-html=\"true\"",
                                        popoverTitle,
                                        NamespaceGlobal.htmlspecialchars
                                                .env(env)
                                                .call(popoverContent, this.htmlSpecialCharsFlags)
                                                .value())
                                .value();
            }

            lines =
                    toStringR(lines, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "     <tr%s%s><td><div align=\"right\"><a name=\"%d\"></a><a href=\"#%d\">%d</a></div></td><td class=\"codeLine\">%s</td></tr>"
                                                            + "\n",
                                                    trClass,
                                                    popover,
                                                    i.getObject(),
                                                    i.getObject(),
                                                    i.getObject(),
                                                    line)
                                            .value(),
                                    env);
            i.setObject(ZVal.increment(i.getObject()));
        }

        return ZVal.assign(lines);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object loadFile(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object file = assignParameter(args, 0, false);
        Object jj = null;
        Object line = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object j = null;
        Object stringFlag = null;
        Object token = null;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult136 = null;
        Object colour = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object fileEndsWithNewLine = null;
        Object buffer = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object value = null;
        buffer = function_file_get_contents.f.env(env).call(file).value();
        tokens.setObject(NamespaceGlobal.token_get_all.env(env).call(buffer).value());
        result.setObject(ZVal.arrayFromList(""));
        i.setObject(0);
        stringFlag = false;
        fileEndsWithNewLine =
                ZVal.equalityCheck(function_substr.f.env(env).call(buffer, -1).value(), "\n");
        buffer = null;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1096 : ZVal.getIterable(tokens.getObject(), env, false)) {
            j = ZVal.assign(zpairResult1096.getKey());
            token = ZVal.assign(zpairResult1096.getValue());
            if (function_is_string.f.env(env).call(token).getBool()) {
                if (ZVal.toBool(ZVal.strictEqualityCheck(token, "===", "\""))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        tokens.arrayGet(env, ZVal.subtract(j, 1)), "!==", "\\"))) {
                    result.arrayAccess(env, i.getObject())
                            .set(
                                    toStringR(result.arrayGet(env, i.getObject()), env)
                                            + toStringR(
                                                    function_sprintf
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "<span class=\"string\">%s</span>",
                                                                    NamespaceGlobal.htmlspecialchars
                                                                            .env(env)
                                                                            .call(
                                                                                    token,
                                                                                    this
                                                                                            .htmlSpecialCharsFlags)
                                                                            .value())
                                                            .value(),
                                                    env));
                    stringFlag = !ZVal.isTrue(stringFlag);

                } else {
                    result.arrayAccess(env, i.getObject())
                            .set(
                                    toStringR(result.arrayGet(env, i.getObject()), env)
                                            + toStringR(
                                                    function_sprintf
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "<span class=\"keyword\">%s</span>",
                                                                    NamespaceGlobal.htmlspecialchars
                                                                            .env(env)
                                                                            .call(
                                                                                    token,
                                                                                    this
                                                                                            .htmlSpecialCharsFlags)
                                                                            .value())
                                                            .value(),
                                                    env));
                }

                continue;
            }

            ZVal.list(
                    runtimeTempArrayResult136 = token,
                    (token = listGet(runtimeTempArrayResult136, 0, env)),
                    (value = listGet(runtimeTempArrayResult136, 1, env)));
            value =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    ZVal.arrayFromList("\t", " "),
                                    ZVal.arrayFromList("&nbsp;&nbsp;&nbsp;&nbsp;", "&nbsp;"),
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(value, this.htmlSpecialCharsFlags)
                                            .value())
                            .value();
            if (ZVal.strictEqualityCheck(value, "===", "\n")) {
                result.arrayAccess(env, ZVal.preIncrement(i)).set("");

            } else {
                lines.setObject(function_explode.f.env(env).call("\n", value).value());
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1097 : ZVal.getIterable(lines.getObject(), env, false)) {
                    jj = ZVal.assign(zpairResult1097.getKey());
                    line = ZVal.assign(zpairResult1097.getValue());
                    line = function_trim.f.env(env).call(line).value();
                    if (ZVal.strictNotEqualityCheck(line, "!==", "")) {
                        if (ZVal.isTrue(stringFlag)) {
                            colour = "string";

                        } else {
                            SwitchEnumType58 switchVariable58 =
                                    ZVal.getEnum(
                                            token,
                                            SwitchEnumType58.DEFAULT_CASE,
                                            SwitchEnumType58.DYNAMIC_TYPE_176,
                                            321,
                                            SwitchEnumType58.DYNAMIC_TYPE_177,
                                            377,
                                            SwitchEnumType58.DYNAMIC_TYPE_178,
                                            378,
                                            SwitchEnumType58.DYNAMIC_TYPE_179,
                                            312,
                                            SwitchEnumType58.DYNAMIC_TYPE_180,
                                            368,
                                            SwitchEnumType58.DYNAMIC_TYPE_181,
                                            338,
                                            SwitchEnumType58.DYNAMIC_TYPE_182,
                                            343,
                                            SwitchEnumType58.DYNAMIC_TYPE_183,
                                            369,
                                            SwitchEnumType58.DYNAMIC_TYPE_184,
                                            341,
                                            SwitchEnumType58.DYNAMIC_TYPE_185,
                                            350,
                                            SwitchEnumType58.DYNAMIC_TYPE_186,
                                            361,
                                            SwitchEnumType58.DYNAMIC_TYPE_187,
                                            306,
                                            SwitchEnumType58.DYNAMIC_TYPE_188,
                                            344,
                                            SwitchEnumType58.DYNAMIC_TYPE_189,
                                            342,
                                            SwitchEnumType58.DYNAMIC_TYPE_190,
                                            328,
                                            SwitchEnumType58.DYNAMIC_TYPE_191,
                                            309,
                                            SwitchEnumType58.DYNAMIC_TYPE_192,
                                            308,
                                            SwitchEnumType58.DYNAMIC_TYPE_193,
                                            359,
                                            SwitchEnumType58.DYNAMIC_TYPE_194,
                                            337,
                                            SwitchEnumType58.DYNAMIC_TYPE_195,
                                            333,
                                            SwitchEnumType58.DYNAMIC_TYPE_196,
                                            335,
                                            SwitchEnumType58.DYNAMIC_TYPE_197,
                                            310,
                                            SwitchEnumType58.DYNAMIC_TYPE_198,
                                            340,
                                            SwitchEnumType58.DYNAMIC_TYPE_199,
                                            331,
                                            SwitchEnumType58.DYNAMIC_TYPE_200,
                                            326,
                                            SwitchEnumType58.DYNAMIC_TYPE_201,
                                            364,
                                            SwitchEnumType58.DYNAMIC_TYPE_202,
                                            313,
                                            SwitchEnumType58.DYNAMIC_TYPE_203,
                                            351,
                                            SwitchEnumType58.DYNAMIC_TYPE_204,
                                            334,
                                            SwitchEnumType58.DYNAMIC_TYPE_205,
                                            346,
                                            SwitchEnumType58.DYNAMIC_TYPE_206,
                                            355,
                                            SwitchEnumType58.DYNAMIC_TYPE_207,
                                            327,
                                            SwitchEnumType58.DYNAMIC_TYPE_208,
                                            365,
                                            SwitchEnumType58.DYNAMIC_TYPE_209,
                                            258,
                                            SwitchEnumType58.DYNAMIC_TYPE_210,
                                            259,
                                            SwitchEnumType58.DYNAMIC_TYPE_211,
                                            294,
                                            SwitchEnumType58.DYNAMIC_TYPE_212,
                                            354,
                                            SwitchEnumType58.DYNAMIC_TYPE_213,
                                            363,
                                            SwitchEnumType58.DYNAMIC_TYPE_214,
                                            358,
                                            SwitchEnumType58.DYNAMIC_TYPE_215,
                                            265,
                                            SwitchEnumType58.DYNAMIC_TYPE_216,
                                            263,
                                            SwitchEnumType58.DYNAMIC_TYPE_217,
                                            264,
                                            SwitchEnumType58.DYNAMIC_TYPE_218,
                                            388,
                                            SwitchEnumType58.DYNAMIC_TYPE_219,
                                            305,
                                            SwitchEnumType58.DYNAMIC_TYPE_220,
                                            314,
                                            SwitchEnumType58.DYNAMIC_TYPE_221,
                                            315,
                                            SwitchEnumType58.DYNAMIC_TYPE_222,
                                            316,
                                            SwitchEnumType58.DYNAMIC_TYPE_223,
                                            261,
                                            SwitchEnumType58.DYNAMIC_TYPE_224,
                                            262,
                                            SwitchEnumType58.DYNAMIC_TYPE_225,
                                            348,
                                            SwitchEnumType58.DYNAMIC_TYPE_226,
                                            311,
                                            SwitchEnumType58.DYNAMIC_TYPE_227,
                                            352,
                                            SwitchEnumType58.DYNAMIC_TYPE_228,
                                            362,
                                            SwitchEnumType58.DYNAMIC_TYPE_229,
                                            349,
                                            SwitchEnumType58.DYNAMIC_TYPE_230,
                                            357,
                                            SwitchEnumType58.DYNAMIC_TYPE_231,
                                            353,
                                            SwitchEnumType58.DYNAMIC_TYPE_232,
                                            356,
                                            SwitchEnumType58.DYNAMIC_TYPE_233,
                                            330,
                                            SwitchEnumType58.DYNAMIC_TYPE_234,
                                            267);
                            switch (switchVariable58) {
                                case DYNAMIC_TYPE_176:
                                    colour = "html";
                                    break;
                                case DYNAMIC_TYPE_177:
                                case DYNAMIC_TYPE_178:
                                    colour = "comment";
                                    break;
                                case DYNAMIC_TYPE_179:
                                case DYNAMIC_TYPE_180:
                                case DYNAMIC_TYPE_181:
                                case DYNAMIC_TYPE_182:
                                case DYNAMIC_TYPE_183:
                                case DYNAMIC_TYPE_184:
                                case DYNAMIC_TYPE_185:
                                case DYNAMIC_TYPE_186:
                                case DYNAMIC_TYPE_187:
                                case DYNAMIC_TYPE_188:
                                case DYNAMIC_TYPE_189:
                                case DYNAMIC_TYPE_190:
                                case DYNAMIC_TYPE_191:
                                case DYNAMIC_TYPE_192:
                                case DYNAMIC_TYPE_193:
                                case DYNAMIC_TYPE_194:
                                case DYNAMIC_TYPE_195:
                                case DYNAMIC_TYPE_196:
                                case DYNAMIC_TYPE_197:
                                case DYNAMIC_TYPE_198:
                                case DYNAMIC_TYPE_199:
                                case DYNAMIC_TYPE_200:
                                case DYNAMIC_TYPE_201:
                                case DYNAMIC_TYPE_202:
                                case DYNAMIC_TYPE_203:
                                case DYNAMIC_TYPE_204:
                                case DYNAMIC_TYPE_205:
                                case DYNAMIC_TYPE_206:
                                case DYNAMIC_TYPE_207:
                                case DYNAMIC_TYPE_208:
                                case DYNAMIC_TYPE_209:
                                case DYNAMIC_TYPE_210:
                                case DYNAMIC_TYPE_211:
                                case DYNAMIC_TYPE_212:
                                case DYNAMIC_TYPE_213:
                                case DYNAMIC_TYPE_214:
                                case DYNAMIC_TYPE_215:
                                case DYNAMIC_TYPE_216:
                                case DYNAMIC_TYPE_217:
                                case DYNAMIC_TYPE_218:
                                case DYNAMIC_TYPE_219:
                                case DYNAMIC_TYPE_220:
                                case DYNAMIC_TYPE_221:
                                case DYNAMIC_TYPE_222:
                                case DYNAMIC_TYPE_223:
                                case DYNAMIC_TYPE_224:
                                case DYNAMIC_TYPE_225:
                                case DYNAMIC_TYPE_226:
                                case DYNAMIC_TYPE_227:
                                case DYNAMIC_TYPE_228:
                                case DYNAMIC_TYPE_229:
                                case DYNAMIC_TYPE_230:
                                case DYNAMIC_TYPE_231:
                                case DYNAMIC_TYPE_232:
                                case DYNAMIC_TYPE_233:
                                case DYNAMIC_TYPE_234:
                                    colour = "keyword";
                                    break;
                                case DEFAULT_CASE:
                                    colour = "default";
                            }
                            ;
                        }

                        result.arrayAccess(env, i.getObject())
                                .set(
                                        toStringR(result.arrayGet(env, i.getObject()), env)
                                                + toStringR(
                                                        function_sprintf
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "<span class=\"%s\">%s</span>",
                                                                        colour, line)
                                                                .value(),
                                                        env));
                    }

                    if (arrayActionR(ArrayAction.ISSET, lines, env, ZVal.add(jj, 1))) {
                        result.arrayAccess(env, ZVal.preIncrement(i)).set("");
                    }
                }
            }
        }

        if (ZVal.isTrue(fileEndsWithNewLine)) {
            arrayActionR(
                    ArrayAction.UNSET,
                    result,
                    env,
                    ZVal.subtract(function_count.f.env(env).call(result.getObject()).value(), 1));
        }

        return ZVal.assign(result.getObject());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Html\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Renderer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "date",
                            "generator",
                            "highLowerBound",
                            "htmlSpecialCharsFlags",
                            "lowUpperBound",
                            "templatePath",
                            "version")
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/File.php")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer")
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

    private enum SwitchEnumType56 {
        INTEGER_0,
        INTEGER_1,
        INTEGER_2,
        INTEGER_3,
        INTEGER_4,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType57 {
        STRING_small,
        STRING_medium,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType58 {
        DYNAMIC_TYPE_176,
        DYNAMIC_TYPE_177,
        DYNAMIC_TYPE_178,
        DYNAMIC_TYPE_179,
        DYNAMIC_TYPE_180,
        DYNAMIC_TYPE_181,
        DYNAMIC_TYPE_182,
        DYNAMIC_TYPE_183,
        DYNAMIC_TYPE_184,
        DYNAMIC_TYPE_185,
        DYNAMIC_TYPE_186,
        DYNAMIC_TYPE_187,
        DYNAMIC_TYPE_188,
        DYNAMIC_TYPE_189,
        DYNAMIC_TYPE_190,
        DYNAMIC_TYPE_191,
        DYNAMIC_TYPE_192,
        DYNAMIC_TYPE_193,
        DYNAMIC_TYPE_194,
        DYNAMIC_TYPE_195,
        DYNAMIC_TYPE_196,
        DYNAMIC_TYPE_197,
        DYNAMIC_TYPE_198,
        DYNAMIC_TYPE_199,
        DYNAMIC_TYPE_200,
        DYNAMIC_TYPE_201,
        DYNAMIC_TYPE_202,
        DYNAMIC_TYPE_203,
        DYNAMIC_TYPE_204,
        DYNAMIC_TYPE_205,
        DYNAMIC_TYPE_206,
        DYNAMIC_TYPE_207,
        DYNAMIC_TYPE_208,
        DYNAMIC_TYPE_209,
        DYNAMIC_TYPE_210,
        DYNAMIC_TYPE_211,
        DYNAMIC_TYPE_212,
        DYNAMIC_TYPE_213,
        DYNAMIC_TYPE_214,
        DYNAMIC_TYPE_215,
        DYNAMIC_TYPE_216,
        DYNAMIC_TYPE_217,
        DYNAMIC_TYPE_218,
        DYNAMIC_TYPE_219,
        DYNAMIC_TYPE_220,
        DYNAMIC_TYPE_221,
        DYNAMIC_TYPE_222,
        DYNAMIC_TYPE_223,
        DYNAMIC_TYPE_224,
        DYNAMIC_TYPE_225,
        DYNAMIC_TYPE_226,
        DYNAMIC_TYPE_227,
        DYNAMIC_TYPE_228,
        DYNAMIC_TYPE_229,
        DYNAMIC_TYPE_230,
        DYNAMIC_TYPE_231,
        DYNAMIC_TYPE_232,
        DYNAMIC_TYPE_233,
        DYNAMIC_TYPE_234,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
