package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes.StoreInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/HttpCache/Store.php

*/

public class Store extends RuntimeClassBase implements StoreInterface {

    public Object root = null;

    public Object keyCache = null;

    public Object locks = null;

    public Store(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Store.class) {
            this.__construct(env, args);
        }
    }

    public Store(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        this.root = root;
        if (ZVal.toBool(
                        ZVal.toBool(!function_file_exists.f.env(env).call(this.root).getBool())
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                NamespaceGlobal.mkdir
                                                        .env(env)
                                                        .call(this.root, 511, true)
                                                        .value())))
                && ZVal.toBool(!function_is_dir.f.env(env).call(this.root).getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Unable to create the store directory (%s).", this.root)
                                    .value()));
        }

        this.keyCache = new SplObjectStorage(env);
        this.locks = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object cleanup(RuntimeEnv env, Object... args) {
        Object lock = null;
        for (ZPair zpairResult1962 : ZVal.getIterable(this.locks, env, true)) {
            lock = ZVal.assign(zpairResult1962.getValue());
            NamespaceGlobal.flock.env(env).call(lock, 3);
            function_fclose.f.env(env).call(lock);
        }

        this.locks = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object lock(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object path = null;
        Object h = null;
        Object key = null;
        key = this.getCacheKey(env, request);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "locks", env), env, key)) {
            path = this.getPath(env, key);
            if (ZVal.toBool(
                            ZVal.toBool(
                                            !function_file_exists
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_dirname
                                                                    .f
                                                                    .env(env)
                                                                    .call(path)
                                                                    .value())
                                                    .getBool())
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    false,
                                                    "===",
                                                    NamespaceGlobal.mkdir
                                                            .env(env)
                                                            .call(
                                                                    function_dirname
                                                                            .f
                                                                            .env(env)
                                                                            .call(path)
                                                                            .value(),
                                                                    511,
                                                                    true)
                                                            .value())))
                    && ZVal.toBool(
                            !function_is_dir
                                    .f
                                    .env(env)
                                    .call(function_dirname.f.env(env).call(path).value())
                                    .getBool())) {
                return ZVal.assign(path);
            }

            h = function_fopen.f.env(env).call(path, "cb").value();
            if (!NamespaceGlobal.flock
                    .env(env)
                    .call(h, ZVal.toLong(2) | ZVal.toLong(4))
                    .getBool()) {
                function_fclose.f.env(env).call(h);
                return ZVal.assign(path);
            }

            new ReferenceClassProperty(this, "locks", env).arrayAccess(env, key).set(h);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object unlock(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object key = null;
        key = this.getCacheKey(env, request);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "locks", env), env, key)) {
            NamespaceGlobal.flock
                    .env(env)
                    .call(new ReferenceClassProperty(this, "locks", env).arrayGet(env, key), 3);
            function_fclose
                    .f
                    .env(env)
                    .call(new ReferenceClassProperty(this, "locks", env).arrayGet(env, key));
            arrayActionR(
                    ArrayAction.UNSET, new ReferenceClassProperty(this, "locks", env), env, key);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object isLocked(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object path = null;
        Object h = null;
        ReferenceContainer wouldBlock = new BasicReferenceContainer(null);
        Object key = null;
        key = this.getCacheKey(env, request);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "locks", env), env, key)) {
            return ZVal.assign(true);
        }

        if (!function_file_exists.f.env(env).call(path = this.getPath(env, key)).getBool()) {
            return ZVal.assign(false);
        }

        h = function_fopen.f.env(env).call(path, "rb").value();
        NamespaceGlobal.flock
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, wouldBlock))
                .call(h, ZVal.toLong(2) | ZVal.toLong(4), wouldBlock.getObject());
        NamespaceGlobal.flock.env(env).call(h, 3);
        function_fclose.f.env(env).call(h);
        return ZVal.assign(ZVal.toBool(wouldBlock.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object lookup(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object request = assignParameter(args, 0, false);
        ReferenceContainer entry = new BasicReferenceContainer(null);
        ReferenceContainer headers = new BasicReferenceContainer(null);
        Object entries = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        Object body = null;
        Object key = null;
        key = this.getCacheKey(env, request);
        if (!ZVal.isTrue(entries = this.getMetadata(env, key))) {
            return null;
        }

        match.setObject(ZVal.getNull());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1963 : ZVal.getIterable(entries, env, true)) {
            entry.setObject(ZVal.assign(zpairResult1963.getValue()));
            if (ZVal.isTrue(
                    this.requestsMatch(
                            env,
                            arrayActionR(ArrayAction.ISSET, entry, env, 1, "vary", 0)
                                    ? NamespaceGlobal.implode
                                            .env(env)
                                            .call(", ", entry.arrayGet(env, 1, "vary"))
                                            .value()
                                    : "",
                            env.callMethod(
                                    toObjectR(request)
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "all",
                                    Store.class),
                            entry.arrayGet(env, 0)))) {
                match.setObject(ZVal.assign(entry.getObject()));
                break;
            }
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", match.getObject())) {
            return null;
        }

        headers.setObject(ZVal.assign(match.arrayGet(env, 1)));
        if (function_file_exists
                .f
                .env(env)
                .call(body = this.getPath(env, headers.arrayGet(env, "x-content-digest", 0)))
                .getBool()) {
            return ZVal.assign(this.restoreResponse(env, headers.getObject(), body));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object write(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        ReferenceContainer entry = new BasicReferenceContainer(null);
        ReferenceContainer headers = new BasicReferenceContainer(null);
        ReferenceContainer entries = new BasicReferenceContainer(null);
        Object vary = null;
        Object digest = null;
        Object storedEnv = null;
        Object key = null;
        key = this.getCacheKey(env, request);
        storedEnv = this.persistRequest(env, request);
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "has",
                        Store.class,
                        "X-Content-Digest"))) {
            digest = this.generateContentDigest(env, response);
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    this.save(env, digest, env.callMethod(response, "getContent", Store.class)))) {
                throw ZVal.getException(
                        env, new RuntimeException(env, "Unable to store the entity."));
            }

            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    Store.class,
                    "X-Content-Digest",
                    digest);
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(response).accessProp(this, env).name("headers").value(),
                            "has",
                            Store.class,
                            "Transfer-Encoding"))) {
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "set",
                        Store.class,
                        "Content-Length",
                        function_strlen
                                .f
                                .env(env)
                                .call(env.callMethod(response, "getContent", Store.class))
                                .value());
            }
        }

        entries.setObject(ZVal.newArray());
        vary =
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "get",
                        Store.class,
                        "vary");
        for (ZPair zpairResult1964 : ZVal.getIterable(this.getMetadata(env, key), env, true)) {
            entry.setObject(ZVal.assign(zpairResult1964.getValue()));
            if (!arrayActionR(ArrayAction.ISSET, entry, env, 1, "vary", 0)) {
                entry.arrayAccess(env, 1, "vary").set(ZVal.arrayFromList(""));
            }

            if (ZVal.toBool(ZVal.notEqualityCheck(entry.arrayGet(env, 1, "vary", 0), vary))
                    || ZVal.toBool(
                            !ZVal.isTrue(
                                    this.requestsMatch(
                                            env, vary, entry.arrayGet(env, 0), storedEnv)))) {
                entries.arrayAppend(env).set(entry.getObject());
            }
        }

        headers.setObject(this.persistResponse(env, response));
        arrayActionR(ArrayAction.UNSET, headers, env, "age");
        function_array_unshift
                .f
                .env(env)
                .call(
                        entries.getObject(),
                        ZVal.newArray(new ZPair(0, storedEnv), new ZPair(1, headers.getObject())));
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                this.save(
                        env,
                        key,
                        function_serialize.f.env(env).call(entries.getObject()).value()))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unable to store the metadata."));
        }

        return ZVal.assign(key);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    protected Object generateContentDigest(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        return ZVal.assign(
                "en"
                        + toStringR(
                                NamespaceGlobal.hash
                                        .env(env)
                                        .call(
                                                "sha256",
                                                env.callMethod(response, "getContent", Store.class))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object invalidate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        ReferenceContainer entry = new BasicReferenceContainer(null);
        ReferenceContainer entries = new BasicReferenceContainer(null);
        Object response = null;
        Object modified = null;
        Object key = null;
        modified = false;
        key = this.getCacheKey(env, request);
        entries.setObject(ZVal.newArray());
        for (ZPair zpairResult1965 : ZVal.getIterable(this.getMetadata(env, key), env, true)) {
            entry.setObject(ZVal.assign(zpairResult1965.getValue()));
            response = this.restoreResponse(env, entry.arrayGet(env, 1));
            if (ZVal.isTrue(env.callMethod(response, "isFresh", Store.class))) {
                env.callMethod(response, "expire", Store.class);
                modified = true;
                entries.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, entry.arrayGet(env, 0)),
                                        new ZPair(1, this.persistResponse(env, response))));

            } else {
                entries.arrayAppend(env).set(entry.getObject());
            }
        }

        if (ZVal.toBool(modified)
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                false,
                                "===",
                                this.save(
                                        env,
                                        key,
                                        function_serialize
                                                .f
                                                .env(env)
                                                .call(entries.getObject())
                                                .value())))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unable to store the metadata."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "vary")
    @ConvertedParameter(index = 1, name = "env1")
    @ConvertedParameter(index = 2, name = "env2")
    private Object requestsMatch(RuntimeEnv env, Object... args) {
        Object vary = assignParameter(args, 0, false);
        ReferenceContainer env1 = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer env2 = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object header = null;
        Object v1 = null;
        Object v2 = null;
        Object key = null;
        if (ZVal.isEmpty(vary)) {
            return ZVal.assign(true);
        }

        for (ZPair zpairResult1966 :
                ZVal.getIterable(
                        NamespaceGlobal.preg_split.env(env).call("/[\\s,]+/", vary).value(),
                        env,
                        true)) {
            header = ZVal.assign(zpairResult1966.getValue());
            key =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "_",
                                    "-",
                                    NamespaceGlobal.strtolower.env(env).call(header).value())
                            .value();
            v1 =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, env1, env, key)
                                    ? env1.arrayGet(env, key)
                                    : ZVal.getNull());
            v2 =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, env2, env, key)
                                    ? env2.arrayGet(env, key)
                                    : ZVal.getNull());
            if (ZVal.strictNotEqualityCheck(v1, "!==", v2)) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    private Object getMetadata(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object entries = null;
        if (!ZVal.isTrue(entries = this.load(env, key))) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(function_unserialize.f.env(env).call(entries).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object purge(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        Object http = null;
        Object purgedHttps = null;
        Object https = null;
        Object purgedHttp = null;
        http = function_preg_replace.f.env(env).call("#^https:#", "http:", url).value();
        https = function_preg_replace.f.env(env).call("#^http:#", "https:", url).value();
        purgedHttp = this.doPurge(env, http);
        purgedHttps = this.doPurge(env, https);
        return ZVal.assign(ZVal.toBool(purgedHttp) || ZVal.toBool(purgedHttps));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    private Object doPurge(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        Object path = null;
        Object key = null;
        key = this.getCacheKey(env, Request.runtimeStaticObject.create(env, url));
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "locks", env), env, key)) {
            NamespaceGlobal.flock
                    .env(env)
                    .call(new ReferenceClassProperty(this, "locks", env).arrayGet(env, key), 3);
            function_fclose
                    .f
                    .env(env)
                    .call(new ReferenceClassProperty(this, "locks", env).arrayGet(env, key));
            arrayActionR(
                    ArrayAction.UNSET, new ReferenceClassProperty(this, "locks", env), env, key);
        }

        if (function_file_exists.f.env(env).call(path = this.getPath(env, key)).getBool()) {
            NamespaceGlobal.unlink.env(env).call(path);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    private Object load(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object path = null;
        path = this.getPath(env, key);
        return ZVal.assign(
                function_file_exists.f.env(env).call(path).getBool()
                        ? function_file_get_contents.f.env(env).call(path).value()
                        : false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "data")
    private Object save(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object path = null;
        Object len = null;
        Object fp = null;
        Object tmpFile = null;
        path = this.getPath(env, key);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "locks", env), env, key)) {
            fp = ZVal.assign(new ReferenceClassProperty(this, "locks", env).arrayGet(env, key));
            NamespaceGlobal.ftruncate.env(env).call(fp, 0).value();
            NamespaceGlobal.fseek.env(env).call(fp, 0).value();
            len = function_fwrite.f.env(env).call(fp, data).value();
            if (ZVal.strictNotEqualityCheck(
                    function_strlen.f.env(env).call(data).value(), "!==", len)) {
                NamespaceGlobal.ftruncate.env(env).call(fp, 0).value();
                return ZVal.assign(false);
            }

        } else {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            !function_file_exists
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_dirname
                                                                    .f
                                                                    .env(env)
                                                                    .call(path)
                                                                    .value())
                                                    .getBool())
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    false,
                                                    "===",
                                                    NamespaceGlobal.mkdir
                                                            .env(env)
                                                            .call(
                                                                    function_dirname
                                                                            .f
                                                                            .env(env)
                                                                            .call(path)
                                                                            .value(),
                                                                    511,
                                                                    true)
                                                            .value())))
                    && ZVal.toBool(
                            !function_is_dir
                                    .f
                                    .env(env)
                                    .call(function_dirname.f.env(env).call(path).value())
                                    .getBool())) {
                return ZVal.assign(false);
            }

            tmpFile =
                    NamespaceGlobal.tempnam
                            .env(env)
                            .call(
                                    function_dirname.f.env(env).call(path).value(),
                                    NamespaceGlobal.basename.env(env).call(path).value())
                            .value();
            if (ZVal.strictEqualityCheck(
                    false, "===", fp = function_fopen.f.env(env).call(tmpFile, "wb").value())) {
                NamespaceGlobal.unlink.env(env).call(tmpFile).value();
                return ZVal.assign(false);
            }

            function_fwrite.f.env(env).call(fp, data).value();
            function_fclose.f.env(env).call(fp).value();
            if (ZVal.notEqualityCheck(
                    data, function_file_get_contents.f.env(env).call(tmpFile).value())) {
                NamespaceGlobal.unlink.env(env).call(tmpFile).value();
                return ZVal.assign(false);
            }

            if (ZVal.strictEqualityCheck(
                    false, "===", NamespaceGlobal.rename.env(env).call(tmpFile, path).value())) {
                NamespaceGlobal.unlink.env(env).call(tmpFile).value();
                return ZVal.assign(false);
            }
        }

        NamespaceGlobal.chmod
                .env(env)
                .call(
                        path,
                        ZVal.toLong(438)
                                & ZVal.toLong(
                                        ~ZVal.toLong(
                                                NamespaceGlobal.umask.env(env).call().value())))
                .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getPath(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(this.root, env)
                        + toStringR("/", env)
                        + toStringR(function_substr.f.env(env).call(key, 0, 2).value(), env)
                        + toStringR("/", env)
                        + toStringR(function_substr.f.env(env).call(key, 2, 2).value(), env)
                        + toStringR("/", env)
                        + toStringR(function_substr.f.env(env).call(key, 4, 2).value(), env)
                        + toStringR("/", env)
                        + toStringR(function_substr.f.env(env).call(key, 6).value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    protected Object generateCacheKey(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                "md"
                        + toStringR(
                                NamespaceGlobal.hash
                                        .env(env)
                                        .call(
                                                "sha256",
                                                env.callMethod(request, "getUri", Store.class))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object getCacheKey(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "keyCache", env),
                env,
                request)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "keyCache", env).arrayGet(env, request));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "keyCache", env)
                        .arrayAccess(env, request)
                        .set(this.generateCacheKey(env, request)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object persistRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("headers").value(),
                        "all",
                        Store.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    private Object persistResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        ReferenceContainer headers = new BasicReferenceContainer(null);
        headers.setObject(
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "all",
                        Store.class));
        headers.arrayAccess(env, "X-Status")
                .set(
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        env.callMethod(response, "getStatusCode", Store.class))));
        return ZVal.assign(headers.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers")
    @ConvertedParameter(
        index = 1,
        name = "body",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object restoreResponse(RuntimeEnv env, Object... args) {
        ReferenceContainer headers = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object body = assignParameter(args, 1, true);
        if (null == body) {
            body = ZVal.getNull();
        }
        Object status = null;
        status = ZVal.assign(headers.arrayGet(env, "X-Status", 0));
        arrayActionR(ArrayAction.UNSET, headers, env, "X-Status");
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", body)) {
            headers.arrayAccess(env, "X-Body-File").set(ZVal.newArray(new ZPair(0, body)));
        }

        return ZVal.assign(new Response(env, body, status, headers.getObject()));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\HttpCache\\Store";

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
                    .setName("Symfony\\Component\\HttpKernel\\HttpCache\\Store")
                    .setLookup(
                            Store.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("keyCache", "locks", "root")
                    .setFilename("vendor/symfony/http-kernel/HttpCache/Store.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpCache\\StoreInterface")
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
