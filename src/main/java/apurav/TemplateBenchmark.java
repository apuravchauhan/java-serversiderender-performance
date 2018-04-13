package apurav;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

import httl.web.springmvc.HttlViewResolver;

/**
 * 
 * @author apuravchauhan
 *
 */
@SpringBootApplication
@Controller
public class TemplateBenchmark {
    private String longname = "Before getting started, be aware that Sierra has now been superseded by High Sierra, a predictably similar offering but with some key improvements. Read our High Sierra review here. Apple's current Mac operating system is called macOS Sierra, a slight tweak in branding from its Mac OS X predecessors to fit in with the typographical style of iOS, tvOS and watchOS. Sierra has been available to download since September 2016, bringing a raft of new features to the Mac, including the Siri voice-control tech from the iPhone & iPad, and a wide range of system and interface tweaks. Sierra is a free upgrade from El Capitan, the previous OS, so there's no reason not to jump in and grab it, right? Not so fast. You need to check if your Mac is compatible, for one thing, and because it's not easy to go back to an older Mac OS after making the upgrade, it's worth weighing up the changes to your day-to-day user experience. We think you'll want to get Sierra (if so, you'll want to know how to update macOS), but you should always put in some research before making an upgrade like this. So in this article we compare the two products' features, interface and design to help you decide which is a better bet for you. For more information, read our Mac OS X El Capitan review and macOS Sierra review. And if you're interested in the next version of macOS, take a look at our comparison of the features of Sierra and High Sierra. Design & interface Design-wise, El Cap and Sierra are virtually identical. The 'flattened' visuals brought in for Yosemite and retained in El Cap are still present in Sierra. But there are a couple of differences in the user interface of the newer OS. The first and most noticeable: you can use tabs in a wide range of first- and third-party apps, not just your web browser. Apps featuring tabs include Maps, Mail, TextEdit, all three iWork apps and apparently any third-party app that supports multiple windows. macOS Sierra vs Mac OS X El Capitan: Interface In Sierra there's now a picture-in-picture viewing mode, similar to the same-named mode in iOS on the iPad. Picture-in-picture lets you float video from Safari or iTunes in a window over your desktop as you workin Apple's words, and you can pin this video mini-window to one corner of your screen, where it will stay even if you switch Spaces. For more on this, read: How to use Mission Control, Expose, Split Screen & Spaces on the Mac New features The differences between Mac OS X El Capitan and macOS Sierra are largely confined to the features roster - it's what they can do, far more than what they look like. There are lots of new features to consider - take a look at our roundup of new Sierra features for a more comprehensive look - but in this section we'll focus on what we think are the highlights. Siri on the Mac This is the big one. Macs can now be controlled verbally using the Siri voice-recognition engine from the iPad, iPhone, Apple Watch and Apple TV. It was only a matter of time, really - and it's only fair to point out that Windows already has Cortana (and has done since Windows 8.1) - but it's still nice to see. macOS Sierra vs Mac OS X El Capitan: Siri This is particularly useful for searching through documents; you can use natural language to specify various search parameters, and the results sit afterwards in the Notifications pane from where they can be dragged and dropped into applicable apps. We also find it a really quick and easy way to perform tasks you would usually need to go through multiple System Preferences windows to perform. Just say 'Turn on Bluetooth' for example rather than fire up System Preferences. If you want to find out more about what Siri can do on the Mac, read our complete guide to Siri on Mac. macOS Sierra vs Mac OS X El Capitan: Siri Apple Pay on the Mac Apple Pay has jumped from the iOS ecosystem to Mac (via tvOS and watchOS). Most Macs don't have a fingerprint scanner so they can't handle the verification process without using your iPhone or iPad. However, if you have a MacBook Pro with Touch Bar you're in luck. Apple Pay icons now appear on the buy pages of certain merchants - all you need do is verify your purchases with Touch ID on your iPhone, or using your Apple Watch. macOS Sierra vs Mac OS X El Capitan Auto unlock your Mac with your Apple Watch Some Apple fans were hoping that macOS Sierra would bring for the ability to unlock a Mac using the Touch ID fingerprint scanner on an iPhone. Instead, Apple announced something that's arguably a lot more convenient, albeit targeted at a smaller market: the ability to proximity-unlock your Mac with your Apple Watch. (This does require that the watch has been unlocked first, however. Of course, it may have been auto-unlocked in turn by its companion iPhone.) Trending Articles Apple product recalls & free repair programmes for iPhone,… Having trouble with your iPhone or Mac? Maybe you can get a free repair.… Powered By macOS Sierra vs Mac OS X El Capitan: Auto unlock with Apple Watch Universal Clipboard This addition to the Before getting started, be aware that Sierra has now been superseded by High Sierra, a predictably similar offering but with some key improvements. Read our High Sierra review here. Apple's current Mac operating system is called macOS Sierra, a slight tweak in branding from its Mac OS X predecessors to fit in with the typographical style of iOS, tvOS and watchOS. Sierra has been available to download since September 2016, bringing a raft of new features to the Mac, including the Siri voice-control tech from the iPhone & iPad, and a wide range of system and interface tweaks. Sierra is a free upgrade from El Capitan, the previous OS, so there's no reason not to jump in and grab it, right? Not so fast. You need to check if your Mac is compatible, for one thing, and because it's not easy to go back to an older Mac OS after making the upgrade, it's worth weighing up the changes to your day-to-day user experience. We think you'll want to get Sierra (if so, you'll want to know how to update macOS), but you should always put in some research before making an upgrade like this. So in this article we compare the two products' features, interface and design to help you decide which is a better bet for you. For more information, read our Mac OS X El Capitan review and macOS Sierra review. And if you're interested in the next version of macOS, take a look at our comparison of the features of Sierra and High Sierra. Design & interface Design-wise, El Cap and Sierra are virtually identical. The 'flattened' visuals brought in for Yosemite and retained in El Cap are still present in Sierra. But there are a couple of differences in the user interface of the newer OS. The first and most noticeable: you can use tabs in a wide range of first- and third-party apps, not just your web browser. Apps featuring tabs include Maps, Mail, TextEdit, all three iWork apps and apparently any third-party app that supports multiple windows. macOS Sierra vs Mac OS X El Capitan: Interface In Sierra there's now a picture-in-picture viewing mode, similar to the same-named mode in iOS on the iPad. Picture-in-picture lets you float video from Safari or iTunes in a window over your desktop as you workin Apple's words, and you can pin this video mini-window to one corner of your screen, where it will stay even if you switch Spaces. For more on this, read: How to use Mission Control, Expose, Split Screen & Spaces on the Mac New features The differences between Mac OS X El Capitan and macOS Sierra are largely confined to the features roster - it's what they can do, far more than what they look like. There are lots of new features to consider - take a look at our roundup of new Sierra features for a more comprehensive look - but in this section we'll focus on what we think are the highlights. Siri on the Mac This is the big one. Macs can now be controlled verbally using the Siri voice-recognition engine from the iPad, iPhone, Apple Watch and Apple TV. It was only a matter of time, really - and it's only fair to point out that Windows already has Cortana (and has done since Windows 8.1) - but it's still nice to see. macOS Sierra vs Mac OS X El Capitan: Siri This is particularly useful for searching through documents; you can use natural language to specify various search parameters, and the results sit afterwards in the Notifications pane from where they can be dragged and dropped into applicable apps. We also find it a really quick and easy way to perform tasks you would usually need to go through multiple System Preferences windows to perform. Just say 'Turn on Bluetooth' for example rather than fire up System Preferences. If you want to find out more about what Siri can do on the Mac, read our complete guide to Siri on Mac. macOS Sierra vs Mac OS X El Capitan: Siri Apple Pay on the Mac Apple Pay has jumped from the iOS ecosystem to Mac (via tvOS and watchOS). Most Macs don't have a fingerprint scanner so they can't handle the verification process without using your iPhone or iPad. However, if you have a MacBook Pro with Touch Bar you're in luck. Apple Pay icons now appear on the buy pages of certain merchants - all you need do is verify your purchases with Touch ID on your iPhone, or using your Apple Watch. macOS Sierra vs Mac OS X El Capitan Auto unlock your Mac with your Apple Watch Some Apple fans were hoping that macOS Sierra would bring for the ability to unlock a Mac using the Touch ID fingerprint scanner on an iPhone. Instead, Apple announced something that's arguably a lot more convenient, albeit targeted at a smaller market: the ability to proximity-unlock your Mac with your Apple Watch. (This does require that the watch has been unlocked first, however. Of course, it may have been auto-unlocked in turn by its companion iPhone.) Trending Articles Apple product recalls & free repair programmes for iPhone,… Having trouble with your iPhone or Mac? Maybe you can get a free repair.… Powered By macOS Sierra vs Mac OS X El Capitan: Auto unlock with Apple Watch Universal Clipboard This addition to the";
    private String shortname = "Apurav Chauhan";

    /**
     * We need to change the order of ContentNegotiatingViewResolver because of
     * below issue. https://github.com/spring-projects/spring-boot/issues/546
     */
    @Autowired
    private ContentNegotiatingViewResolver resolver;

    @PostConstruct
    public void init() {
        resolver.setOrder(Ordered.LOWEST_PRECEDENCE);
    }

    public static void main(String[] args) {
        SpringApplication.run(TemplateBenchmark.class, args);
    }

    @Bean
    public HttlViewResolver httlViewResolver() {
        HttlViewResolver resolver = new HttlViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("templates/");
        resolver.setSuffix(".httl");
        resolver.setViewNames("*-httl");
        resolver.setContentType("text/html; charset=UTF-8");
        resolver.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return resolver;
    }
    @Bean
    public ViewResolver vmViewResolver() {
        VelocityLayoutViewResolver bean = new VelocityLayoutViewResolver();
        bean.setCache(true);
        bean.setViewNames("*-vm");
        bean.setPrefix("/templates/");
        bean.setLayoutUrl("/templates/layout.vm");
        bean.setSuffix(".vm");
        return bean;
    }

    @Bean
    public VelocityConfigurer velocityConfig() {
        VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
        velocityConfigurer.setResourceLoaderPath("/");
        return velocityConfigurer;
    }
    @RequestMapping("/")
    public Map<String, Object> get() {
        Date date = new Date();
        Map<String, Object> response = new HashMap<String, Object>(1);
        response.put("date", date);
        return response;
    }
    @RequestMapping("/checkout-ftl")
    public String checkout(Model model,HttpServletResponse response) {
        //System.out.println("HTTL "+response.getBufferSize());
        model.addAttribute("name", shortname);
       // response.setHeader("content-length", "189");
        return "checkout-ftl";
    }
    @RequestMapping("/checkout-vm")
    public String checkoutVM(Model model) {
        model.addAttribute("name", shortname);
        return "checkout-vm";
    }
    @RequestMapping("/checkout-httl")
    public String checkouthttl(Model model,HttpServletResponse response) {
       // System.out.println("HTTL "+response.getBufferSize());
        model.addAttribute("obj", shortname);
        return "checkout-httl";
    }
}