package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileObject;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplDoublyLinkedList;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.misc.ArrayObject;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.LinkStub;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.CutArrayStub;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ClassStub;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/SplCaster.php

*/

public class SplCaster extends RuntimeClassBase {

    public SplCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SplCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\SplCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ArrayObject")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castArrayObject(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            return ZVal.assign(runtimeStaticObject.castSplArray(env, c, a, stub, isNested));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ArrayIterator")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castArrayIterator(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            return ZVal.assign(runtimeStaticObject.castSplArray(env, c, a, stub, isNested));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "Iterator")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castHeap(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "heap",
                                            NamespaceGlobal.iterator_to_array
                                                    .env(env)
                                                    .call(((RuntimeClassInterface) c).phpClone(env))
                                                    .value())));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "SplDoublyLinkedList")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castDoublyLinkedList(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object mode = null;
            Object prefix = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            mode = env.callMethod(c, "getIteratorMode", SplCaster.class);
            env.callMethod(
                    c,
                    "setIteratorMode",
                    SplCaster.class,
                    ZVal.toLong(0) | ZVal.toLong(ZVal.toLong(mode) & ZVal.toLong(~ZVal.toLong(1))));
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "mode",
                                            new ConstStub(
                                                    env,
                                                    toStringR(
                                                                    ZVal.isTrue(
                                                                                    ZVal.toLong(
                                                                                                    mode)
                                                                                            & ZVal
                                                                                                    .toLong(
                                                                                                            2))
                                                                            ? "IT_MODE_LIFO"
                                                                            : "IT_MODE_FIFO",
                                                                    env)
                                                            + " | "
                                                            + toStringR(
                                                                    ZVal.isTrue(
                                                                                    ZVal.toLong(
                                                                                                    mode)
                                                                                            & ZVal
                                                                                                    .toLong(
                                                                                                            1))
                                                                            ? "IT_MODE_DELETE"
                                                                            : "IT_MODE_KEEP",
                                                                    env),
                                                    mode)),
                                    new ZPair(
                                            toStringR(prefix, env) + "dllist",
                                            NamespaceGlobal.iterator_to_array
                                                    .env(env)
                                                    .call(c)
                                                    .value())));
            env.callMethod(c, "setIteratorMode", SplCaster.class, mode);
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "SplFileInfo")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castFileInfo(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object e = null;
            Object prefix = null;
            Object accessor = null;
            ReferenceContainer map = new BasicReferenceContainer(null);
            ReferenceContainer mapDate = new BasicReferenceContainer(null);
            Object key = null;
            map =
                    env.getInlineStatic(
                            39,
                            ZVal.newArray(
                                    new ZPair("path", "getPath"),
                                    new ZPair("filename", "getFilename"),
                                    new ZPair("basename", "getBasename"),
                                    new ZPair("pathname", "getPathname"),
                                    new ZPair("extension", "getExtension"),
                                    new ZPair("realPath", "getRealPath"),
                                    new ZPair("aTime", "getATime"),
                                    new ZPair("mTime", "getMTime"),
                                    new ZPair("cTime", "getCTime"),
                                    new ZPair("inode", "getInode"),
                                    new ZPair("size", "getSize"),
                                    new ZPair("perms", "getPerms"),
                                    new ZPair("owner", "getOwner"),
                                    new ZPair("group", "getGroup"),
                                    new ZPair("type", "getType"),
                                    new ZPair("writable", "isWritable"),
                                    new ZPair("readable", "isReadable"),
                                    new ZPair("executable", "isExecutable"),
                                    new ZPair("file", "isFile"),
                                    new ZPair("dir", "isDir"),
                                    new ZPair("link", "isLink"),
                                    new ZPair("linkTarget", "getLinkTarget")));
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            for (ZPair zpairResult2200 : ZVal.getIterable(map.getObject(), env, false)) {
                key = ZVal.assign(zpairResult2200.getKey());
                accessor = ZVal.assign(zpairResult2200.getValue());
                try {
                    a.arrayAccess(env, toStringR(prefix, env) + toStringR(key, env))
                            .set(env.callMethod(c, toStringR(accessor, env), SplCaster.class));
                } catch (ConvertedException convertedException321) {
                    if (convertedException321.instanceOf(PHPException.class, "Exception")) {
                        e = convertedException321.getObject();
                    } else {
                        throw convertedException321;
                    }
                }
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "realPath")) {
                a.arrayAccess(env, toStringR(prefix, env) + "realPath")
                        .set(
                                new LinkStub(
                                        env, a.arrayGet(env, toStringR(prefix, env) + "realPath")));
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "perms")) {
                a.arrayAccess(env, toStringR(prefix, env) + "perms")
                        .set(
                                new ConstStub(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "0%o",
                                                        a.arrayGet(
                                                                env,
                                                                toStringR(prefix, env) + "perms"))
                                                .value(),
                                        a.arrayGet(env, toStringR(prefix, env) + "perms")));
            }

            mapDate = env.getInlineStatic(40, ZVal.arrayFromList("aTime", "mTime", "cTime"));
            for (ZPair zpairResult2201 : ZVal.getIterable(mapDate.getObject(), env, true)) {
                key = ZVal.assign(zpairResult2201.getValue());
                if (arrayActionR(
                        ArrayAction.ISSET, a, env, toStringR(prefix, env) + toStringR(key, env))) {
                    a.arrayAccess(env, toStringR(prefix, env) + toStringR(key, env))
                            .set(
                                    new ConstStub(
                                            env,
                                            function_date
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "Y-m-d H:i:s",
                                                            a.arrayGet(
                                                                    env,
                                                                    toStringR(prefix, env)
                                                                            + toStringR(key, env)))
                                                    .value(),
                                            a.arrayGet(
                                                    env,
                                                    toStringR(prefix, env) + toStringR(key, env))));
                }
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "SplFileObject")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castFileObject(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object e = null;
            Object prefix = null;
            Object accessor = null;
            Object name = null;
            ReferenceContainer map = new BasicReferenceContainer(null);
            Object value = null;
            Object key = null;
            ReferenceContainer flagsArray = new BasicReferenceContainer(null);
            map =
                    env.getInlineStatic(
                            41,
                            ZVal.newArray(
                                    new ZPair("csvControl", "getCsvControl"),
                                    new ZPair("flags", "getFlags"),
                                    new ZPair("maxLineLen", "getMaxLineLen"),
                                    new ZPair("fstat", "fstat"),
                                    new ZPair("eof", "eof"),
                                    new ZPair("key", "key")));
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            for (ZPair zpairResult2202 : ZVal.getIterable(map.getObject(), env, false)) {
                key = ZVal.assign(zpairResult2202.getKey());
                accessor = ZVal.assign(zpairResult2202.getValue());
                try {
                    a.arrayAccess(env, toStringR(prefix, env) + toStringR(key, env))
                            .set(env.callMethod(c, toStringR(accessor, env), SplCaster.class));
                } catch (ConvertedException convertedException322) {
                    if (convertedException322.instanceOf(PHPException.class, "Exception")) {
                        e = convertedException322.getObject();
                    } else {
                        throw convertedException322;
                    }
                }
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "flags")) {
                flagsArray.setObject(ZVal.newArray());
                for (ZPair zpairResult2203 :
                        ZVal.getIterable(
                                env.getRequestStaticProperties(
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
                                                        .SplCaster
                                                        .RequestStaticProperties
                                                        .class)
                                        .splFileObjectFlags,
                                env,
                                false)) {
                    value = ZVal.assign(zpairResult2203.getKey());
                    name = ZVal.assign(zpairResult2203.getValue());
                    if (ZVal.isTrue(
                            ZVal.toLong(a.arrayGet(env, toStringR(prefix, env) + "flags"))
                                    & ZVal.toLong(value))) {
                        flagsArray.arrayAppend(env).set(name);
                    }
                }

                a.arrayAccess(env, toStringR(prefix, env) + "flags")
                        .set(
                                new ConstStub(
                                        env,
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call("|", flagsArray.getObject())
                                                .value(),
                                        a.arrayGet(env, toStringR(prefix, env) + "flags")));
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "fstat")) {
                a.arrayAccess(env, toStringR(prefix, env) + "fstat")
                        .set(
                                new CutArrayStub(
                                        env,
                                        a.arrayGet(env, toStringR(prefix, env) + "fstat"),
                                        ZVal.arrayFromList(
                                                "dev", "ino", "nlink", "rdev", "blksize",
                                                "blocks")));
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "SplFixedArray")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castFixedArray(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "storage",
                                            env.callMethod(c, "toArray", SplCaster.class))));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "SplObjectStorage")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castObjectStorage(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object obj = null;
            Object clone = null;
            ReferenceContainer storage = new BasicReferenceContainer(null);
            storage.setObject(ZVal.newArray());
            arrayActionR(
                    ArrayAction.UNSET,
                    a,
                    env,
                    toStringR(Caster.CONST_PREFIX_DYNAMIC, env) + "\u0000gcdata");
            clone = ZVal.assign(((RuntimeClassInterface) c).phpClone(env));
            for (ZPair zpairResult2204 : ZVal.getIterable(clone, env, true)) {
                obj = ZVal.assign(zpairResult2204.getValue());
                storage.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair("object", obj),
                                        new ZPair(
                                                "info",
                                                env.callMethod(
                                                        clone, "getInfo", SplCaster.class))));
            }

            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "storage",
                                            storage.getObject()))));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "OuterIterator")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castOuterIterator(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "innerIterator")
                    .set(env.callMethod(c, "getInnerIterator", SplCaster.class));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        private Object castSplArray(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            Object flags = null;
            Object _pClass = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            _pClass = ZVal.assign(toObjectR(stub).accessProp(this, env).name("class").value());
            flags = env.callMethod(c, "getFlags", SplCaster.class);
            if (!ZVal.isTrue(ZVal.toLong(flags) & ZVal.toLong(1))) {
                env.callMethod(c, "setFlags", SplCaster.class, 1);
                a.setObject(Caster.runtimeStaticObject.castObject(env, c, _pClass));
                env.callMethod(c, "setFlags", SplCaster.class, flags);
            }

            a.setObject(
                    ZAssignment.add(
                            "+=",
                            a.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "flag::STD_PROP_LIST",
                                            ZVal.toBool(ZVal.toLong(flags) & ZVal.toLong(1))),
                                    new ZPair(
                                            toStringR(prefix, env) + "flag::ARRAY_AS_PROPS",
                                            ZVal.toBool(ZVal.toLong(flags) & ZVal.toLong(2))))));
            if (ZVal.isTrue(ZVal.checkInstanceType(c, ArrayObject.class, "ArrayObject"))) {
                a.arrayAccess(env, toStringR(prefix, env) + "iteratorClass")
                        .set(
                                new ClassStub(
                                        env,
                                        env.callMethod(c, "getIteratorClass", SplCaster.class)));
            }

            a.arrayAccess(env, toStringR(prefix, env) + "storage")
                    .set(env.callMethod(c, "getArrayCopy", SplCaster.class));
            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object splFileObjectFlags =
                ZVal.newArray(
                        new ZPair(1, "DROP_NEW_LINE"),
                        new ZPair(2, "READ_AHEAD"),
                        new ZPair(4, "SKIP_EMPTY"),
                        new ZPair(8, "READ_CSV"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\SplCaster")
                    .setLookup(
                            SplCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("splFileObjectFlags")
                    .setFilename("vendor/symfony/var-dumper/Caster/SplCaster.php")
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
