package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.TableSeparator;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.TableRows;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.TableCell;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.TableStyle;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleSectionOutput;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace_recursive;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/Table.php

*/

public class Table extends RuntimeClassBase {

    public Object headers = ZVal.newArray();

    public Object rows = ZVal.newArray();

    public Object effectiveColumnWidths = ZVal.newArray();

    public Object numberOfColumns = null;

    public Object output = null;

    public Object style = null;

    public Object columnStyles = ZVal.newArray();

    public Object columnWidths = ZVal.newArray();

    public Object rendered = false;

    public Table(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Table.class) {
            this.__construct(env, args);
        }
    }

    public Table(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        this.output = output;
        if (!ZVal.isTrue(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Console
                                        .namespaces
                                        .Helper
                                        .classes
                                        .Table
                                        .RequestStaticProperties
                                        .class)
                        .styles)) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Console
                                            .namespaces
                                            .Helper
                                            .classes
                                            .Table
                                            .RequestStaticProperties
                                            .class)
                            .styles =
                    runtimeStaticObject.initStyles(env);
        }

        this.setStyle(env, "default");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setStyle(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.style = this.resolveStyle(env, name);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getStyle(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.style);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columnIndex")
    @ConvertedParameter(index = 1, name = "name")
    public Object setColumnStyle(RuntimeEnv env, Object... args) {
        Object columnIndex = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        columnIndex = ZVal.assign(ZVal.toLong(columnIndex));
        new ReferenceClassProperty(this, "columnStyles", env)
                .arrayAccess(env, columnIndex)
                .set(this.resolveStyle(env, name));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columnIndex")
    public Object getColumnStyle(RuntimeEnv env, Object... args) {
        Object columnIndex = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "columnStyles", env),
                env,
                columnIndex)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "columnStyles", env)
                            .arrayGet(env, columnIndex));
        }

        return ZVal.assign(this.getStyle(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columnIndex")
    @ConvertedParameter(index = 1, name = "width")
    public Object setColumnWidth(RuntimeEnv env, Object... args) {
        Object columnIndex = assignParameter(args, 0, false);
        Object width = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "columnWidths", env)
                .arrayAccess(env, ZVal.toLong(columnIndex))
                .set(ZVal.toLong(width));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "widths", typeHint = "array")
    public Object setColumnWidths(RuntimeEnv env, Object... args) {
        Object widths = assignParameter(args, 0, false);
        Object width = null;
        Object index = null;
        this.columnWidths = ZVal.newArray();
        for (ZPair zpairResult1696 : ZVal.getIterable(widths, env, false)) {
            index = ZVal.assign(zpairResult1696.getKey());
            width = ZVal.assign(zpairResult1696.getValue());
            this.setColumnWidth(env, index, width);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    public Object setHeaders(RuntimeEnv env, Object... args) {
        ReferenceContainer headers = new BasicReferenceContainer(assignParameter(args, 0, false));
        headers.setObject(function_array_values.f.env(env).call(headers.getObject()).value());
        if (ZVal.toBool(!ZVal.isEmpty(headers.getObject()))
                && ZVal.toBool(
                        !function_is_array.f.env(env).call(headers.arrayGet(env, 0)).getBool())) {
            headers.setObject(ZVal.newArray(new ZPair(0, headers.getObject())));
        }

        this.headers = headers.getObject();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rows", typeHint = "array")
    public Object setRows(RuntimeEnv env, Object... args) {
        Object rows = assignParameter(args, 0, false);
        this.rows = ZVal.newArray();
        return ZVal.assign(this.addRows(env, rows));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rows", typeHint = "array")
    public Object addRows(RuntimeEnv env, Object... args) {
        Object rows = assignParameter(args, 0, false);
        Object row = null;
        for (ZPair zpairResult1697 : ZVal.getIterable(rows, env, true)) {
            row = ZVal.assign(zpairResult1697.getValue());
            this.addRow(env, row);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row")
    public Object addRow(RuntimeEnv env, Object... args) {
        Object row = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        row,
                        TableSeparator.class,
                        "Symfony\\Component\\Console\\Helper\\TableSeparator"))) {
            new ReferenceClassProperty(this, "rows", env).arrayAppend(env).set(row);
            return ZVal.assign(this);
        }

        if (!function_is_array.f.env(env).call(row).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "A row must be an array or a TableSeparator instance."));
        }

        new ReferenceClassProperty(this, "rows", env)
                .arrayAppend(env)
                .set(function_array_values.f.env(env).call(row).value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row")
    public Object appendRow(RuntimeEnv env, Object... args) {
        Object row = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.output,
                        ConsoleSectionOutput.class,
                        "Symfony\\Component\\Console\\Output\\ConsoleSectionOutput"))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Output should be an instance of \"%s\" when calling \"%s\".",
                                            ConsoleSectionOutput.CONST_class, "Table::appendRow")
                                    .value()));
        }

        if (ZVal.isTrue(this.rendered)) {
            env.callMethod(this.output, "clear", Table.class, this.calculateRowCount(env));
        }

        this.addRow(env, row);
        this.render(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "row", typeHint = "array")
    public Object setRow(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object row = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "rows", env).arrayAccess(env, column).set(row);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object render(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object isFirstRow = null;
        Object divider = null;
        Object isHeader = null;
        Object row = null;
        Object rows = null;
        rows =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.headers,
                                ZVal.newArray(new ZPair(0, divider = new TableSeparator(env))),
                                this.rows)
                        .value();
        this.calculateNumberOfColumns(env, rows);
        rows = this.buildTableRows(env, rows);
        this.calculateColumnsWidth(env, rows);
        isHeader = true;
        isFirstRow = false;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1698 : ZVal.getIterable(rows, env, true)) {
            row = ZVal.assign(zpairResult1698.getValue());
            if (ZVal.strictEqualityCheck(divider, "===", row)) {
                isHeader = false;
                isFirstRow = true;
                continue;
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            row,
                            TableSeparator.class,
                            "Symfony\\Component\\Console\\Helper\\TableSeparator"))) {
                this.renderRowSeparator(env);
                continue;
            }

            if (!ZVal.isTrue(row)) {
                continue;
            }

            if (ZVal.toBool(isHeader) || ZVal.toBool(isFirstRow)) {
                this.renderRowSeparator(
                        env,
                        ZVal.isTrue(isFirstRow) ? CONST_SEPARATOR_TOP_BOTTOM : CONST_SEPARATOR_TOP);
                if (ZVal.isTrue(isFirstRow)) {
                    isFirstRow = false;
                }
            }

            this.renderRow(
                    env,
                    row,
                    ZVal.isTrue(isHeader)
                            ? env.callMethod(this.style, "getCellHeaderFormat", Table.class)
                            : env.callMethod(this.style, "getCellRowFormat", Table.class));
        }

        this.renderRowSeparator(env, CONST_SEPARATOR_BOTTOM);
        this.cleanup(env);
        this.rendered = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "int")
    private Object renderRowSeparator(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, true);
        if (null == type) {
            type = CONST_SEPARATOR_MID;
        }
        ReferenceContainer crossings = new BasicReferenceContainer(null);
        Object rightChar = null;
        Object runtimeTempArrayResult180 = null;
        Object markup = null;
        ReferenceContainer borders = new BasicReferenceContainer(null);
        Object count = null;
        ReferenceContainer column = new BasicReferenceContainer(null);
        Object midChar = null;
        Object horizontal = null;
        Object runtimeTempArrayResult179 = null;
        Object runtimeTempArrayResult178 = null;
        Object leftChar = null;
        Object runtimeTempArrayResult181 = null;
        if (ZVal.strictEqualityCheck(0, "===", count = ZVal.assign(this.numberOfColumns))) {
            return null;
        }

        borders.setObject(env.callMethod(this.style, "getBorderChars", Table.class));
        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(borders.arrayGet(env, 0)))
                                && ZVal.toBool(!ZVal.isTrue(borders.arrayGet(env, 2))))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(this.style, "getCrossingChar", Table.class)))) {
            return null;
        }

        crossings.setObject(env.callMethod(this.style, "getCrossingChars", Table.class));
        if (ZVal.strictEqualityCheck(CONST_SEPARATOR_MID, "===", type)) {
            ZVal.list(
                    runtimeTempArrayResult178 =
                            ZVal.newArray(
                                    new ZPair(0, borders.arrayGet(env, 2)),
                                    new ZPair(1, crossings.arrayGet(env, 8)),
                                    new ZPair(2, crossings.arrayGet(env, 0)),
                                    new ZPair(3, crossings.arrayGet(env, 4))),
                    (horizontal = listGet(runtimeTempArrayResult178, 0, env)),
                    (leftChar = listGet(runtimeTempArrayResult178, 1, env)),
                    (midChar = listGet(runtimeTempArrayResult178, 2, env)),
                    (rightChar = listGet(runtimeTempArrayResult178, 3, env)));

        } else if (ZVal.strictEqualityCheck(CONST_SEPARATOR_TOP, "===", type)) {
            ZVal.list(
                    runtimeTempArrayResult179 =
                            ZVal.newArray(
                                    new ZPair(0, borders.arrayGet(env, 0)),
                                    new ZPair(1, crossings.arrayGet(env, 1)),
                                    new ZPair(2, crossings.arrayGet(env, 2)),
                                    new ZPair(3, crossings.arrayGet(env, 3))),
                    (horizontal = listGet(runtimeTempArrayResult179, 0, env)),
                    (leftChar = listGet(runtimeTempArrayResult179, 1, env)),
                    (midChar = listGet(runtimeTempArrayResult179, 2, env)),
                    (rightChar = listGet(runtimeTempArrayResult179, 3, env)));

        } else if (ZVal.strictEqualityCheck(CONST_SEPARATOR_TOP_BOTTOM, "===", type)) {
            ZVal.list(
                    runtimeTempArrayResult180 =
                            ZVal.newArray(
                                    new ZPair(0, borders.arrayGet(env, 0)),
                                    new ZPair(1, crossings.arrayGet(env, 9)),
                                    new ZPair(2, crossings.arrayGet(env, 10)),
                                    new ZPair(3, crossings.arrayGet(env, 11))),
                    (horizontal = listGet(runtimeTempArrayResult180, 0, env)),
                    (leftChar = listGet(runtimeTempArrayResult180, 1, env)),
                    (midChar = listGet(runtimeTempArrayResult180, 2, env)),
                    (rightChar = listGet(runtimeTempArrayResult180, 3, env)));

        } else {
            ZVal.list(
                    runtimeTempArrayResult181 =
                            ZVal.newArray(
                                    new ZPair(0, borders.arrayGet(env, 0)),
                                    new ZPair(1, crossings.arrayGet(env, 7)),
                                    new ZPair(2, crossings.arrayGet(env, 6)),
                                    new ZPair(3, crossings.arrayGet(env, 5))),
                    (horizontal = listGet(runtimeTempArrayResult181, 0, env)),
                    (leftChar = listGet(runtimeTempArrayResult181, 1, env)),
                    (midChar = listGet(runtimeTempArrayResult181, 2, env)),
                    (rightChar = listGet(runtimeTempArrayResult181, 3, env)));
        }

        markup = ZVal.assign(leftChar);
        for (column.setObject(0);
                ZVal.isLessThan(column.getObject(), '<', count);
                column.setObject(ZVal.increment(column.getObject()))) {
            markup =
                    toStringR(markup, env)
                            + toStringR(
                                    function_str_repeat
                                            .f
                                            .env(env)
                                            .call(
                                                    horizontal,
                                                    new ReferenceClassProperty(
                                                                    this,
                                                                    "effectiveColumnWidths",
                                                                    env)
                                                            .arrayGet(env, column.getObject()))
                                            .value(),
                                    env);
            markup =
                    toStringR(markup, env)
                            + toStringR(
                                    ZVal.strictEqualityCheck(
                                                    column.getObject(),
                                                    "===",
                                                    ZVal.subtract(count, 1))
                                            ? rightChar
                                            : midChar,
                                    env);
        }

        env.callMethod(
                this.output,
                "writeln",
                Table.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(env.callMethod(this.style, "getBorderFormat", Table.class), markup)
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object renderColumnSeparator(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, true);
        if (null == type) {
            type = CONST_BORDER_OUTSIDE;
        }
        ReferenceContainer borders = new BasicReferenceContainer(null);
        borders.setObject(env.callMethod(this.style, "getBorderChars", Table.class));
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this.style, "getBorderFormat", Table.class),
                                ZVal.strictEqualityCheck(CONST_BORDER_OUTSIDE, "===", type)
                                        ? borders.arrayGet(env, 1)
                                        : borders.arrayGet(env, 3))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row", typeHint = "array")
    @ConvertedParameter(index = 1, name = "cellFormat", typeHint = "string")
    private Object renderRow(RuntimeEnv env, Object... args) {
        Object row = assignParameter(args, 0, false);
        Object cellFormat = assignParameter(args, 1, false);
        Object rowContent = null;
        Object last = null;
        Object columns = null;
        Object column = null;
        Object i = null;
        rowContent = this.renderColumnSeparator(env, CONST_BORDER_OUTSIDE);
        columns = this.getRowColumns(env, row);
        last = ZVal.subtract(function_count.f.env(env).call(columns).value(), 1);
        for (ZPair zpairResult1699 : ZVal.getIterable(columns, env, false)) {
            i = ZVal.assign(zpairResult1699.getKey());
            column = ZVal.assign(zpairResult1699.getValue());
            rowContent =
                    toStringR(rowContent, env)
                            + toStringR(this.renderCell(env, row, column, cellFormat), env);
            rowContent =
                    toStringR(rowContent, env)
                            + toStringR(
                                    this.renderColumnSeparator(
                                            env,
                                            ZVal.strictEqualityCheck(last, "===", i)
                                                    ? CONST_BORDER_OUTSIDE
                                                    : CONST_BORDER_INSIDE),
                                    env);
        }

        env.callMethod(this.output, "writeln", Table.class, rowContent);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row", typeHint = "array")
    @ConvertedParameter(index = 1, name = "column", typeHint = "int")
    @ConvertedParameter(index = 2, name = "cellFormat", typeHint = "string")
    private Object renderCell(RuntimeEnv env, Object... args) {
        ReferenceContainer row = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object column = assignParameter(args, 1, false);
        Object cellFormat = assignParameter(args, 2, false);
        Object width = null;
        Object style = null;
        Object nextColumn = null;
        Object cell = null;
        Object encoding = null;
        Object content = null;
        cell =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, row, env, column)
                                ? row.arrayGet(env, column)
                                : "");
        width =
                ZVal.assign(
                        new ReferenceClassProperty(this, "effectiveColumnWidths", env)
                                .arrayGet(env, column));
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                cell,
                                TableCell.class,
                                "Symfony\\Component\\Console\\Helper\\TableCell"))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                env.callMethod(cell, "getColspan", Table.class), '>', 1))) {
            for (ZPair zpairResult1700 :
                    ZVal.getIterable(
                            function_range
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.add(column, 1),
                                            ZVal.subtract(
                                                    ZVal.add(
                                                            column,
                                                            env.callMethod(
                                                                    cell,
                                                                    "getColspan",
                                                                    Table.class)),
                                                    1))
                                    .value(),
                            env,
                            true)) {
                nextColumn = ZVal.assign(zpairResult1700.getValue());
                width =
                        ZAssignment.add(
                                "+=",
                                width,
                                ZVal.add(
                                        this.getColumnSeparatorWidth(env),
                                        new ReferenceClassProperty(
                                                        this, "effectiveColumnWidths", env)
                                                .arrayGet(env, nextColumn)));
            }
        }

        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                encoding =
                        NamespaceGlobal.mb_detect_encoding
                                .env(env)
                                .call(cell, ZVal.getNull(), true)
                                .value())) {
            width =
                    ZAssignment.add(
                            "+=",
                            width,
                            ZVal.subtract(
                                    function_strlen.f.env(env).call(cell).value(),
                                    NamespaceGlobal.mb_strwidth
                                            .env(env)
                                            .call(cell, encoding)
                                            .value()));
        }

        style = this.getColumnStyle(env, column);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        cell,
                        TableSeparator.class,
                        "Symfony\\Component\\Console\\Helper\\TableSeparator"))) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(style, "getBorderFormat", Table.class),
                                    function_str_repeat
                                            .f
                                            .env(env)
                                            .call(
                                                    handleReturnReference(
                                                                    env.callMethod(
                                                                            style,
                                                                            "getBorderChars",
                                                                            Table.class))
                                                            .arrayGet(env, 2),
                                                    width)
                                            .value())
                            .value());
        }

        width =
                ZAssignment.add(
                        "+=",
                        width,
                        ZVal.subtract(
                                Helper.runtimeStaticObject.strlen(env, cell),
                                Helper.runtimeStaticObject.strlenWithoutDecoration(
                                        env,
                                        env.callMethod(this.output, "getFormatter", Table.class),
                                        cell)));
        content =
                function_sprintf
                        .f
                        .env(env)
                        .call(env.callMethod(style, "getCellRowContentFormat", Table.class), cell)
                        .value();
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                cellFormat,
                                NamespaceGlobal.str_pad
                                        .env(env)
                                        .call(
                                                content,
                                                width,
                                                env.callMethod(
                                                        style, "getPaddingChar", Table.class),
                                                env.callMethod(style, "getPadType", Table.class))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rows")
    private Object calculateNumberOfColumns(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object rows = assignParameter(args, 0, false);
        ReferenceContainer columns = new BasicReferenceContainer(null);
        Object row = null;
        columns.setObject(ZVal.arrayFromList(0));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1701 : ZVal.getIterable(rows, env, true)) {
            row = ZVal.assign(zpairResult1701.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            row,
                            TableSeparator.class,
                            "Symfony\\Component\\Console\\Helper\\TableSeparator"))) {
                continue;
            }

            columns.arrayAppend(env).set(this.getNumberOfColumns(env, row));
        }

        this.numberOfColumns = NamespaceGlobal.max.env(env).call(columns.getObject()).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rows")
    private Object buildTableRows(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Helper")
                        .setFile("/vendor/symfony/console/Helper/Table.php");
        int runtimeConverterContinueCount;
        ReferenceContainer rows = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object lineKey = null;
        Object line = null;
        Object column = null;
        Object cell = null;
        Object lines = null;
        ReferenceContainer unmergedRows = new BasicReferenceContainer(null);
        ReferenceContainer rowKey = new BasicReferenceContainer(null);
        unmergedRows.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (rowKey.setObject(0);
                ZVal.isLessThan(
                        rowKey.getObject(),
                        '<',
                        function_count.f.env(env).call(rows.getObject()).value());
                rowKey.setObject(ZVal.increment(rowKey.getObject()))) {
            rows.setObject(this.fillNextRows(env, rows.getObject(), rowKey.getObject()));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1702 :
                    ZVal.getIterable(rows.arrayGet(env, rowKey.getObject()), env, false)) {
                column = ZVal.assign(zpairResult1702.getKey());
                cell = ZVal.assign(zpairResult1702.getValue());
                if (!NamespaceGlobal.strstr.env(env).call(cell, "\n").getBool()) {
                    continue;
                }

                lines =
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        "\n",
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call("\n", "<fg=default;bg=default>\n</>", cell)
                                                .value())
                                .value();
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1703 : ZVal.getIterable(lines, env, false)) {
                    lineKey = ZVal.assign(zpairResult1703.getKey());
                    line = ZVal.assign(zpairResult1703.getValue());
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    cell,
                                    TableCell.class,
                                    "Symfony\\Component\\Console\\Helper\\TableCell"))) {
                        line =
                                new TableCell(
                                        env,
                                        line,
                                        ZVal.newArray(
                                                new ZPair(
                                                        "colspan",
                                                        env.callMethod(
                                                                cell, "getColspan", Table.class))));
                    }

                    if (ZVal.strictEqualityCheck(0, "===", lineKey)) {
                        rows.arrayAccess(env, rowKey.getObject(), column).set(line);

                    } else {
                        unmergedRows
                                .arrayAccess(env, rowKey.getObject(), lineKey, column)
                                .set(line);
                    }
                }
            }
        }

        return ZVal.assign(
                new TableRows(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\Console\\Helper",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                RuntimeIterable runtimeConverterYieldVariable =
                                        new RuntimeIterable(env);
                                Object row = null;
                                Object rows = null;
                                ReferenceContainer unmergedRows = new BasicReferenceContainer(null);
                                Object rowKey = null;
                                rows = this.contextReferences.getCapturedValue("rows");
                                unmergedRows =
                                        this.contextReferences.getReferenceContainer(
                                                "unmergedRows");
                                for (ZPair zpairResult1704 : ZVal.getIterable(rows, env, false)) {
                                    rowKey = ZVal.assign(zpairResult1704.getKey());
                                    row = ZVal.assign(zpairResult1704.getValue());
                                    runtimeConverterYieldVariable.add(
                                            Table.this.fillCells(env, row));
                                    if (arrayActionR(
                                            ArrayAction.ISSET, unmergedRows, env, rowKey)) {
                                        for (ZPair zpairResult1705 :
                                                ZVal.getIterable(
                                                        unmergedRows.arrayGet(env, rowKey),
                                                        env,
                                                        true)) {
                                            row = ZVal.assign(zpairResult1705.getValue());
                                            runtimeConverterYieldVariable.add(row);
                                        }
                                    }
                                }

                                return runtimeConverterYieldVariable;
                            }
                        }.use("rows", rows).use("unmergedRows", unmergedRows)));
    }

    @ConvertedMethod
    private Object calculateRowCount(RuntimeEnv env, Object... args) {
        ReferenceContainer numberOfRows = new BasicReferenceContainer(null);
        numberOfRows.setObject(
                function_count
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.iterator_to_array
                                        .env(env)
                                        .call(
                                                this.buildTableRows(
                                                        env,
                                                        function_array_merge
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        this.headers,
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        0,
                                                                                        new TableSeparator(
                                                                                                env))),
                                                                        this.rows)
                                                                .value()))
                                        .value())
                        .value());
        if (ZVal.isTrue(this.headers)) {
            numberOfRows.setObject(ZVal.increment(numberOfRows.getObject()));
        }

        numberOfRows.setObject(ZVal.increment(numberOfRows.getObject()));
        return ZVal.assign(numberOfRows.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rows", typeHint = "array")
    @ConvertedParameter(index = 1, name = "line", typeHint = "int")
    private Object fillNextRows(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer rows = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object line = assignParameter(args, 1, false);
        ReferenceContainer unmergedRow = new BasicReferenceContainer(null);
        Object unmergedRowKey = null;
        Object nbLines = null;
        Object column = null;
        Object cell = null;
        Object cellKey = null;
        ReferenceContainer row = new BasicReferenceContainer(null);
        ReferenceContainer lines = new BasicReferenceContainer(null);
        ReferenceContainer unmergedRows = new BasicReferenceContainer(null);
        Object value = null;
        unmergedRows.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1706 : ZVal.getIterable(rows.arrayGet(env, line), env, false)) {
            column = ZVal.assign(zpairResult1706.getKey());
            cell = ZVal.assign(zpairResult1706.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.strictNotEqualityCheck(
                                                                    ZVal.getNull(), "!==", cell))
                                                    && ZVal.toBool(
                                                            !ZVal.isTrue(
                                                                    ZVal.checkInstanceType(
                                                                            cell,
                                                                            TableCell.class,
                                                                            "Symfony\\Component\\Console\\Helper\\TableCell"))))
                                    && ZVal.toBool(
                                            !function_is_scalar.f.env(env).call(cell).getBool()))
                    && ZVal.toBool(
                            !ZVal.toBool(function_is_object.f.env(env).call(cell).value())
                                    && ZVal.toBool(
                                            function_method_exists
                                                    .f
                                                    .env(env)
                                                    .call(cell, "__toString")
                                                    .value()))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "A cell must be a TableCell, a scalar or an object implementing __toString, %s given.",
                                                NamespaceGlobal.gettype.env(env).call(cell).value())
                                        .value()));
            }

            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    cell,
                                    TableCell.class,
                                    "Symfony\\Component\\Console\\Helper\\TableCell"))
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    env.callMethod(cell, "getRowspan", Table.class), '>', 1))) {
                nbLines = ZVal.subtract(env.callMethod(cell, "getRowspan", Table.class), 1);
                lines.setObject(ZVal.newArray(new ZPair(0, cell)));
                if (NamespaceGlobal.strstr.env(env).call(cell, "\n").getBool()) {
                    lines.setObject(
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            "\n",
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "\n",
                                                            "<fg=default;bg=default>\n</>",
                                                            cell)
                                                    .value())
                                    .value());
                    nbLines =
                            ZVal.assign(
                                    ZVal.isGreaterThan(
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(lines.getObject())
                                                            .value(),
                                                    '>',
                                                    nbLines)
                                            ? NamespaceGlobal.substr_count
                                                    .env(env)
                                                    .call(cell, "\n")
                                                    .value()
                                            : nbLines);
                    rows.arrayAccess(env, line, column)
                            .set(
                                    new TableCell(
                                            env,
                                            lines.arrayGet(env, 0),
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "colspan",
                                                            env.callMethod(
                                                                    cell,
                                                                    "getColspan",
                                                                    Table.class)))));
                    arrayActionR(ArrayAction.UNSET, lines, env, 0);
                }

                unmergedRows.setObject(
                        function_array_replace_recursive
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.array_fill
                                                .env(env)
                                                .call(ZVal.add(line, 1), nbLines, ZVal.newArray())
                                                .value(),
                                        unmergedRows.getObject())
                                .value());
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1707 :
                        ZVal.getIterable(unmergedRows.getObject(), env, false)) {
                    unmergedRowKey = ZVal.assign(zpairResult1707.getKey());
                    unmergedRow.setObject(ZVal.assign(zpairResult1707.getValue()));
                    value =
                            ZVal.assign(
                                    arrayActionR(
                                                    ArrayAction.ISSET,
                                                    lines,
                                                    env,
                                                    ZVal.subtract(unmergedRowKey, line))
                                            ? lines.arrayGet(
                                                    env, ZVal.subtract(unmergedRowKey, line))
                                            : "");
                    unmergedRows
                            .arrayAccess(env, unmergedRowKey, column)
                            .set(
                                    new TableCell(
                                            env,
                                            value,
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "colspan",
                                                            env.callMethod(
                                                                    cell,
                                                                    "getColspan",
                                                                    Table.class)))));
                    if (ZVal.strictEqualityCheck(
                            nbLines, "===", ZVal.subtract(unmergedRowKey, line))) {
                        break;
                    }
                }
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1708 : ZVal.getIterable(unmergedRows.getObject(), env, false)) {
            unmergedRowKey = ZVal.assign(zpairResult1708.getKey());
            unmergedRow.setObject(ZVal.assign(zpairResult1708.getValue()));
            if (ZVal.toBool(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, rows, env, unmergedRowKey))
                                    && ZVal.toBool(
                                            function_is_array
                                                    .f
                                                    .env(env)
                                                    .call(rows.arrayGet(env, unmergedRowKey))
                                                    .value()))
                    && ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    ZVal.add(
                                            this.getNumberOfColumns(
                                                    env, rows.arrayGet(env, unmergedRowKey)),
                                            this.getNumberOfColumns(
                                                    env,
                                                    unmergedRows.arrayGet(env, unmergedRowKey))),
                                    "<=",
                                    this.numberOfColumns))) {
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1709 :
                        ZVal.getIterable(unmergedRow.getObject(), env, false)) {
                    cellKey = ZVal.assign(zpairResult1709.getKey());
                    cell = ZVal.assign(zpairResult1709.getValue());
                    function_array_splice
                            .f
                            .env(env)
                            .call(
                                    rows.arrayGet(env, unmergedRowKey),
                                    cellKey,
                                    0,
                                    ZVal.newArray(new ZPair(0, cell)));
                }

            } else {
                row.setObject(
                        this.copyRow(env, rows.getObject(), ZVal.subtract(unmergedRowKey, 1)));
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1710 :
                        ZVal.getIterable(unmergedRow.getObject(), env, false)) {
                    column = ZVal.assign(zpairResult1710.getKey());
                    cell = ZVal.assign(zpairResult1710.getValue());
                    if (!ZVal.isEmpty(cell)) {
                        row.arrayAccess(env, column).set(unmergedRow.arrayGet(env, column));
                    }
                }

                function_array_splice
                        .f
                        .env(env)
                        .call(
                                rows.getObject(),
                                unmergedRowKey,
                                0,
                                ZVal.newArray(new ZPair(0, row.getObject())));
            }
        }

        return ZVal.assign(rows.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row")
    private Object fillCells(RuntimeEnv env, Object... args) {
        Object row = assignParameter(args, 0, false);
        ReferenceContainer newRow = new BasicReferenceContainer(null);
        Object column = null;
        Object ternaryExpressionTemp = null;
        Object position = null;
        Object cell = null;
        newRow.setObject(ZVal.newArray());
        for (ZPair zpairResult1711 : ZVal.getIterable(row, env, false)) {
            column = ZVal.assign(zpairResult1711.getKey());
            cell = ZVal.assign(zpairResult1711.getValue());
            newRow.arrayAppend(env).set(cell);
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    cell,
                                    TableCell.class,
                                    "Symfony\\Component\\Console\\Helper\\TableCell"))
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    env.callMethod(cell, "getColspan", Table.class), '>', 1))) {
                for (ZPair zpairResult1712 :
                        ZVal.getIterable(
                                function_range
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.add(column, 1),
                                                ZVal.subtract(
                                                        ZVal.add(
                                                                column,
                                                                env.callMethod(
                                                                        cell,
                                                                        "getColspan",
                                                                        Table.class)),
                                                        1))
                                        .value(),
                                env,
                                true)) {
                    position = ZVal.assign(zpairResult1712.getValue());
                    newRow.arrayAppend(env).set("");
                }
            }
        }

        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = newRow.getObject())
                        ? ternaryExpressionTemp
                        : row);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rows", typeHint = "array")
    @ConvertedParameter(index = 1, name = "line", typeHint = "int")
    private Object copyRow(RuntimeEnv env, Object... args) {
        ReferenceContainer rows = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object line = assignParameter(args, 1, false);
        ReferenceContainer row = new BasicReferenceContainer(null);
        Object cellKey = null;
        Object cellValue = null;
        row.setObject(ZVal.assign(rows.arrayGet(env, line)));
        for (ZPair zpairResult1713 : ZVal.getIterable(row.getObject(), env, false)) {
            cellKey = ZVal.assign(zpairResult1713.getKey());
            cellValue = ZVal.assign(zpairResult1713.getValue());
            row.arrayAccess(env, cellKey).set("");
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            cellValue,
                            TableCell.class,
                            "Symfony\\Component\\Console\\Helper\\TableCell"))) {
                row.arrayAccess(env, cellKey)
                        .set(
                                new TableCell(
                                        env,
                                        "",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "colspan",
                                                        env.callMethod(
                                                                cellValue,
                                                                "getColspan",
                                                                Table.class)))));
            }
        }

        return ZVal.assign(row.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row", typeHint = "array")
    private Object getNumberOfColumns(RuntimeEnv env, Object... args) {
        Object row = assignParameter(args, 0, false);
        Object columns = null;
        Object column = null;
        columns = function_count.f.env(env).call(row).value();
        for (ZPair zpairResult1714 : ZVal.getIterable(row, env, true)) {
            column = ZVal.assign(zpairResult1714.getValue());
            columns =
                    ZAssignment.add(
                            "+=",
                            columns,
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    column,
                                                    TableCell.class,
                                                    "Symfony\\Component\\Console\\Helper\\TableCell"))
                                    ? ZVal.subtract(
                                            env.callMethod(column, "getColspan", Table.class), 1)
                                    : 0);
        }

        return ZVal.assign(columns);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row", typeHint = "array")
    private Object getRowColumns(RuntimeEnv env, Object... args) {
        Object row = assignParameter(args, 0, false);
        Object columns = null;
        Object cellKey = null;
        Object cell = null;
        columns = function_range.f.env(env).call(0, ZVal.subtract(this.numberOfColumns, 1)).value();
        for (ZPair zpairResult1715 : ZVal.getIterable(row, env, false)) {
            cellKey = ZVal.assign(zpairResult1715.getKey());
            cell = ZVal.assign(zpairResult1715.getValue());
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    cell,
                                    TableCell.class,
                                    "Symfony\\Component\\Console\\Helper\\TableCell"))
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    env.callMethod(cell, "getColspan", Table.class), '>', 1))) {
                columns =
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        columns,
                                        function_range
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.add(cellKey, 1),
                                                        ZVal.subtract(
                                                                ZVal.add(
                                                                        cellKey,
                                                                        env.callMethod(
                                                                                cell,
                                                                                "getColspan",
                                                                                Table.class)),
                                                                1))
                                                .value())
                                .value();
            }
        }

        return ZVal.assign(columns);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rows", typeHint = "iterable")
    private Object calculateColumnsWidth(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object rows = assignParameter(args, 0, false);
        ReferenceContainer lengths = new BasicReferenceContainer(null);
        ReferenceContainer column = new BasicReferenceContainer(null);
        Object textLength = null;
        Object i = null;
        Object textContent = null;
        ReferenceContainer row = new BasicReferenceContainer(null);
        Object position = null;
        Object cell = null;
        Object contentColumns = null;
        Object content = null;
        runtimeConverterContinueCount = 0;
        for (column.setObject(0);
                ZVal.isLessThan(column.getObject(), '<', this.numberOfColumns);
                column.setObject(ZVal.increment(column.getObject()))) {
            lengths.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1716 : ZVal.getIterable(rows, env, true)) {
                row.setObject(ZVal.assign(zpairResult1716.getValue()));
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                row.getObject(),
                                TableSeparator.class,
                                "Symfony\\Component\\Console\\Helper\\TableSeparator"))) {
                    continue;
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1717 : ZVal.getIterable(row.getObject(), env, false)) {
                    i = ZVal.assign(zpairResult1717.getKey());
                    cell = ZVal.assign(zpairResult1717.getValue());
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    cell,
                                    TableCell.class,
                                    "Symfony\\Component\\Console\\Helper\\TableCell"))) {
                        textContent =
                                Helper.runtimeStaticObject.removeDecoration(
                                        env,
                                        env.callMethod(this.output, "getFormatter", Table.class),
                                        cell);
                        textLength = Helper.runtimeStaticObject.strlen(env, textContent);
                        if (ZVal.isGreaterThan(textLength, '>', 0)) {
                            contentColumns =
                                    NamespaceGlobal.str_split
                                            .env(env)
                                            .call(
                                                    textContent,
                                                    NamespaceGlobal.ceil
                                                            .env(env)
                                                            .call(
                                                                    ZVal.divide(
                                                                            textLength,
                                                                            env.callMethod(
                                                                                    cell,
                                                                                    "getColspan",
                                                                                    Table.class)))
                                                            .value())
                                            .value();
                            runtimeConverterContinueCount = 0;
                            for (ZPair zpairResult1718 :
                                    ZVal.getIterable(contentColumns, env, false)) {
                                position = ZVal.assign(zpairResult1718.getKey());
                                content = ZVal.assign(zpairResult1718.getValue());
                                row.arrayAccess(env, ZVal.add(i, position)).set(content);
                            }
                        }
                    }
                }

                lengths.arrayAppend(env)
                        .set(this.getCellWidth(env, row.getObject(), column.getObject()));
            }

            new ReferenceClassProperty(this, "effectiveColumnWidths", env)
                    .arrayAccess(env, column.getObject())
                    .set(
                            ZVal.subtract(
                                    ZVal.add(
                                            NamespaceGlobal.max
                                                    .env(env)
                                                    .call(lengths.getObject())
                                                    .value(),
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    this.style,
                                                                    "getCellRowContentFormat",
                                                                    Table.class))
                                                    .value()),
                                    2));
        }

        return null;
    }

    @ConvertedMethod
    private Object getColumnSeparatorWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_strlen
                        .f
                        .env(env)
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this.style, "getBorderFormat", Table.class),
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        this.style,
                                                                        "getBorderChars",
                                                                        Table.class))
                                                        .arrayGet(env, 3))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "row", typeHint = "array")
    @ConvertedParameter(index = 1, name = "column", typeHint = "int")
    private Object getCellWidth(RuntimeEnv env, Object... args) {
        ReferenceContainer row = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object column = assignParameter(args, 1, false);
        Object cellWidth = null;
        Object columnWidth = null;
        Object cell = null;
        cellWidth = 0;
        if (arrayActionR(ArrayAction.ISSET, row, env, column)) {
            cell = ZVal.assign(row.arrayGet(env, column));
            cellWidth =
                    Helper.runtimeStaticObject.strlenWithoutDecoration(
                            env, env.callMethod(this.output, "getFormatter", Table.class), cell);
        }

        columnWidth =
                ZVal.assign(
                        arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "columnWidths", env),
                                        env,
                                        column)
                                ? new ReferenceClassProperty(this, "columnWidths", env)
                                        .arrayGet(env, column)
                                : 0);
        return ZVal.assign(NamespaceGlobal.max.env(env).call(cellWidth, columnWidth).value());
    }

    @ConvertedMethod
    private Object cleanup(RuntimeEnv env, Object... args) {
        this.effectiveColumnWidths = ZVal.newArray();
        this.numberOfColumns = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object resolveStyle(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        name,
                        TableStyle.class,
                        "Symfony\\Component\\Console\\Helper\\TableStyle"))) {
            return ZVal.assign(name);
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Console
                                .namespaces
                                .Helper
                                .classes
                                .Table
                                .RequestStaticProperties
                                .class,
                        "styles"),
                env,
                name)) {
            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Console
                                            .namespaces
                                            .Helper
                                            .classes
                                            .Table
                                            .RequestStaticProperties
                                            .class,
                                    "styles")
                            .arrayGet(env, name));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call("Style \"%s\" is not defined.", name)
                                .value()));
    }

    public static final Object CONST_SEPARATOR_TOP = 0;

    public static final Object CONST_SEPARATOR_TOP_BOTTOM = 1;

    public static final Object CONST_SEPARATOR_MID = 2;

    public static final Object CONST_SEPARATOR_BOTTOM = 3;

    public static final Object CONST_BORDER_OUTSIDE = 0;

    public static final Object CONST_BORDER_INSIDE = 1;

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\Table";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(
            index = 1,
            name = "style",
            typeHint = "Symfony\\Component\\Console\\Helper\\TableStyle"
        )
        public Object setStyleDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object style = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Console
                                            .namespaces
                                            .Helper
                                            .classes
                                            .Table
                                            .RequestStaticProperties
                                            .class)
                            .styles)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Console
                                                .namespaces
                                                .Helper
                                                .classes
                                                .Table
                                                .RequestStaticProperties
                                                .class)
                                .styles =
                        runtimeStaticObject.initStyles(env);
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Console
                                    .namespaces
                                    .Helper
                                    .classes
                                    .Table
                                    .RequestStaticProperties
                                    .class,
                            "styles")
                    .arrayAccess(env, name)
                    .set(style);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object getStyleDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Console
                                            .namespaces
                                            .Helper
                                            .classes
                                            .Table
                                            .RequestStaticProperties
                                            .class)
                            .styles)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Console
                                                .namespaces
                                                .Helper
                                                .classes
                                                .Table
                                                .RequestStaticProperties
                                                .class)
                                .styles =
                        runtimeStaticObject.initStyles(env);
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Console
                                    .namespaces
                                    .Helper
                                    .classes
                                    .Table
                                    .RequestStaticProperties
                                    .class,
                            "styles"),
                    env,
                    name)) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Console
                                                .namespaces
                                                .Helper
                                                .classes
                                                .Table
                                                .RequestStaticProperties
                                                .class,
                                        "styles")
                                .arrayGet(env, name));
            }

            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Style \"%s\" is not defined.", name)
                                    .value()));
        }

        @ConvertedMethod
        private Object initStyles(RuntimeEnv env, Object... args) {
            Object boxDouble = null;
            Object styleGuide = null;
            Object borderless = null;
            Object compact = null;
            Object box = null;
            borderless = new TableStyle(env);
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    borderless, "setHorizontalBorderChars", Table.class, "="),
                            "setVerticalBorderChars",
                            Table.class,
                            " "),
                    "setDefaultCrossingChar",
                    Table.class,
                    " ");
            compact = new TableStyle(env);
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            compact, "setHorizontalBorderChars", Table.class, ""),
                                    "setVerticalBorderChars",
                                    Table.class,
                                    " "),
                            "setDefaultCrossingChar",
                            Table.class,
                            ""),
                    "setCellRowContentFormat",
                    Table.class,
                    "%s");
            styleGuide = new TableStyle(env);
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            styleGuide,
                                            "setHorizontalBorderChars",
                                            Table.class,
                                            "-"),
                                    "setVerticalBorderChars",
                                    Table.class,
                                    " "),
                            "setDefaultCrossingChar",
                            Table.class,
                            " "),
                    "setCellHeaderFormat",
                    Table.class,
                    "%s");
            box =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            new TableStyle(env),
                                            "setHorizontalBorderChars",
                                            Table.class,
                                            "\u2500"),
                                    "setVerticalBorderChars",
                                    Table.class,
                                    "\u2502"),
                            "setCrossingChars",
                            Table.class,
                            "\u253C",
                            "\u250C",
                            "\u252C",
                            "\u2510",
                            "\u2524",
                            "\u2518",
                            "\u2534",
                            "\u2514",
                            "\u251C");
            boxDouble =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            new TableStyle(env),
                                            "setHorizontalBorderChars",
                                            Table.class,
                                            "\u2550",
                                            "\u2500"),
                                    "setVerticalBorderChars",
                                    Table.class,
                                    "\u2551",
                                    "\u2502"),
                            "setCrossingChars",
                            Table.class,
                            "\u253C",
                            "\u2554",
                            "\u2564",
                            "\u2557",
                            "\u2562",
                            "\u255D",
                            "\u2567",
                            "\u255A",
                            "\u255F",
                            "\u2560",
                            "\u256A",
                            "\u2563");
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("default", new TableStyle(env)),
                            new ZPair("borderless", borderless),
                            new ZPair("compact", compact),
                            new ZPair("symfony-style-guide", styleGuide),
                            new ZPair("box", box),
                            new ZPair("box-double", boxDouble)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object styles = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\Table")
                    .setLookup(
                            Table.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "columnStyles",
                            "columnWidths",
                            "effectiveColumnWidths",
                            "headers",
                            "numberOfColumns",
                            "output",
                            "rendered",
                            "rows",
                            "style")
                    .setStaticPropertyNames("styles")
                    .setFilename("vendor/symfony/console/Helper/Table.php")
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
