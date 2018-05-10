package com.tr1nks.interfaces.annotations;

import java.lang.annotation.*;

/**
 * Created by Tr1nks on 14.06.2017.
 */
@Target(value = ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
@Documented
public @interface MemberMethod {
}
