package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/TableStyle.php

*/

public class TableStyle extends RuntimeClassBase {

    public Object paddingChar = " ";

    public Object horizontalOutsideBorderChar = "-";

    public Object horizontalInsideBorderChar = "-";

    public Object verticalOutsideBorderChar = "|";

    public Object verticalInsideBorderChar = "|";

    public Object crossingChar = "+";

    public Object crossingTopRightChar = "+";

    public Object crossingTopMidChar = "+";

    public Object crossingTopLeftChar = "+";

    public Object crossingMidRightChar = "+";

    public Object crossingBottomRightChar = "+";

    public Object crossingBottomMidChar = "+";

    public Object crossingBottomLeftChar = "+";

    public Object crossingMidLeftChar = "+";

    public Object crossingTopLeftBottomChar = "+";

    public Object crossingTopMidBottomChar = "+";

    public Object crossingTopRightBottomChar = "+";

    public Object cellHeaderFormat = "<info>%s</info>";

    public Object cellRowFormat = "%s";

    public Object cellRowContentFormat = " %s ";

    public Object borderFormat = "%s";

    public Object padType = 1;

    public TableStyle(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TableStyle(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paddingChar")
    public Object setPaddingChar(RuntimeEnv env, Object... args) {
        Object paddingChar = assignParameter(args, 0, false);
        if (!ZVal.isTrue(paddingChar)) {
            throw ZVal.getException(
                    env, new LogicException(env, "The padding char must not be empty"));
        }

        this.paddingChar = paddingChar;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPaddingChar(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.paddingChar);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "outside", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "inside",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setHorizontalBorderChars(RuntimeEnv env, Object... args) {
        Object outside = assignParameter(args, 0, false);
        Object inside = assignParameter(args, 1, true);
        if (null == inside) {
            inside = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.horizontalOutsideBorderChar = outside;
        this.horizontalInsideBorderChar =
                ZVal.isDefined(ternaryExpressionTemp = inside) ? ternaryExpressionTemp : outside;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "horizontalBorderChar")
    public Object setHorizontalBorderChar(RuntimeEnv env, Object... args) {
        Object horizontalBorderChar = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s() is deprecated since Symfony 4.1, use setHorizontalBorderChars() instead.",
                                        "TableStyle::setHorizontalBorderChar")
                                .value(),
                        16384)
                .value();
        return ZVal.assign(
                this.setHorizontalBorderChars(env, horizontalBorderChar, horizontalBorderChar));
    }

    @ConvertedMethod
    public Object getHorizontalBorderChar(RuntimeEnv env, Object... args) {
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s() is deprecated since Symfony 4.1, use getBorderChars() instead.",
                                        "TableStyle::getHorizontalBorderChar")
                                .value(),
                        16384)
                .value();
        return ZVal.assign(this.horizontalOutsideBorderChar);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "outside", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "inside",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setVerticalBorderChars(RuntimeEnv env, Object... args) {
        Object outside = assignParameter(args, 0, false);
        Object inside = assignParameter(args, 1, true);
        if (null == inside) {
            inside = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.verticalOutsideBorderChar = outside;
        this.verticalInsideBorderChar =
                ZVal.isDefined(ternaryExpressionTemp = inside) ? ternaryExpressionTemp : outside;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verticalBorderChar")
    public Object setVerticalBorderChar(RuntimeEnv env, Object... args) {
        Object verticalBorderChar = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s() is deprecated since Symfony 4.1, use setVerticalBorderChars() instead.",
                                        "TableStyle::setVerticalBorderChar")
                                .value(),
                        16384)
                .value();
        return ZVal.assign(
                this.setVerticalBorderChars(env, verticalBorderChar, verticalBorderChar));
    }

    @ConvertedMethod
    public Object getVerticalBorderChar(RuntimeEnv env, Object... args) {
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s() is deprecated since Symfony 4.1, use getBorderChars() instead.",
                                        "TableStyle::getVerticalBorderChar")
                                .value(),
                        16384)
                .value();
        return ZVal.assign(this.verticalOutsideBorderChar);
    }

    @ConvertedMethod
    public Object getBorderChars(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, this.horizontalOutsideBorderChar),
                        new ZPair(1, this.verticalOutsideBorderChar),
                        new ZPair(2, this.horizontalInsideBorderChar),
                        new ZPair(3, this.verticalInsideBorderChar)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cross", typeHint = "string")
    @ConvertedParameter(index = 1, name = "topLeft", typeHint = "string")
    @ConvertedParameter(index = 2, name = "topMid", typeHint = "string")
    @ConvertedParameter(index = 3, name = "topRight", typeHint = "string")
    @ConvertedParameter(index = 4, name = "midRight", typeHint = "string")
    @ConvertedParameter(index = 5, name = "bottomRight", typeHint = "string")
    @ConvertedParameter(index = 6, name = "bottomMid", typeHint = "string")
    @ConvertedParameter(index = 7, name = "bottomLeft", typeHint = "string")
    @ConvertedParameter(index = 8, name = "midLeft", typeHint = "string")
    @ConvertedParameter(
        index = 9,
        name = "topLeftBottom",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 10,
        name = "topMidBottom",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 11,
        name = "topRightBottom",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setCrossingChars(RuntimeEnv env, Object... args) {
        Object cross = assignParameter(args, 0, false);
        Object topLeft = assignParameter(args, 1, false);
        Object topMid = assignParameter(args, 2, false);
        Object topRight = assignParameter(args, 3, false);
        Object midRight = assignParameter(args, 4, false);
        Object bottomRight = assignParameter(args, 5, false);
        Object bottomMid = assignParameter(args, 6, false);
        Object bottomLeft = assignParameter(args, 7, false);
        Object midLeft = assignParameter(args, 8, false);
        Object topLeftBottom = assignParameter(args, 9, true);
        if (null == topLeftBottom) {
            topLeftBottom = ZVal.getNull();
        }
        Object topMidBottom = assignParameter(args, 10, true);
        if (null == topMidBottom) {
            topMidBottom = ZVal.getNull();
        }
        Object topRightBottom = assignParameter(args, 11, true);
        if (null == topRightBottom) {
            topRightBottom = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.crossingChar = cross;
        this.crossingTopLeftChar = topLeft;
        this.crossingTopMidChar = topMid;
        this.crossingTopRightChar = topRight;
        this.crossingMidRightChar = midRight;
        this.crossingBottomRightChar = bottomRight;
        this.crossingBottomMidChar = bottomMid;
        this.crossingBottomLeftChar = bottomLeft;
        this.crossingMidLeftChar = midLeft;
        this.crossingTopLeftBottomChar =
                ZVal.isDefined(ternaryExpressionTemp = topLeftBottom)
                        ? ternaryExpressionTemp
                        : midLeft;
        this.crossingTopMidBottomChar =
                ZVal.isDefined(ternaryExpressionTemp = topMidBottom)
                        ? ternaryExpressionTemp
                        : cross;
        this.crossingTopRightBottomChar =
                ZVal.isDefined(ternaryExpressionTemp = topRightBottom)
                        ? ternaryExpressionTemp
                        : midRight;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "char", typeHint = "string")
    public Object setDefaultCrossingChar(RuntimeEnv env, Object... args) {
        Object _pChar = assignParameter(args, 0, false);
        return ZVal.assign(
                this.setCrossingChars(
                        env, _pChar, _pChar, _pChar, _pChar, _pChar, _pChar, _pChar, _pChar,
                        _pChar));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "crossingChar")
    public Object setCrossingChar(RuntimeEnv env, Object... args) {
        Object crossingChar = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s() is deprecated since Symfony 4.1. Use setDefaultCrossingChar() instead.",
                                        "TableStyle::setCrossingChar")
                                .value(),
                        16384)
                .value();
        return ZVal.assign(this.setDefaultCrossingChar(env, crossingChar));
    }

    @ConvertedMethod
    public Object getCrossingChar(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.crossingChar);
    }

    @ConvertedMethod
    public Object getCrossingChars(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, this.crossingChar),
                        new ZPair(1, this.crossingTopLeftChar),
                        new ZPair(2, this.crossingTopMidChar),
                        new ZPair(3, this.crossingTopRightChar),
                        new ZPair(4, this.crossingMidRightChar),
                        new ZPair(5, this.crossingBottomRightChar),
                        new ZPair(6, this.crossingBottomMidChar),
                        new ZPair(7, this.crossingBottomLeftChar),
                        new ZPair(8, this.crossingMidLeftChar),
                        new ZPair(9, this.crossingTopLeftBottomChar),
                        new ZPair(10, this.crossingTopMidBottomChar),
                        new ZPair(11, this.crossingTopRightBottomChar)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cellHeaderFormat")
    public Object setCellHeaderFormat(RuntimeEnv env, Object... args) {
        Object cellHeaderFormat = assignParameter(args, 0, false);
        this.cellHeaderFormat = cellHeaderFormat;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCellHeaderFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cellHeaderFormat);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cellRowFormat")
    public Object setCellRowFormat(RuntimeEnv env, Object... args) {
        Object cellRowFormat = assignParameter(args, 0, false);
        this.cellRowFormat = cellRowFormat;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCellRowFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cellRowFormat);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cellRowContentFormat")
    public Object setCellRowContentFormat(RuntimeEnv env, Object... args) {
        Object cellRowContentFormat = assignParameter(args, 0, false);
        this.cellRowContentFormat = cellRowContentFormat;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCellRowContentFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cellRowContentFormat);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "borderFormat")
    public Object setBorderFormat(RuntimeEnv env, Object... args) {
        Object borderFormat = assignParameter(args, 0, false);
        this.borderFormat = borderFormat;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getBorderFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.borderFormat);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "padType")
    public Object setPadType(RuntimeEnv env, Object... args) {
        Object padType = assignParameter(args, 0, false);
        if (!function_in_array
                .f
                .env(env)
                .call(
                        padType,
                        ZVal.newArray(new ZPair(0, 0), new ZPair(1, 1), new ZPair(2, 2)),
                        true)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Invalid padding type. Expected one of (STR_PAD_LEFT, STR_PAD_RIGHT, STR_PAD_BOTH)."));
        }

        this.padType = padType;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPadType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.padType);
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\TableStyle";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\TableStyle")
                    .setLookup(
                            TableStyle.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "borderFormat",
                            "cellHeaderFormat",
                            "cellRowContentFormat",
                            "cellRowFormat",
                            "crossingBottomLeftChar",
                            "crossingBottomMidChar",
                            "crossingBottomRightChar",
                            "crossingChar",
                            "crossingMidLeftChar",
                            "crossingMidRightChar",
                            "crossingTopLeftBottomChar",
                            "crossingTopLeftChar",
                            "crossingTopMidBottomChar",
                            "crossingTopMidChar",
                            "crossingTopRightBottomChar",
                            "crossingTopRightChar",
                            "horizontalInsideBorderChar",
                            "horizontalOutsideBorderChar",
                            "padType",
                            "paddingChar",
                            "verticalInsideBorderChar",
                            "verticalOutsideBorderChar")
                    .setFilename("vendor/symfony/console/Helper/TableStyle.php")
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
