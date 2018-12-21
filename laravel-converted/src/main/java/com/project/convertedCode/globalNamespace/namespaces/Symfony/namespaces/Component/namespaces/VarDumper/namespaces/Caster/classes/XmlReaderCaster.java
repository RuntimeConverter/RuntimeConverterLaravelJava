package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.LinkStub;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.xml.XMLReader;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/XmlReaderCaster.php

*/

public class XmlReaderCaster extends RuntimeClassBase {

    public XmlReaderCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public XmlReaderCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Caster\\XmlReaderCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "reader", typeHint = "XMLReader")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castXmlReader(RuntimeEnv env, Object... args) {
            Object reader = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            ReferenceContainer count = new BasicReferenceContainer(null);
            Object props = null;
            ReferenceContainer info = new BasicReferenceContainer(null);
            props = toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "parserProperties";
            info.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "localName",
                                    toObjectR(reader)
                                            .accessProp(this, env)
                                            .name("localName")
                                            .value()),
                            new ZPair(
                                    "prefix",
                                    toObjectR(reader).accessProp(this, env).name("prefix").value()),
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
                                                                    .XmlReaderCaster
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "nodeTypes")
                                                    .arrayGet(
                                                            env,
                                                            toObjectR(reader)
                                                                    .accessProp(this, env)
                                                                    .name("nodeType")
                                                                    .value()),
                                            toObjectR(reader)
                                                    .accessProp(this, env)
                                                    .name("nodeType")
                                                    .value())),
                            new ZPair(
                                    "depth",
                                    toObjectR(reader).accessProp(this, env).name("depth").value()),
                            new ZPair(
                                    "isDefault",
                                    toObjectR(reader)
                                            .accessProp(this, env)
                                            .name("isDefault")
                                            .value()),
                            new ZPair(
                                    "isEmptyElement",
                                    ZVal.strictEqualityCheck(
                                                    0,
                                                    "===",
                                                    toObjectR(reader)
                                                            .accessProp(this, env)
                                                            .name("nodeType")
                                                            .value())
                                            ? ZVal.getNull()
                                            : toObjectR(reader)
                                                    .accessProp(this, env)
                                                    .name("isEmptyElement")
                                                    .value()),
                            new ZPair(
                                    "xmlLang",
                                    toObjectR(reader)
                                            .accessProp(this, env)
                                            .name("xmlLang")
                                            .value()),
                            new ZPair(
                                    "attributeCount",
                                    toObjectR(reader)
                                            .accessProp(this, env)
                                            .name("attributeCount")
                                            .value()),
                            new ZPair(
                                    "value",
                                    toObjectR(reader).accessProp(this, env).name("value").value()),
                            new ZPair(
                                    "namespaceURI",
                                    toObjectR(reader)
                                            .accessProp(this, env)
                                            .name("namespaceURI")
                                            .value()),
                            new ZPair(
                                    "baseURI",
                                    toObjectR(reader)
                                                    .accessProp(this, env)
                                                    .name("baseURI")
                                                    .getBool()
                                            ? new LinkStub(
                                                    env,
                                                    toObjectR(reader)
                                                            .accessProp(this, env)
                                                            .name("baseURI")
                                                            .value())
                                            : toObjectR(reader)
                                                    .accessProp(this, env)
                                                    .name("baseURI")
                                                    .value()),
                            new ZPair(
                                    props,
                                    ZVal.newArray(
                                            new ZPair(
                                                    "LOADDTD",
                                                    env.callMethod(
                                                            reader,
                                                            "getParserProperty",
                                                            XmlReaderCaster.class,
                                                            1)),
                                            new ZPair(
                                                    "DEFAULTATTRS",
                                                    env.callMethod(
                                                            reader,
                                                            "getParserProperty",
                                                            XmlReaderCaster.class,
                                                            2)),
                                            new ZPair(
                                                    "VALIDATE",
                                                    env.callMethod(
                                                            reader,
                                                            "getParserProperty",
                                                            XmlReaderCaster.class,
                                                            3)),
                                            new ZPair(
                                                    "SUBST_ENTITIES",
                                                    env.callMethod(
                                                            reader,
                                                            "getParserProperty",
                                                            XmlReaderCaster.class,
                                                            4))))));
            if (ZVal.isTrue(
                    info.arrayAccess(env, props)
                            .set(
                                    Caster.runtimeStaticObject.filter(
                                            env,
                                            new RuntimeArgsWithReferences().add(3, count),
                                            info.arrayGet(env, props),
                                            Caster.CONST_EXCLUDE_EMPTY,
                                            ZVal.newArray(),
                                            count.getObject())))) {
                info.arrayAccess(env, props).set(new EnumStub(env, info.arrayGet(env, props)));
                toObjectR(info.arrayGet(env, props))
                        .accessProp(this, env)
                        .name("cut")
                        .set(count.getObject());
            }

            info.setObject(
                    Caster.runtimeStaticObject.filter(
                            env,
                            new RuntimeArgsWithReferences().add(3, count),
                            info.getObject(),
                            Caster.CONST_EXCLUDE_EMPTY,
                            ZVal.newArray(),
                            count.getObject()));
            toObjectR(stub)
                    .accessProp(this, env)
                    .name("cut")
                    .set(
                            ZAssignment.add(
                                    "+=",
                                    toObjectR(stub).accessProp(this, env).name("cut").value(),
                                    ZVal.add(count.getObject(), 2)));
            return ZVal.assign(ZVal.add(a, info.getObject()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object nodeTypes =
                ZVal.newArray(
                        new ZPair(0, "NONE"),
                        new ZPair(1, "ELEMENT"),
                        new ZPair(2, "ATTRIBUTE"),
                        new ZPair(3, "TEXT"),
                        new ZPair(4, "CDATA"),
                        new ZPair(5, "ENTITY_REF"),
                        new ZPair(6, "ENTITY"),
                        new ZPair(7, "PI (Processing Instruction)"),
                        new ZPair(8, "COMMENT"),
                        new ZPair(9, "DOC"),
                        new ZPair(10, "DOC_TYPE"),
                        new ZPair(11, "DOC_FRAGMENT"),
                        new ZPair(12, "NOTATION"),
                        new ZPair(13, "WHITESPACE"),
                        new ZPair(14, "SIGNIFICANT_WHITESPACE"),
                        new ZPair(15, "END_ELEMENT"),
                        new ZPair(16, "END_ENTITY"),
                        new ZPair(17, "XML_DECLARATION"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\XmlReaderCaster")
                    .setLookup(
                            XmlReaderCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("nodeTypes")
                    .setFilename("vendor/symfony/var-dumper/Caster/XmlReaderCaster.php")
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
