package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/LuaScripts.php

*/

public class LuaScripts extends RuntimeClassBase {

    public LuaScripts(RuntimeEnv env, Object... args) {
        super(env);
    }

    public LuaScripts(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Queue\\LuaScripts";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object size(RuntimeEnv env, Object... args) {
            return "return redis.call('llen', KEYS[1]) + redis.call('zcard', KEYS[2]) + redis.call('zcard', KEYS[3])";
        }

        @ConvertedMethod
        public Object pop(RuntimeEnv env, Object... args) {
            return "-- Pop the first job off of the queue...\nlocal job = redis.call('lpop', KEYS[1])\nlocal reserved = false\n\nif(job ~= false) then\n    -- Increment the attempt count and place job on the reserved queue...\n    reserved = cjson.decode(job)\n    reserved['attempts'] = reserved['attempts'] + 1\n    reserved = cjson.encode(reserved)\n    redis.call('zadd', KEYS[2], ARGV[1], reserved)\nend\n\nreturn {job, reserved}";
        }

        @ConvertedMethod
        public Object release(RuntimeEnv env, Object... args) {
            return "-- Remove the job from the current queue...\nredis.call('zrem', KEYS[2], ARGV[1])\n\n-- Add the job onto the \"delayed\" queue...\nredis.call('zadd', KEYS[1], ARGV[2], ARGV[1])\n\nreturn true";
        }

        @ConvertedMethod
        public Object migrateExpiredJobs(RuntimeEnv env, Object... args) {
            return "-- Get all of the jobs with an expired \"score\"...\nlocal val = redis.call('zrangebyscore', KEYS[1], '-inf', ARGV[1])\n\n-- If we have values in the array, we will remove them from the first queue\n-- and add them onto the destination queue in chunks of 100, which moves\n-- all of the appropriate jobs onto the destination queue very safely.\nif(next(val) ~= nil) then\n    redis.call('zremrangebyrank', KEYS[1], 0, #val - 1)\n\n    for i = 1, #val, 100 do\n        redis.call('rpush', KEYS[2], unpack(val, i, math.min(i+99, #val)))\n    end\nend\n\nreturn val";
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\LuaScripts")
                    .setLookup(
                            LuaScripts.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/LuaScripts.php")
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
