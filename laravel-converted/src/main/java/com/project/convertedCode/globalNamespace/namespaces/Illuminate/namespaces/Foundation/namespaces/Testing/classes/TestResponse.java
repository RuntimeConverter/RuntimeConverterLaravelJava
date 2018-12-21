package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.dd;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.namespaces.Constraints.classes.SeeInOrder;
import com.project.convertedCode.globalNamespace.functions.data_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.View.classes.View;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/TestResponse.php

*/

public class TestResponse extends RuntimeClassBase {

    public Object baseResponse = null;

    public TestResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestResponse.class) {
            this.__construct(env, args);
        }
    }

    public TestResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        this.baseResponse = response;
        return null;
    }

    @ConvertedMethod
    public Object assertSuccessful(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(this, "isSuccessful", TestResponse.class),
                "Response status code ["
                        + toStringR(env.callMethod(this, "getStatusCode", TestResponse.class), env)
                        + "] is not a successful status code.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object assertOk(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(this, "isOk", TestResponse.class),
                "Response status code ["
                        + toStringR(env.callMethod(this, "getStatusCode", TestResponse.class), env)
                        + "] does not match expected 200 status code.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object assertNotFound(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(this, "isNotFound", TestResponse.class),
                "Response status code ["
                        + toStringR(env.callMethod(this, "getStatusCode", TestResponse.class), env)
                        + "] is not a not found status code.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object assertForbidden(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(this, "isForbidden", TestResponse.class),
                "Response status code ["
                        + toStringR(env.callMethod(this, "getStatusCode", TestResponse.class), env)
                        + "] is not a forbidden status code.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "status")
    public Object assertStatus(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, false);
        Object actual = null;
        actual = env.callMethod(this, "getStatusCode", TestResponse.class);
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(actual, "===", status),
                "Expected status code "
                        + toStringR(status, env)
                        + " but received "
                        + toStringR(actual, env)
                        + ".");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "uri",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertRedirect(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, true);
        if (null == uri) {
            uri = ZVal.getNull();
        }
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(this, "isRedirect", TestResponse.class),
                "Response status code ["
                        + toStringR(env.callMethod(this, "getStatusCode", TestResponse.class), env)
                        + "] is not a redirect status code.");
        if (!function_is_null.f.env(env).call(uri).getBool()) {
            this.assertLocation(env, uri);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headerName")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertHeader(RuntimeEnv env, Object... args) {
        Object headerName = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object actual = null;
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("headers").value(),
                        "has",
                        TestResponse.class,
                        headerName),
                "Header [" + toStringR(headerName, env) + "] not present on response.");
        actual =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("headers").value(),
                        "get",
                        TestResponse.class,
                        headerName);
        if (!function_is_null.f.env(env).call(value).getBool()) {
            Assert.runtimeStaticObject.assertEquals(
                    env,
                    value,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("headers").value(),
                            "get",
                            TestResponse.class,
                            headerName),
                    "Header ["
                            + toStringR(headerName, env)
                            + "] was found, but value ["
                            + toStringR(actual, env)
                            + "] does not match ["
                            + toStringR(value, env)
                            + "].");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headerName")
    public Object assertHeaderMissing(RuntimeEnv env, Object... args) {
        Object headerName = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertFalse(
                env,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("headers").value(),
                        "has",
                        TestResponse.class,
                        headerName),
                "Unexpected header [" + toStringR(headerName, env) + "] is present on response.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    public Object assertLocation(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertEquals(
                env,
                env.callMethod(app.f.env(env).call("url").value(), "to", TestResponse.class, uri),
                env.callMethod(
                        app.f.env(env).call("url").value(),
                        "to",
                        TestResponse.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("headers").value(),
                                "get",
                                TestResponse.class,
                                "Location")));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookieName")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertPlainCookie(RuntimeEnv env, Object... args) {
        Object cookieName = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        this.assertCookie(env, cookieName, value, false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookieName")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "encrypted",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object assertCookie(RuntimeEnv env, Object... args) {
        Object cookieName = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object encrypted = assignParameter(args, 2, true);
        if (null == encrypted) {
            encrypted = true;
        }
        Object actual = null;
        Object cookie = null;
        Object cookieValue = null;
        Assert.runtimeStaticObject.assertNotNull(
                env,
                cookie = this.getCookie(env, cookieName),
                "Cookie [" + toStringR(cookieName, env) + "] not present on response.");
        if (ZVal.toBool(!ZVal.isTrue(cookie))
                || ZVal.toBool(function_is_null.f.env(env).call(value).value())) {
            return ZVal.assign(this);
        }

        cookieValue = env.callMethod(cookie, "getValue", TestResponse.class);
        actual =
                ZVal.assign(
                        ZVal.isTrue(encrypted)
                                ? env.callMethod(
                                        app.f.env(env).call("encrypter").value(),
                                        "decrypt",
                                        TestResponse.class,
                                        cookieValue)
                                : cookieValue);
        Assert.runtimeStaticObject.assertEquals(
                env,
                value,
                actual,
                "Cookie ["
                        + toStringR(cookieName, env)
                        + "] was found, but value ["
                        + toStringR(actual, env)
                        + "] does not match ["
                        + toStringR(value, env)
                        + "].");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookieName")
    public Object assertCookieExpired(RuntimeEnv env, Object... args) {
        Object cookieName = assignParameter(args, 0, false);
        Object cookie = null;
        Object expiresAt = null;
        Assert.runtimeStaticObject.assertNotNull(
                env,
                cookie = this.getCookie(env, cookieName),
                "Cookie [" + toStringR(cookieName, env) + "] not present on response.");
        expiresAt =
                Carbon.runtimeStaticObject.createFromTimestamp(
                        env, env.callMethod(cookie, "getExpiresTime", TestResponse.class));
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(
                        expiresAt,
                        "lessThan",
                        TestResponse.class,
                        Carbon.runtimeStaticObject.now(env)),
                "Cookie ["
                        + toStringR(cookieName, env)
                        + "] is not expired, it expires at ["
                        + toStringR(expiresAt, env)
                        + "].");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookieName")
    public Object assertCookieNotExpired(RuntimeEnv env, Object... args) {
        Object cookieName = assignParameter(args, 0, false);
        Object cookie = null;
        Object expiresAt = null;
        Assert.runtimeStaticObject.assertNotNull(
                env,
                cookie = this.getCookie(env, cookieName),
                "Cookie [" + toStringR(cookieName, env) + "] not present on response.");
        expiresAt =
                Carbon.runtimeStaticObject.createFromTimestamp(
                        env, env.callMethod(cookie, "getExpiresTime", TestResponse.class));
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(
                        expiresAt,
                        "greaterThan",
                        TestResponse.class,
                        Carbon.runtimeStaticObject.now(env)),
                "Cookie ["
                        + toStringR(cookieName, env)
                        + "] is expired, it expired at ["
                        + toStringR(expiresAt, env)
                        + "].");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookieName")
    public Object assertCookieMissing(RuntimeEnv env, Object... args) {
        Object cookieName = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertNull(
                env,
                this.getCookie(env, cookieName),
                "Cookie [" + toStringR(cookieName, env) + "] is present on response.");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cookieName")
    protected Object getCookie(RuntimeEnv env, Object... args) {
        Object cookieName = assignParameter(args, 0, false);
        Object cookie = null;
        for (ZPair zpairResult446 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("headers").value(),
                                "getCookies",
                                TestResponse.class),
                        env,
                        true)) {
            cookie = ZVal.assign(zpairResult446.getValue());
            if (ZVal.strictEqualityCheck(
                    env.callMethod(cookie, "getName", TestResponse.class), "===", cookieName)) {
                return ZVal.assign(cookie);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object assertSee(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertContains(
                env, toStringR(value, env), env.callMethod(this, "getContent", TestResponse.class));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object assertSeeInOrder(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertThat(
                env,
                values,
                new SeeInOrder(env, env.callMethod(this, "getContent", TestResponse.class)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object assertSeeText(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertContains(
                env,
                toStringR(value, env),
                NamespaceGlobal.strip_tags
                        .env(env)
                        .call(env.callMethod(this, "getContent", TestResponse.class))
                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object assertSeeTextInOrder(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertThat(
                env,
                values,
                new SeeInOrder(
                        env,
                        NamespaceGlobal.strip_tags
                                .env(env)
                                .call(env.callMethod(this, "getContent", TestResponse.class))
                                .value()));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object assertDontSee(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertNotContains(
                env, toStringR(value, env), env.callMethod(this, "getContent", TestResponse.class));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object assertDontSeeText(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertNotContains(
                env,
                toStringR(value, env),
                NamespaceGlobal.strip_tags
                        .env(env)
                        .call(env.callMethod(this, "getContent", TestResponse.class))
                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "strict",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object assertJson(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object strict = assignParameter(args, 1, true);
        if (null == strict) {
            strict = false;
        }
        Assert.runtimeStaticObject.assertArraySubset(
                env, data, this.decodeResponseJson(env), strict, this.assertJsonMessage(env, data));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    protected Object assertJsonMessage(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object actual = null;
        Object expected = null;
        expected =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(data, ZVal.toLong(128) | ZVal.toLong(64))
                        .value();
        actual =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(this.decodeResponseJson(env), ZVal.toLong(128) | ZVal.toLong(64))
                        .value();
        return ZVal.assign(
                "Unable to find JSON: "
                        + toStringR("\n", env)
                        + toStringR("\n", env)
                        + toStringR("[" + toStringR(expected, env) + "]", env)
                        + toStringR("\n", env)
                        + toStringR("\n", env)
                        + "within response JSON:"
                        + toStringR("\n", env)
                        + toStringR("\n", env)
                        + toStringR("[" + toStringR(actual, env) + "].", env)
                        + toStringR("\n", env)
                        + toStringR("\n", env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object assertExactJson(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object actual = null;
        actual =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.sortRecursive(
                                        env, rToArrayCast(this.decodeResponseJson(env))))
                        .value();
        Assert.runtimeStaticObject.assertEquals(
                env,
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(Arr.runtimeStaticObject.sortRecursive(env, data))
                        .value(),
                actual);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object assertJsonFragment(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object actual = null;
        Object expected = null;
        Object value = null;
        Object key = null;
        actual =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.sortRecursive(
                                        env, rToArrayCast(this.decodeResponseJson(env))))
                        .value();
        for (ZPair zpairResult447 :
                ZVal.getIterable(Arr.runtimeStaticObject.sortRecursive(env, data), env, false)) {
            key = ZVal.assign(zpairResult447.getKey());
            value = ZVal.assign(zpairResult447.getValue());
            expected =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.json_encode
                                            .env(env)
                                            .call(ZVal.newArray(new ZPair(key, value)))
                                            .value(),
                                    1,
                                    -1)
                            .value();
            Assert.runtimeStaticObject.assertTrue(
                    env,
                    Str.runtimeStaticObject.contains(env, actual, expected),
                    "Unable to find JSON fragment: "
                            + toStringR("\n", env)
                            + toStringR("\n", env)
                            + toStringR("[" + toStringR(expected, env) + "]", env)
                            + toStringR("\n", env)
                            + toStringR("\n", env)
                            + "within"
                            + toStringR("\n", env)
                            + toStringR("\n", env)
                            + toStringR("[" + toStringR(actual, env) + "].", env));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "exact",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object assertJsonMissing(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object exact = assignParameter(args, 1, true);
        if (null == exact) {
            exact = false;
        }
        Object actual = null;
        Object unexpected = null;
        Object value = null;
        Object key = null;
        if (ZVal.isTrue(exact)) {
            return ZVal.assign(this.assertJsonMissingExact(env, data));
        }

        actual =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.sortRecursive(
                                        env, rToArrayCast(this.decodeResponseJson(env))))
                        .value();
        for (ZPair zpairResult448 :
                ZVal.getIterable(Arr.runtimeStaticObject.sortRecursive(env, data), env, false)) {
            key = ZVal.assign(zpairResult448.getKey());
            value = ZVal.assign(zpairResult448.getValue());
            unexpected =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.json_encode
                                            .env(env)
                                            .call(ZVal.newArray(new ZPair(key, value)))
                                            .value(),
                                    1,
                                    -1)
                            .value();
            Assert.runtimeStaticObject.assertFalse(
                    env,
                    Str.runtimeStaticObject.contains(env, actual, unexpected),
                    "Found unexpected JSON fragment: "
                            + toStringR("\n", env)
                            + toStringR("\n", env)
                            + toStringR("[" + toStringR(unexpected, env) + "]", env)
                            + toStringR("\n", env)
                            + toStringR("\n", env)
                            + "within"
                            + toStringR("\n", env)
                            + toStringR("\n", env)
                            + toStringR("[" + toStringR(actual, env) + "].", env));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object assertJsonMissingExact(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object actual = null;
        Object unexpected = null;
        Object value = null;
        Object key = null;
        actual =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.sortRecursive(
                                        env, rToArrayCast(this.decodeResponseJson(env))))
                        .value();
        for (ZPair zpairResult449 :
                ZVal.getIterable(Arr.runtimeStaticObject.sortRecursive(env, data), env, false)) {
            key = ZVal.assign(zpairResult449.getKey());
            value = ZVal.assign(zpairResult449.getValue());
            unexpected =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.json_encode
                                            .env(env)
                                            .call(ZVal.newArray(new ZPair(key, value)))
                                            .value(),
                                    1,
                                    -1)
                            .value();
            if (!ZVal.isTrue(Str.runtimeStaticObject.contains(env, actual, unexpected))) {
                return ZVal.assign(this);
            }
        }

        Assert.runtimeStaticObject.fail(
                env,
                "Found unexpected JSON fragment: "
                        + toStringR("\n", env)
                        + toStringR("\n", env)
                        + "["
                        + toStringR(NamespaceGlobal.json_encode.env(env).call(data).value(), env)
                        + "]"
                        + toStringR("\n", env)
                        + toStringR("\n", env)
                        + "within"
                        + toStringR("\n", env)
                        + toStringR("\n", env)
                        + toStringR("[" + toStringR(actual, env) + "].", env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "structure",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "responseData",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertJsonStructure(RuntimeEnv env, Object... args) {
        ReferenceContainer structure = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == structure.getObject()) {
            structure.setObject(ZVal.getNull());
        }
        ReferenceContainer responseData =
                new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == responseData.getObject()) {
            responseData.setObject(ZVal.getNull());
        }
        Object responseDataItem = null;
        Object value = null;
        Object key = null;
        if (function_is_null.f.env(env).call(structure.getObject()).getBool()) {
            return ZVal.assign(this.assertJson(env, this.json(env)));
        }

        if (function_is_null.f.env(env).call(responseData.getObject()).getBool()) {
            responseData.setObject(this.decodeResponseJson(env));
        }

        for (ZPair zpairResult450 : ZVal.getIterable(structure.getObject(), env, false)) {
            key = ZVal.assign(zpairResult450.getKey());
            value = ZVal.assign(zpairResult450.getValue());
            if (ZVal.toBool(function_is_array.f.env(env).call(value).value())
                    && ZVal.toBool(ZVal.strictEqualityCheck(key, "===", "*"))) {
                Assert.runtimeStaticObject.assertInternalType(
                        env, "array", responseData.getObject());
                for (ZPair zpairResult451 : ZVal.getIterable(responseData.getObject(), env, true)) {
                    responseDataItem = ZVal.assign(zpairResult451.getValue());
                    this.assertJsonStructure(env, structure.arrayGet(env, "*"), responseDataItem);
                }

            } else if (function_is_array.f.env(env).call(value).getBool()) {
                Assert.runtimeStaticObject.assertArrayHasKey(env, key, responseData.getObject());
                this.assertJsonStructure(
                        env, structure.arrayGet(env, key), responseData.arrayGet(env, key));

            } else {
                Assert.runtimeStaticObject.assertArrayHasKey(env, value, responseData.getObject());
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertJsonCount(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        if (ZVal.isTrue(key)) {
            Assert.runtimeStaticObject.assertCount(
                    env,
                    count,
                    data_get.f.env(env).call(this.json(env), key).value(),
                    "Failed to assert that the response count matched the expected "
                            + toStringR(count, env));
            return ZVal.assign(this);
        }

        Assert.runtimeStaticObject.assertCount(
                env,
                count,
                this.json(env),
                "Failed to assert that the response count matched the expected "
                        + toStringR(count, env));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object assertJsonValidationErrors(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer errors = new BasicReferenceContainer(null);
        Object key = null;
        errors.setObject(
                ZVal.assign(handleReturnReference(this.json(env)).arrayGet(env, "errors")));
        for (ZPair zpairResult452 :
                ZVal.getIterable(Arr.runtimeStaticObject.wrap(env, keys), env, true)) {
            key = ZVal.assign(zpairResult452.getValue());
            Assert.runtimeStaticObject.assertTrue(
                    env,
                    arrayActionR(ArrayAction.ISSET, errors, env, key),
                    "Failed to find a validation error in the response for key: '"
                            + toStringR(key, env)
                            + "'");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object assertJsonMissingValidationErrors(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer json = new BasicReferenceContainer(null);
        ReferenceContainer errors = new BasicReferenceContainer(null);
        Object key = null;
        json.setObject(this.json(env));
        if (!function_array_key_exists.f.env(env).call("errors", json.getObject()).getBool()) {
            Assert.runtimeStaticObject.assertArrayNotHasKey(env, "errors", json.getObject());
            return ZVal.assign(this);
        }

        errors.setObject(ZVal.assign(json.arrayGet(env, "errors")));
        for (ZPair zpairResult453 :
                ZVal.getIterable(Arr.runtimeStaticObject.wrap(env, keys), env, true)) {
            key = ZVal.assign(zpairResult453.getValue());
            Assert.runtimeStaticObject.assertFalse(
                    env,
                    arrayActionR(ArrayAction.ISSET, errors, env, key),
                    "Found unexpected validation error for key: '" + toStringR(key, env) + "'");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object decodeResponseJson(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object decodedResponse = null;
        decodedResponse =
                NamespaceGlobal.json_decode
                        .env(env)
                        .call(env.callMethod(this, "getContent", TestResponse.class), true)
                        .value();
        if (ZVal.toBool(function_is_null.f.env(env).call(decodedResponse).value())
                || ZVal.toBool(ZVal.strictEqualityCheck(decodedResponse, "===", false))) {
            if (toObjectR(this).accessProp(this, env).name("exception").getBool()) {
                throw ZVal.getException(
                        env, toObjectR(this).accessProp(this, env).name("exception").value());

            } else {
                Assert.runtimeStaticObject.fail(env, "Invalid JSON was returned from the route.");
            }
        }

        return ZVal.assign(data_get.f.env(env).call(decodedResponse, key).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object json(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        return ZVal.assign(this.decodeResponseJson(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object assertViewIs(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.ensureResponseHasView(env);
        Assert.runtimeStaticObject.assertEquals(
                env,
                value,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("original").value(),
                        "getName",
                        TestResponse.class));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertViewHas(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (function_is_array.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.assertViewHasAll(env, key));
        }

        this.ensureResponseHasView(env);
        if (function_is_null.f.env(env).call(value).getBool()) {
            Assert.runtimeStaticObject.assertArrayHasKey(
                    env,
                    key,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("original").value(),
                            "getData",
                            TestResponse.class));

        } else if (ZVal.isTrue(ZVal.checkInstanceType(value, Closure.class, "Closure"))) {
            Assert.runtimeStaticObject.assertTrue(
                    env,
                    env.callFunctionDynamic(
                                    value,
                                    new RuntimeArgsWithReferences()
                                            .add(
                                                    0,
                                                    new ReferenceClassProperty(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("original")
                                                                    .value(),
                                                            key,
                                                            env)),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("original")
                                            .getObject()
                                            .accessProp(this, env)
                                            .name(key)
                                            .value())
                            .value());

        } else {
            Assert.runtimeStaticObject.assertEquals(
                    env,
                    value,
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("original")
                            .getObject()
                            .accessProp(this, env)
                            .name(key)
                            .value());
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    public Object assertViewHasAll(RuntimeEnv env, Object... args) {
        Object bindings = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult454 : ZVal.getIterable(bindings, env, false)) {
            key = ZVal.assign(zpairResult454.getKey());
            value = ZVal.assign(zpairResult454.getValue());
            if (function_is_int.f.env(env).call(key).getBool()) {
                this.assertViewHas(env, value);

            } else {
                this.assertViewHas(env, key, value);
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object assertViewMissing(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        this.ensureResponseHasView(env);
        Assert.runtimeStaticObject.assertArrayNotHasKey(
                env,
                key,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("original").value(),
                        "getData",
                        TestResponse.class));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object ensureResponseHasView(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(!ZVal.isset(toObjectR(this).accessProp(this, env).name("original").value()))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("original")
                                                .value(),
                                        View.class,
                                        "Illuminate\\Contracts\\View\\View")))) {
            return ZVal.assign(Assert.runtimeStaticObject.fail(env, "The response is not a view."));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertSessionHas(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (function_is_array.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.assertSessionHasAll(env, key));
        }

        if (function_is_null.f.env(env).call(value).getBool()) {
            Assert.runtimeStaticObject.assertTrue(
                    env,
                    env.callMethod(this.session(env), "has", TestResponse.class, key),
                    "Session is missing expected key [" + toStringR(key, env) + "].");

        } else {
            Assert.runtimeStaticObject.assertEquals(
                    env, value, env.callMethod(this.session(env), "get", TestResponse.class, key));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    public Object assertSessionHasAll(RuntimeEnv env, Object... args) {
        Object bindings = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult455 : ZVal.getIterable(bindings, env, false)) {
            key = ZVal.assign(zpairResult455.getKey());
            value = ZVal.assign(zpairResult455.getValue());
            if (function_is_int.f.env(env).call(key).getBool()) {
                this.assertSessionHas(env, value);

            } else {
                this.assertSessionHas(env, key, value);
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 1,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "errorBag")
    public Object assertSessionHasErrors(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, true);
        if (null == keys) {
            keys = ZVal.newArray();
        }
        Object format = assignParameter(args, 1, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        Object errorBag = assignParameter(args, 2, true);
        if (null == errorBag) {
            errorBag = "default";
        }
        Object value = null;
        Object errors = null;
        Object key = null;
        this.assertSessionHas(env, "errors");
        keys = ZVal.assign(rToArrayCast(keys));
        errors =
                env.callMethod(
                        env.callMethod(this.session(env), "get", TestResponse.class, "errors"),
                        "getBag",
                        TestResponse.class,
                        errorBag);
        for (ZPair zpairResult456 : ZVal.getIterable(keys, env, false)) {
            key = ZVal.assign(zpairResult456.getKey());
            value = ZVal.assign(zpairResult456.getValue());
            if (function_is_int.f.env(env).call(key).getBool()) {
                Assert.runtimeStaticObject.assertTrue(
                        env,
                        env.callMethod(errors, "has", TestResponse.class, value),
                        "Session missing error: " + toStringR(value, env));

            } else {
                Assert.runtimeStaticObject.assertContains(
                        env, value, env.callMethod(errors, "get", TestResponse.class, key, format));
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object assertSessionHasNoErrors(RuntimeEnv env, Object... args) {
        this.assertSessionMissing(env, "errors");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorBag")
    @ConvertedParameter(index = 1, name = "keys", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertSessionHasErrorsIn(RuntimeEnv env, Object... args) {
        Object errorBag = assignParameter(args, 0, false);
        Object keys = assignParameter(args, 1, true);
        if (null == keys) {
            keys = ZVal.newArray();
        }
        Object format = assignParameter(args, 2, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        return ZVal.assign(this.assertSessionHasErrors(env, keys, format, errorBag));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object assertSessionMissing(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = null;
        if (function_is_array.f.env(env).call(key).getBool()) {
            for (ZPair zpairResult457 : ZVal.getIterable(key, env, true)) {
                value = ZVal.assign(zpairResult457.getValue());
                this.assertSessionMissing(env, value);
            }

        } else {
            Assert.runtimeStaticObject.assertFalse(
                    env,
                    env.callMethod(this.session(env), "has", TestResponse.class, key),
                    "Session has unexpected key [" + toStringR(key, env) + "].");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object session(RuntimeEnv env, Object... args) {
        return ZVal.assign(app.f.env(env).call("session.store").value());
    }

    @ConvertedMethod
    public Object dump(RuntimeEnv env, Object... args) {
        Object json = null;
        Object content = null;
        content = env.callMethod(this, "getContent", TestResponse.class);
        json = NamespaceGlobal.json_decode.env(env).call(content).value();
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.json_last_error.env(env).call().value(), "===", 0)) {
            content = ZVal.assign(json);
        }

        dd.f.env(env).call(content);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(toObjectR(this.baseResponse).accessProp(this, env).name(key).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isset(toObjectR(this.baseResponse).accessProp(this, env).name(key).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ___args = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, TestResponse.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this, "macroCall", TestResponse.class, method.getObject(), ___args));
        }

        return ZVal.assign(
                env.callMethod(
                        this.baseResponse,
                        new RuntimeArgsWithReferences(),
                        toStringR(method.getObject(), env),
                        TestResponse.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(___args))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Testing\\TestResponse";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "response")
        public Object fromBaseResponse(RuntimeEnv env, Object... args) {
            Object response = assignParameter(args, 0, false);
            return ZVal.assign(env.createNewWithLateStaticBindings(this, response));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Foundation
                                    .namespaces
                                    .Testing
                                    .classes
                                    .TestResponse
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            TestResponse.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2316 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2316.getValue());
                env.callMethod(method, "setAccessible", TestResponse.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, TestResponse.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", TestResponse.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Foundation
                                            .namespaces
                                            .Testing
                                            .classes
                                            .TestResponse
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, TestResponse.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Foundation
                                                    .namespaces
                                                    .Testing
                                                    .classes
                                                    .TestResponse
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Foundation
                                                                        .namespaces
                                                                        .Testing
                                                                        .classes
                                                                        .TestResponse
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Foundation
                                                            .namespaces
                                                            .Testing
                                                            .classes
                                                            .TestResponse
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Testing\\TestResponse")
                    .setLookup(
                            TestResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("baseResponse")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Testing/TestResponse.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
