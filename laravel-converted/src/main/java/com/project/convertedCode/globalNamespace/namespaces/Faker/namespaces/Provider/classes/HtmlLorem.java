package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Lorem;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.UniqueGenerator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Internet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/HtmlLorem.php

*/

public class HtmlLorem extends Base {

    public Object idGenerator = null;

    public HtmlLorem(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HtmlLorem.class) {
            this.__construct(env, args);
        }
    }

    public HtmlLorem(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        super.__construct(env, generator);
        env.callMethod(generator, "addProvider", HtmlLorem.class, new Lorem(env, generator));
        env.callMethod(generator, "addProvider", HtmlLorem.class, new Internet(env, generator));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "maxDepth",
        defaultValue = "4",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "maxWidth",
        defaultValue = "4",
        defaultValueType = "number"
    )
    public Object randomHtml(RuntimeEnv env, Object... args) {
        Object maxDepth = assignParameter(args, 0, true);
        if (null == maxDepth) {
            maxDepth = 4;
        }
        Object maxWidth = assignParameter(args, 1, true);
        if (null == maxWidth) {
            maxWidth = 4;
        }
        Object head = null;
        Object document = null;
        Object html = null;
        Object body = null;
        document = new DOMDocument(env);
        this.idGenerator =
                new UniqueGenerator(
                        env, toObjectR(this).accessProp(this, env).name("generator").value());
        head = env.callMethod(document, "createElement", HtmlLorem.class, "head");
        this.addRandomTitle(env, head);
        body = env.callMethod(document, "createElement", HtmlLorem.class, "body");
        this.addLoginForm(env, body);
        this.addRandomSubTree(env, body, maxDepth, maxWidth);
        html = env.callMethod(document, "createElement", HtmlLorem.class, "html");
        env.callMethod(html, "appendChild", HtmlLorem.class, head);
        env.callMethod(html, "appendChild", HtmlLorem.class, body);
        env.callMethod(document, "appendChild", HtmlLorem.class, html);
        return ZVal.assign(env.callMethod(document, "saveHTML", HtmlLorem.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "maxDepth")
    @ConvertedParameter(index = 2, name = "maxWidth")
    private Object addRandomSubTree(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        ReferenceContainer maxDepth = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object maxWidth = assignParameter(args, 2, false);
        Object siblings = null;
        Object sibling = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        maxDepth.setObject(ZVal.decrement(maxDepth.getObject()));
        if (ZVal.isLessThanOrEqualTo(maxDepth.getObject(), "<=", 0)) {
            return ZVal.assign(root);
        }

        siblings = NamespaceGlobal.mt_rand.env(env).call(1, maxWidth).value();
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', siblings);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.equalityCheck(maxDepth.getObject(), 1)) {
                this.addRandomLeaf(env, root);

            } else {
                sibling =
                        env.callMethod(
                                toObjectR(root).accessProp(this, env).name("ownerDocument").value(),
                                "createElement",
                                HtmlLorem.class,
                                "div");
                env.callMethod(root, "appendChild", HtmlLorem.class, sibling);
                this.addRandomAttribute(env, sibling);
                this.addRandomSubTree(
                        env,
                        sibling,
                        NamespaceGlobal.mt_rand.env(env).call(0, maxDepth.getObject()).value(),
                        maxWidth);
            }
        }

        return ZVal.assign(root);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "DOMElement")
    private Object addRandomLeaf(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, false);
        Object rand = null;
        rand = NamespaceGlobal.mt_rand.env(env).call(1, 10).value();
        SwitchEnumType9 switchVariable9 =
                ZVal.getEnum(
                        rand,
                        SwitchEnumType9.DEFAULT_CASE,
                        SwitchEnumType9.INTEGER_1,
                        1,
                        SwitchEnumType9.INTEGER_2,
                        2,
                        SwitchEnumType9.INTEGER_3,
                        3,
                        SwitchEnumType9.INTEGER_4,
                        4,
                        SwitchEnumType9.INTEGER_5,
                        5,
                        SwitchEnumType9.INTEGER_6,
                        6,
                        SwitchEnumType9.INTEGER_7,
                        7,
                        SwitchEnumType9.INTEGER_8,
                        8);
        switch (switchVariable9) {
            case INTEGER_1:
                this.addRandomP(env, node);
                break;
            case INTEGER_2:
                this.addRandomA(env, node);
                break;
            case INTEGER_3:
                this.addRandomSpan(env, node);
                break;
            case INTEGER_4:
                this.addRandomUL(env, node);
                break;
            case INTEGER_5:
                this.addRandomH(env, node);
                break;
            case INTEGER_6:
                this.addRandomB(env, node);
                break;
            case INTEGER_7:
                this.addRandomI(env, node);
                break;
            case INTEGER_8:
                this.addRandomTable(env, node);
                break;
            case DEFAULT_CASE:
                this.addRandomText(env, node);
                break;
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "DOMElement")
    private Object addRandomAttribute(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, false);
        Object rand = null;
        rand = NamespaceGlobal.mt_rand.env(env).call(1, 2).value();
        switch (ZVal.toInt(rand)) {
            case 1:
                env.callMethod(
                        node,
                        "setAttribute",
                        HtmlLorem.class,
                        "class",
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("generator")
                                .getObject()
                                .accessProp(this, env)
                                .name("word")
                                .value());
                break;
            case 2:
                env.callMethod(
                        node,
                        "setAttribute",
                        HtmlLorem.class,
                        "id",
                        toStringR(
                                env.callMethod(
                                        this.idGenerator, "randomNumber", HtmlLorem.class, 5),
                                env));
                break;
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomP(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object node = null;
        node =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "P_TAG"));
        toObjectR(node)
                .accessProp(this, env)
                .name("textContent")
                .set(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        env.callMethod(element, "appendChild", HtmlLorem.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomText(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object text = null;
        text =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createTextNode",
                        HtmlLorem.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        env.callMethod(element, "appendChild", HtmlLorem.class, text);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomA(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object node = null;
        Object text = null;
        text =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createTextNode",
                        HtmlLorem.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        node =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "A_TAG"));
        env.callMethod(
                node,
                "setAttribute",
                HtmlLorem.class,
                "href",
                toObjectR(this)
                        .accessProp(this, env)
                        .name("generator")
                        .getObject()
                        .accessProp(this, env)
                        .name("safeEmailDomain")
                        .value());
        env.callMethod(node, "appendChild", HtmlLorem.class, text);
        env.callMethod(element, "appendChild", HtmlLorem.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomTitle(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object node = null;
        Object text = null;
        text =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createTextNode",
                        HtmlLorem.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        node =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "TITLE_TAG"));
        env.callMethod(node, "appendChild", HtmlLorem.class, text);
        env.callMethod(element, "appendChild", HtmlLorem.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomH(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object node = null;
        Object h = null;
        Object text = null;
        h =
                toStringR(ClassConstantUtils.getConstantValueLateStatic(env, this, "H_TAG"), env)
                        + toStringR(
                                toStringR(NamespaceGlobal.mt_rand.env(env).call(1, 3).value(), env),
                                env);
        text =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createTextNode",
                        HtmlLorem.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        node =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        h);
        env.callMethod(node, "appendChild", HtmlLorem.class, text);
        env.callMethod(element, "appendChild", HtmlLorem.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomB(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object node = null;
        Object text = null;
        text =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createTextNode",
                        HtmlLorem.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        node =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "B_TAG"));
        env.callMethod(node, "appendChild", HtmlLorem.class, text);
        env.callMethod(element, "appendChild", HtmlLorem.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomI(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object node = null;
        Object text = null;
        text =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createTextNode",
                        HtmlLorem.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        node =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "I_TAG"));
        env.callMethod(node, "appendChild", HtmlLorem.class, text);
        env.callMethod(element, "appendChild", HtmlLorem.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomSpan(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxLength = assignParameter(args, 1, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object node = null;
        Object text = null;
        text =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createTextNode",
                        HtmlLorem.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("generator").value(),
                                "sentence",
                                HtmlLorem.class,
                                NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
        node =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "SPAN_TAG"));
        env.callMethod(node, "appendChild", HtmlLorem.class, text);
        env.callMethod(element, "appendChild", HtmlLorem.class, node);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    private Object addLoginForm(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object textInput = null;
        Object textLabel = null;
        Object submit = null;
        Object passwordInput = null;
        Object passwordLabel = null;
        textInput =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "INPUT_TAG"));
        env.callMethod(textInput, "setAttribute", HtmlLorem.class, "type", "text");
        env.callMethod(textInput, "setAttribute", HtmlLorem.class, "id", "username");
        textLabel =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "LABEL_TAG"));
        env.callMethod(textLabel, "setAttribute", HtmlLorem.class, "for", "username");
        toObjectR(textLabel)
                .accessProp(this, env)
                .name("textContent")
                .set(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("generator")
                                .getObject()
                                .accessProp(this, env)
                                .name("word")
                                .value());
        passwordInput =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "INPUT_TAG"));
        env.callMethod(passwordInput, "setAttribute", HtmlLorem.class, "type", "password");
        env.callMethod(passwordInput, "setAttribute", HtmlLorem.class, "id", "password");
        passwordLabel =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "LABEL_TAG"));
        env.callMethod(passwordLabel, "setAttribute", HtmlLorem.class, "for", "password");
        toObjectR(passwordLabel)
                .accessProp(this, env)
                .name("textContent")
                .set(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("generator")
                                .getObject()
                                .accessProp(this, env)
                                .name("word")
                                .value());
        submit =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "INPUT_TAG"));
        env.callMethod(submit, "setAttribute", HtmlLorem.class, "type", "submit");
        env.callMethod(
                submit,
                "setAttribute",
                HtmlLorem.class,
                "value",
                toObjectR(this)
                        .accessProp(this, env)
                        .name("generator")
                        .getObject()
                        .accessProp(this, env)
                        .name("word")
                        .value());
        submit =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "FORM_TAG"));
        env.callMethod(
                submit,
                "setAttribute",
                HtmlLorem.class,
                "action",
                toObjectR(this)
                        .accessProp(this, env)
                        .name("generator")
                        .getObject()
                        .accessProp(this, env)
                        .name("safeEmailDomain")
                        .value());
        env.callMethod(submit, "setAttribute", HtmlLorem.class, "method", "POST");
        env.callMethod(submit, "appendChild", HtmlLorem.class, textLabel);
        env.callMethod(submit, "appendChild", HtmlLorem.class, textInput);
        env.callMethod(submit, "appendChild", HtmlLorem.class, passwordLabel);
        env.callMethod(submit, "appendChild", HtmlLorem.class, passwordInput);
        env.callMethod(element, "appendChild", HtmlLorem.class, submit);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxRows",
        defaultValue = "10",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "maxCols",
        defaultValue = "6",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "maxTitle",
        defaultValue = "4",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 4,
        name = "maxLength",
        defaultValue = "10",
        defaultValueType = "number"
    )
    private Object addRandomTable(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxRows = assignParameter(args, 1, true);
        if (null == maxRows) {
            maxRows = 10;
        }
        Object maxCols = assignParameter(args, 2, true);
        if (null == maxCols) {
            maxCols = 6;
        }
        Object maxTitle = assignParameter(args, 3, true);
        if (null == maxTitle) {
            maxTitle = 4;
        }
        Object maxLength = assignParameter(args, 4, true);
        if (null == maxLength) {
            maxLength = 10;
        }
        Object tbody = null;
        Object thead = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        Object rows = null;
        Object th = null;
        Object cols = null;
        Object table = null;
        Object tr = null;
        rows = NamespaceGlobal.mt_rand.env(env).call(1, maxRows).value();
        cols = NamespaceGlobal.mt_rand.env(env).call(1, maxCols).value();
        table =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "TABLE_TAG"));
        thead =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "THEAD_TAG"));
        tbody =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "TBODY_TAG"));
        env.callMethod(table, "appendChild", HtmlLorem.class, thead);
        env.callMethod(table, "appendChild", HtmlLorem.class, tbody);
        tr =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "TR_TAG"));
        env.callMethod(thead, "appendChild", HtmlLorem.class, tr);
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', cols);
                i.setObject(ZVal.increment(i.getObject()))) {
            th =
                    env.callMethod(
                            toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                            "createElement",
                            HtmlLorem.class,
                            ClassConstantUtils.getConstantValueLateStatic(env, this, "TH_TAG"));
            toObjectR(th)
                    .accessProp(this, env)
                    .name("textContent")
                    .set(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("generator").value(),
                                    "sentence",
                                    HtmlLorem.class,
                                    NamespaceGlobal.mt_rand.env(env).call(1, maxTitle).value()));
            env.callMethod(tr, "appendChild", HtmlLorem.class, th);
        }

        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', rows);
                i.setObject(ZVal.increment(i.getObject()))) {
            tr =
                    env.callMethod(
                            toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                            "createElement",
                            HtmlLorem.class,
                            ClassConstantUtils.getConstantValueLateStatic(env, this, "TR_TAG"));
            env.callMethod(tbody, "appendChild", HtmlLorem.class, tr);
            for (j.setObject(0);
                    ZVal.isLessThan(j.getObject(), '<', cols);
                    j.setObject(ZVal.increment(j.getObject()))) {
                th =
                        env.callMethod(
                                toObjectR(element)
                                        .accessProp(this, env)
                                        .name("ownerDocument")
                                        .value(),
                                "createElement",
                                HtmlLorem.class,
                                ClassConstantUtils.getConstantValueLateStatic(env, this, "TD_TAG"));
                toObjectR(th)
                        .accessProp(this, env)
                        .name("textContent")
                        .set(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("generator")
                                                .value(),
                                        "sentence",
                                        HtmlLorem.class,
                                        NamespaceGlobal.mt_rand
                                                .env(env)
                                                .call(1, maxLength)
                                                .value()));
                env.callMethod(tr, "appendChild", HtmlLorem.class, th);
            }
        }

        env.callMethod(element, "appendChild", HtmlLorem.class, table);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(
        index = 1,
        name = "maxItems",
        defaultValue = "11",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "maxLength",
        defaultValue = "4",
        defaultValueType = "number"
    )
    private Object addRandomUL(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object maxItems = assignParameter(args, 1, true);
        if (null == maxItems) {
            maxItems = 11;
        }
        Object maxLength = assignParameter(args, 2, true);
        if (null == maxLength) {
            maxLength = 4;
        }
        Object num = null;
        Object ul = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object li = null;
        num = NamespaceGlobal.mt_rand.env(env).call(1, maxItems).value();
        ul =
                env.callMethod(
                        toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                        "createElement",
                        HtmlLorem.class,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "UL_TAG"));
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', num);
                i.setObject(ZVal.increment(i.getObject()))) {
            li =
                    env.callMethod(
                            toObjectR(element).accessProp(this, env).name("ownerDocument").value(),
                            "createElement",
                            HtmlLorem.class,
                            ClassConstantUtils.getConstantValueLateStatic(env, this, "LI_TAG"));
            toObjectR(li)
                    .accessProp(this, env)
                    .name("textContent")
                    .set(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("generator").value(),
                                    "sentence",
                                    HtmlLorem.class,
                                    NamespaceGlobal.mt_rand.env(env).call(1, maxLength).value()));
            env.callMethod(ul, "appendChild", HtmlLorem.class, li);
        }

        env.callMethod(element, "appendChild", HtmlLorem.class, ul);
        return null;
    }

    public static final Object CONST_HTML_TAG = "html";

    public static final Object CONST_HEAD_TAG = "head";

    public static final Object CONST_BODY_TAG = "body";

    public static final Object CONST_DIV_TAG = "div";

    public static final Object CONST_P_TAG = "p";

    public static final Object CONST_A_TAG = "a";

    public static final Object CONST_SPAN_TAG = "span";

    public static final Object CONST_TABLE_TAG = "table";

    public static final Object CONST_THEAD_TAG = "thead";

    public static final Object CONST_TBODY_TAG = "tbody";

    public static final Object CONST_TR_TAG = "tr";

    public static final Object CONST_TD_TAG = "td";

    public static final Object CONST_TH_TAG = "th";

    public static final Object CONST_UL_TAG = "ul";

    public static final Object CONST_LI_TAG = "li";

    public static final Object CONST_H_TAG = "h";

    public static final Object CONST_B_TAG = "b";

    public static final Object CONST_I_TAG = "i";

    public static final Object CONST_TITLE_TAG = "title";

    public static final Object CONST_FORM_TAG = "form";

    public static final Object CONST_INPUT_TAG = "input";

    public static final Object CONST_LABEL_TAG = "label";

    public static final Object CONST_class = "Faker\\Provider\\HtmlLorem";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\HtmlLorem")
                    .setLookup(
                            HtmlLorem.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "idGenerator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/HtmlLorem.php")
                    .addExtendsClass("Faker\\Provider\\Base")
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

    private enum SwitchEnumType9 {
        INTEGER_1,
        INTEGER_2,
        INTEGER_3,
        INTEGER_4,
        INTEGER_5,
        INTEGER_6,
        INTEGER_7,
        INTEGER_8,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
