package com.songcloud.song.infrastructure.controller.dto.response;

import com.songcloud.song.domain.model.Song;

import java.util.Map;

public record GetAllSongsResponseDto(Map<Integer, Song> songs) {
}
