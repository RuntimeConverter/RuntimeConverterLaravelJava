package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.LinkStub;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.CutStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/DOMCaster.php

*/

public class DOMCaster extends RuntimeClassBase {

    public DOMCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DOMCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\DOMCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "e", typeHint = "DOMException")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castException(RuntimeEnv env, Object... args) {
            Object e = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object k = null;
            k = toStringR(Caster.CONST_PREFIX_PROTECTED, env) + "code";
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, a, env, k))
                    && ZVal.toBool(
                            arrayActionR(
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
                                                    .VarDumper
                                                    .namespaces
                                                    .Caster
                                                    .classes
                                                    .DOMCaster
                                                    .RequestStaticProperties
                                                    .class,
                                            "errorCodes"),
                                    env,
                                    a.arrayGet(env, k)))) {
                a.arrayAccess(env, k)
                        .set(
                                new ConstStub(
                                        env,
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .VarDumper
                                                                .namespaces
                                                                .Caster
                                                                .classes
                                                                .DOMCaster
                                                                .RequestStaticProperties
                                                                .class,
                                                        "errorCodes")
                                                .arrayGet(env, a.arrayGet(env, k)),
                                        a.arrayGet(env, k)));
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castLength(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "length",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("length")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castImplementation(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "Core",
                                            "1.0"),
                                    new ZPair(
                                            toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "XML",
                                            "2.0")));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMNode")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castNode(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "nodeName",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("nodeName")
                                                    .value()),
                                    new ZPair(
                                            "nodeValue",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("nodeValue")
                                                            .value())),
                                    new ZPair(
                                            "nodeType",
                                            new ConstStub(
                                                    env,
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Symfony
                                                                            .namespaces
                                                                            .Component
                                                                            .namespaces
                                                                            .VarDumper
                                                                            .namespaces
                                                                            .Caster
                                                                            .classes
                                                                            .DOMCaster
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "nodeTypes")
                                                            .arrayGet(
                                                                    env,
                                                                    toObjectR(dom)
                                                                            .accessProp(this, env)
                                                                            .name("nodeType")
                                                                            .value()),
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("nodeType")
                                                            .value())),
                                    new ZPair(
                                            "parentNode",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("parentNode")
                                                            .value())),
                                    new ZPair(
                                            "childNodes",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("childNodes")
                                                    .value()),
                                    new ZPair(
                                            "firstChild",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("firstChild")
                                                            .value())),
                                    new ZPair(
                                            "lastChild",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("lastChild")
                                                            .value())),
                                    new ZPair(
                                            "previousSibling",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("previousSibling")
                                                            .value())),
                                    new ZPair(
                                            "nextSibling",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("nextSibling")
                                                            .value())),
                                    new ZPair(
                                            "attributes",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("attributes")
                                                    .value()),
                                    new ZPair(
                                            "ownerDocument",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("ownerDocument")
                                                            .value())),
                                    new ZPair(
                                            "namespaceURI",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("namespaceURI")
                                                    .value()),
                                    new ZPair(
                                            "prefix",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("prefix")
                                                    .value()),
                                    new ZPair(
                                            "localName",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("localName")
                                                    .value()),
                                    new ZPair(
                                            "baseURI",
                                            toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("baseURI")
                                                            .getBool()
                                                    ? new LinkStub(
                                                            env,
                                                            toObjectR(dom)
                                                                    .accessProp(this, env)
                                                                    .name("baseURI")
                                                                    .value())
                                                    : toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("baseURI")
                                                            .value()),
                                    new ZPair(
                                            "textContent",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("textContent")
                                                            .value()))));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMNameSpaceNode")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castNameSpaceNode(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "nodeName",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("nodeName")
                                                    .value()),
                                    new ZPair(
                                            "nodeValue",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("nodeValue")
                                                            .value())),
                                    new ZPair(
                                            "nodeType",
                                            new ConstStub(
                                                    env,
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Symfony
                                                                            .namespaces
                                                                            .Component
                                                                            .namespaces
                                                                            .VarDumper
                                                                            .namespaces
                                                                            .Caster
                                                                            .classes
                                                                            .DOMCaster
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "nodeTypes")
                                                            .arrayGet(
                                                                    env,
                                                                    toObjectR(dom)
                                                                            .accessProp(this, env)
                                                                            .name("nodeType")
                                                                            .value()),
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("nodeType")
                                                            .value())),
                                    new ZPair(
                                            "prefix",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("prefix")
                                                    .value()),
                                    new ZPair(
                                            "localName",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("localName")
                                                    .value()),
                                    new ZPair(
                                            "namespaceURI",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("namespaceURI")
                                                    .value()),
                                    new ZPair(
                                            "ownerDocument",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("ownerDocument")
                                                            .value())),
                                    new ZPair(
                                            "parentNode",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("parentNode")
                                                            .value()))));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocument")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(
            index = 4,
            name = "filter",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object castDocument(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, true);
            if (null == filter) {
                filter = 0;
            }
            Object formatOutput = null;
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "doctype",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("doctype")
                                                    .value()),
                                    new ZPair(
                                            "implementation",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("implementation")
                                                    .value()),
                                    new ZPair(
                                            "documentElement",
                                            new CutStub(
                                                    env,
                                                    toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("documentElement")
                                                            .value())),
                                    new ZPair(
                                            "actualEncoding",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("actualEncoding")
                                                    .value()),
                                    new ZPair(
                                            "encoding",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("encoding")
                                                    .value()),
                                    new ZPair(
                                            "xmlEncoding",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("xmlEncoding")
                                                    .value()),
                                    new ZPair(
                                            "standalone",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("standalone")
                                                    .value()),
                                    new ZPair(
                                            "xmlStandalone",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("xmlStandalone")
                                                    .value()),
                                    new ZPair(
                                            "version",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("version")
                                                    .value()),
                                    new ZPair(
                                            "xmlVersion",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("xmlVersion")
                                                    .value()),
                                    new ZPair(
                                            "strictErrorChecking",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("strictErrorChecking")
                                                    .value()),
                                    new ZPair(
                                            "documentURI",
                                            toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("documentURI")
                                                            .getBool()
                                                    ? new LinkStub(
                                                            env,
                                                            toObjectR(dom)
                                                                    .accessProp(this, env)
                                                                    .name("documentURI")
                                                                    .value())
                                                    : toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("documentURI")
                                                            .value()),
                                    new ZPair(
                                            "config",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("config")
                                                    .value()),
                                    new ZPair(
                                            "formatOutput",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("formatOutput")
                                                    .value()),
                                    new ZPair(
                                            "validateOnParse",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("validateOnParse")
                                                    .value()),
                                    new ZPair(
                                            "resolveExternals",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("resolveExternals")
                                                    .value()),
                                    new ZPair(
                                            "preserveWhiteSpace",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("preserveWhiteSpace")
                                                    .value()),
                                    new ZPair(
                                            "recover",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("recover")
                                                    .value()),
                                    new ZPair(
                                            "substituteEntities",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("substituteEntities")
                                                    .value())));
            if (!ZVal.isTrue(ZVal.toLong(filter) & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE))) {
                formatOutput =
                        ZVal.assign(
                                toObjectR(dom).accessProp(this, env).name("formatOutput").value());
                toObjectR(dom).accessProp(this, env).name("formatOutput").set(true);
                a =
                        ZAssignment.add(
                                "+=",
                                a,
                                ZVal.newArray(
                                        new ZPair(
                                                toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "xml",
                                                env.callMethod(dom, "saveXML", DOMCaster.class))));
                toObjectR(dom).accessProp(this, env).name("formatOutput").set(formatOutput);
            }

            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMCharacterData")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castCharacterData(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "data",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("data")
                                                    .value()),
                                    new ZPair(
                                            "length",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("length")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMAttr")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castAttr(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "name",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value()),
                                    new ZPair(
                                            "specified",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("specified")
                                                    .value()),
                                    new ZPair(
                                            "value",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("value")
                                                    .value()),
                                    new ZPair(
                                            "ownerElement",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("ownerElement")
                                                    .value()),
                                    new ZPair(
                                            "schemaTypeInfo",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("schemaTypeInfo")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMElement")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castElement(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "tagName",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("tagName")
                                                    .value()),
                                    new ZPair(
                                            "schemaTypeInfo",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("schemaTypeInfo")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMText")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castText(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "wholeText",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("wholeText")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMTypeinfo")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castTypeinfo(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "typeName",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("typeName")
                                                    .value()),
                                    new ZPair(
                                            "typeNamespace",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("typeNamespace")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDomError")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castDomError(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "severity",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("severity")
                                                    .value()),
                                    new ZPair(
                                            "message",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("message")
                                                    .value()),
                                    new ZPair(
                                            "type",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("type")
                                                    .value()),
                                    new ZPair(
                                            "relatedException",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("relatedException")
                                                    .value()),
                                    new ZPair(
                                            "related_data",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("related_data")
                                                    .value()),
                                    new ZPair(
                                            "location",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("location")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMLocator")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castLocator(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "lineNumber",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("lineNumber")
                                                    .value()),
                                    new ZPair(
                                            "columnNumber",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("columnNumber")
                                                    .value()),
                                    new ZPair(
                                            "offset",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("offset")
                                                    .value()),
                                    new ZPair(
                                            "relatedNode",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("relatedNode")
                                                    .value()),
                                    new ZPair(
                                            "uri",
                                            toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("uri")
                                                            .getBool()
                                                    ? new LinkStub(
                                                            env,
                                                            toObjectR(dom)
                                                                    .accessProp(this, env)
                                                                    .name("uri")
                                                                    .value(),
                                                            toObjectR(dom)
                                                                    .accessProp(this, env)
                                                                    .name("lineNumber")
                                                                    .value())
                                                    : toObjectR(dom)
                                                            .accessProp(this, env)
                                                            .name("uri")
                                                            .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocumentType")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castDocumentType(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "name",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value()),
                                    new ZPair(
                                            "entities",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("entities")
                                                    .value()),
                                    new ZPair(
                                            "notations",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("notations")
                                                    .value()),
                                    new ZPair(
                                            "publicId",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("publicId")
                                                    .value()),
                                    new ZPair(
                                            "systemId",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("systemId")
                                                    .value()),
                                    new ZPair(
                                            "internalSubset",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("internalSubset")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMNotation")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castNotation(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "publicId",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("publicId")
                                                    .value()),
                                    new ZPair(
                                            "systemId",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("systemId")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMEntity")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castEntity(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "publicId",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("publicId")
                                                    .value()),
                                    new ZPair(
                                            "systemId",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("systemId")
                                                    .value()),
                                    new ZPair(
                                            "notationName",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("notationName")
                                                    .value()),
                                    new ZPair(
                                            "actualEncoding",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("actualEncoding")
                                                    .value()),
                                    new ZPair(
                                            "encoding",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("encoding")
                                                    .value()),
                                    new ZPair(
                                            "version",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("version")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMProcessingInstruction")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castProcessingInstruction(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "target",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("target")
                                                    .value()),
                                    new ZPair(
                                            "data",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("data")
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMXPath")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castXPath(RuntimeEnv env, Object... args) {
            Object dom = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            "document",
                                            toObjectR(dom)
                                                    .accessProp(this, env)
                                                    .name("document")
                                                    .value())));
            return ZVal.assign(a);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object errorCodes =
                ZVal.newArray(
                        new ZPair(0, "DOM_PHP_ERR"),
                        new ZPair(1, "DOM_INDEX_SIZE_ERR"),
                        new ZPair(2, "DOMSTRING_SIZE_ERR"),
                        new ZPair(3, "DOM_HIERARCHY_REQUEST_ERR"),
                        new ZPair(4, "DOM_WRONG_DOCUMENT_ERR"),
                        new ZPair(5, "DOM_INVALID_CHARACTER_ERR"),
                        new ZPair(6, "DOM_NO_DATA_ALLOWED_ERR"),
                        new ZPair(7, "DOM_NO_MODIFICATION_ALLOWED_ERR"),
                        new ZPair(8, "DOM_NOT_FOUND_ERR"),
                        new ZPair(9, "DOM_NOT_SUPPORTED_ERR"),
                        new ZPair(10, "DOM_INUSE_ATTRIBUTE_ERR"),
                        new ZPair(11, "DOM_INVALID_STATE_ERR"),
                        new ZPair(12, "DOM_SYNTAX_ERR"),
                        new ZPair(13, "DOM_INVALID_MODIFICATION_ERR"),
                        new ZPair(14, "DOM_NAMESPACE_ERR"),
                        new ZPair(15, "DOM_INVALID_ACCESS_ERR"),
                        new ZPair(16, "DOM_VALIDATION_ERR"));

        public Object nodeTypes =
                ZVal.newArray(
                        new ZPair(1, "XML_ELEMENT_NODE"),
                        new ZPair(2, "XML_ATTRIBUTE_NODE"),
                        new ZPair(3, "XML_TEXT_NODE"),
                        new ZPair(4, "XML_CDATA_SECTION_NODE"),
                        new ZPair(5, "XML_ENTITY_REF_NODE"),
                        new ZPair(6, "XML_ENTITY_NODE"),
                        new ZPair(7, "XML_PI_NODE"),
                        new ZPair(8, "XML_COMMENT_NODE"),
                        new ZPair(9, "XML_DOCUMENT_NODE"),
                        new ZPair(10, "XML_DOCUMENT_TYPE_NODE"),
                        new ZPair(11, "XML_DOCUMENT_FRAG_NODE"),
                        new ZPair(12, "XML_NOTATION_NODE"),
                        new ZPair(13, "XML_HTML_DOCUMENT_NODE"),
                        new ZPair(14, "XML_DTD_NODE"),
                        new ZPair(15, "XML_ELEMENT_DECL_NODE"),
                        new ZPair(16, "XML_ATTRIBUTE_DECL_NODE"),
                        new ZPair(17, "XML_ENTITY_DECL_NODE"),
                        new ZPair(18, "XML_NAMESPACE_DECL_NODE"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\DOMCaster")
                    .setLookup(
                            DOMCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("errorCodes", "nodeTypes")
                    .setFilename("vendor/symfony/var-dumper/Caster/DOMCaster.php")
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
