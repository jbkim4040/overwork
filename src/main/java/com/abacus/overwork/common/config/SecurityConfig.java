package com.abacus.overwork.common.config;



//@Configuration
//@EnableWebSecurity
public class SecurityConfig {//extends WebSecurityConfigurerAdapter {

//    protected void config (HttpSecurity http) throws Exception{
//        http
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated();
//
//        /** 테스트를 위한 임시 csrf 인증 방지처리 */
//        http
//                .csrf()
//                .ignoringAntMatchers("/user/**")
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//
//
//        http
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/")
//                .failureUrl("/login")
//                .usernameParameter("userId")
//                .passwordParameter("passwd")
//                .loginProcessingUrl("/login_proc")
//                .successHandler(new AuthenticationSuccessHandler() {
//                    @Override
//                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                        System.out.println("authentication :: " + authentication.getName());
//                        response.sendRedirect("/");
//                    }
//                })
//                .failureHandler(new AuthenticationFailureHandler() {
//                    @Override
//                    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
//                        System.out.println("exception :: " + exception.getMessage());
//                        response.sendRedirect("/login");
//                    }
//                })
//                .permitAll()
//        ;
//
//    }
}
