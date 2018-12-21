package com.project.convertedCode.includes.config;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.App;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Schema;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Artisan;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Hash;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Bus.classes.BusServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Route;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Cookie;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.MailServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.classes.RedisServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Providers.classes.RouteServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Log;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Lang;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Crypt;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Blade;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes.BroadcastServiceProvider;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Providers.classes.EventServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Storage;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.classes.ViewServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Providers.classes.AppServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.File;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Cache;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.NotificationServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Config;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Gate;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.DatabaseServiceProvider;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Notification;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.URL;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pipeline.classes.PipelineServiceProvider;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.PaginationServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Broadcast;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Encryption.classes.EncryptionServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Auth;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Providers.classes.ConsoleSupportServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.SessionServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Queue;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Password;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Translation.classes.TranslationServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Bus;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Request;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.FilesystemServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Redis;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Redirect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes.HashServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.View;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.CacheServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Response;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Mail;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.ValidationServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Providers.classes.FoundationServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.QueueServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes.PasswordResetServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Event;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.classes.CookieServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.DB;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Validator;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Session;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/app.php

*/

public class file_app_php implements RuntimeIncludable {

    public static final file_app_php instance = new file_app_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope201 scope = new Scope201();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope201 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "name",
                                        ___env.f.env(env).call("APP_NAME", "Laravel").value()),
                                new ZPair(
                                        "env",
                                        ___env.f.env(env).call("APP_ENV", "production").value()),
                                new ZPair(
                                        "debug",
                                        ___env.f.env(env).call("APP_DEBUG", false).value()),
                                new ZPair(
                                        "url",
                                        ___env.f
                                                .env(env)
                                                .call("APP_URL", "http://localhost")
                                                .value()),
                                new ZPair("timezone", "UTC"),
                                new ZPair("locale", "en"),
                                new ZPair("fallback_locale", "en"),
                                new ZPair("key", "12345678901234567890123456789012"),
                                new ZPair("cipher", "AES-256-CBC"),
                                new ZPair(
                                        "providers",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Auth
                                                                .classes
                                                                .AuthServiceProvider
                                                                .CONST_class),
                                                new ZPair(1, BroadcastServiceProvider.CONST_class),
                                                new ZPair(2, BusServiceProvider.CONST_class),
                                                new ZPair(3, CacheServiceProvider.CONST_class),
                                                new ZPair(
                                                        4,
                                                        ConsoleSupportServiceProvider.CONST_class),
                                                new ZPair(5, CookieServiceProvider.CONST_class),
                                                new ZPair(6, DatabaseServiceProvider.CONST_class),
                                                new ZPair(7, EncryptionServiceProvider.CONST_class),
                                                new ZPair(8, FilesystemServiceProvider.CONST_class),
                                                new ZPair(9, FoundationServiceProvider.CONST_class),
                                                new ZPair(10, HashServiceProvider.CONST_class),
                                                new ZPair(11, MailServiceProvider.CONST_class),
                                                new ZPair(
                                                        12,
                                                        NotificationServiceProvider.CONST_class),
                                                new ZPair(
                                                        13, PaginationServiceProvider.CONST_class),
                                                new ZPair(14, PipelineServiceProvider.CONST_class),
                                                new ZPair(15, QueueServiceProvider.CONST_class),
                                                new ZPair(16, RedisServiceProvider.CONST_class),
                                                new ZPair(
                                                        17,
                                                        PasswordResetServiceProvider.CONST_class),
                                                new ZPair(18, SessionServiceProvider.CONST_class),
                                                new ZPair(
                                                        19, TranslationServiceProvider.CONST_class),
                                                new ZPair(
                                                        20, ValidationServiceProvider.CONST_class),
                                                new ZPair(21, ViewServiceProvider.CONST_class),
                                                new ZPair(22, AppServiceProvider.CONST_class),
                                                new ZPair(
                                                        23,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .App
                                                                .namespaces
                                                                .Providers
                                                                .classes
                                                                .AuthServiceProvider
                                                                .CONST_class),
                                                new ZPair(24, EventServiceProvider.CONST_class),
                                                new ZPair(25, RouteServiceProvider.CONST_class))),
                                new ZPair(
                                        "aliases",
                                        ZVal.newArray(
                                                new ZPair("App", App.CONST_class),
                                                new ZPair("Artisan", Artisan.CONST_class),
                                                new ZPair("Auth", Auth.CONST_class),
                                                new ZPair("Blade", Blade.CONST_class),
                                                new ZPair("Broadcast", Broadcast.CONST_class),
                                                new ZPair("Bus", Bus.CONST_class),
                                                new ZPair("Cache", Cache.CONST_class),
                                                new ZPair("Config", Config.CONST_class),
                                                new ZPair("Cookie", Cookie.CONST_class),
                                                new ZPair("Crypt", Crypt.CONST_class),
                                                new ZPair("DB", DB.CONST_class),
                                                new ZPair("Eloquent", Model.CONST_class),
                                                new ZPair("Event", Event.CONST_class),
                                                new ZPair("File", File.CONST_class),
                                                new ZPair("Gate", Gate.CONST_class),
                                                new ZPair("Hash", Hash.CONST_class),
                                                new ZPair("Lang", Lang.CONST_class),
                                                new ZPair("Log", Log.CONST_class),
                                                new ZPair("Mail", Mail.CONST_class),
                                                new ZPair("Notification", Notification.CONST_class),
                                                new ZPair("Password", Password.CONST_class),
                                                new ZPair("Queue", Queue.CONST_class),
                                                new ZPair("Redirect", Redirect.CONST_class),
                                                new ZPair("Redis", Redis.CONST_class),
                                                new ZPair("Request", Request.CONST_class),
                                                new ZPair("Response", Response.CONST_class),
                                                new ZPair("Route", Route.CONST_class),
                                                new ZPair("Schema", Schema.CONST_class),
                                                new ZPair("Session", Session.CONST_class),
                                                new ZPair("Storage", Storage.CONST_class),
                                                new ZPair("URL", URL.CONST_class),
                                                new ZPair("Validator", Validator.CONST_class),
                                                new ZPair("View", View.CONST_class))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/app.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope201 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
