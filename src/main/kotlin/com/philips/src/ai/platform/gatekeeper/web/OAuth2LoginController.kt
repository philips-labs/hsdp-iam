package com.philips.src.ai.platform.gatekeeper.web

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class OAuth2LoginController {
    @GetMapping("/")
    fun index(model: Model,
              @RegisteredOAuth2AuthorizedClient authorizedClient: OAuth2AuthorizedClient,
              @AuthenticationPrincipal oauth2User: OAuth2User): String? {
        model.addAttribute("userName", oauth2User.name)
        model.addAttribute("clientName", authorizedClient.clientRegistration.clientName)
        model.addAttribute("userAttributes", oauth2User.attributes)
        return "index"
    }
}